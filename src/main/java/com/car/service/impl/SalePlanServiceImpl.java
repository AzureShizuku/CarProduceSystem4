package com.car.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.car.dao.*;
import com.car.model.*;
import com.car.service.*;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import com.car.util.*;
import org.springframework.ui.ModelMap;
import java.util.*;
import com.car.service.*;
import com.car.controller.LoginModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.io.IOException;
@Service
public class SalePlanServiceImpl implements SalePlanService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	SalePlanMapper salePlanMapper;
	/**
	新增
	*/
	@Override
	public String add(SalePlan model,LoginModel login){
		if(model.getPlanName()==null||model.getPlanName().equals("")){
			return "计划名为必填属性";
		}
		if(model.getPlanDetail()==null||model.getPlanDetail().equals("")){
			return "计划详情为必填属性";
		}
		if(model.getKsDate()==null||model.getKsDate().equals("")){
			return "开始日期为必填属性";
		}
		if(model.getJsDate()==null||model.getJsDate().equals("")){
			return "结束日期为必填属性";
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		String today = sdf2.format(new Date());
		if(model.getKsDate().compareTo(today)<0){
			return "开始日期不能小于今日日期";
		}
		if(model.getJsDate().compareTo(today)<0){
			return "结束日期不能小于今日日期";
		}
		if(model.getKsDate()!=null&&model.getJsDate()!=null&&model.getKsDate().compareTo(model.getJsDate())>0){
			return "开始日期不能大于结束日期";
		}
		salePlanMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(SalePlan model,LoginModel login){
		SalePlan preModel = salePlanMapper.selectByPrimaryKey(model.getId());
		if(model.getPlanName()==null||model.getPlanName().equals("")){
			return "计划名为必填属性";
		}
		if(model.getPlanDetail()==null||model.getPlanDetail().equals("")){
			return "计划详情为必填属性";
		}
		if(model.getKsDate()==null||model.getKsDate().equals("")){
			return "开始日期为必填属性";
		}
		if(model.getJsDate()==null||model.getJsDate().equals("")){
			return "结束日期为必填属性";
		}
		preModel.setPlanName(model.getPlanName());
		preModel.setPlanDetail(model.getPlanDetail());
		preModel.setKsDate(model.getKsDate());
		preModel.setJsDate(model.getJsDate());
		String today = sdf2.format(new Date());
		if(preModel.getKsDate().compareTo(today)<0){
			return "开始日期不能小于今日日期";
		}
		if(preModel.getJsDate().compareTo(today)<0){
			return "结束日期不能小于今日日期";
		}
		if(preModel.getKsDate()!=null&&preModel.getJsDate()!=null&&preModel.getKsDate().compareTo(preModel.getJsDate())>0){
			return "开始日期不能大于结束日期";
		}
		salePlanMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询销售计划列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(SalePlan queryModel,Integer pageSize,LoginModel login) {
		SalePlanExample se = new SalePlanExample();
		SalePlanExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getPlanName()!=null&&queryModel.getPlanName().equals("")==false){
			sc.andPlanNameLike("%"+queryModel.getPlanName()+"%");//模糊查询
		}
		int count = (int)salePlanMapper.countByExample(se);
		int totalPage = 0;
		if ((count > 0) && ((count % pageSize) == 0)) {
			totalPage = count / pageSize;
		} else {
			totalPage = (count / pageSize) + 1;
		}
		Map<String,Integer> rs = new HashMap<String,Integer>();
		rs.put("count",count);//数据总数
		rs.put("totalPage",totalPage);//总页数
		return rs;
	}
	/**
	*根据参数查询销售计划列表数据
	*/
	@Override
	public Map<String,Object> getDataList(SalePlan queryModel,Integer page,Integer pageSize,LoginModel login) {
		SalePlanExample se = new SalePlanExample();
		SalePlanExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getPlanName()!=null&&queryModel.getPlanName().equals("")==false){
			sc.andPlanNameLike("%"+queryModel.getPlanName()+"%");//模糊查询
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<SalePlan> list = salePlanMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(SalePlan model:list){
			list2.add(getSalePlanModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装销售计划为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getSalePlanModel(SalePlan model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("salePlan",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		salePlanMapper.deleteByPrimaryKey(id);
	}
}
