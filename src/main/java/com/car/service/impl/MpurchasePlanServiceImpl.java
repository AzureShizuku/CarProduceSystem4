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
public class MpurchasePlanServiceImpl implements MpurchasePlanService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	MpurchasePlanMapper mpurchasePlanMapper;
	/**
	新增
	*/
	@Override
	public String add(MpurchasePlan model,LoginModel login){
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getPintro()==null||model.getPintro().equals("")){
			return "采购说明为必填属性";
		}
		if(model.getPdetail()==null||model.getPdetail().equals("")){
			return "采购详情为必填属性";
		}
		if(model.getPdetail()!=null){
			String [] fileSplit = model.getPdetail().split(";");
			if(fileSplit.length>1){
				return "采购详情的文件数量不能大于1";
			}
		}
		if(model.getTotalAmount()==null){
			return "采购总额为必填属性";
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		String today = sdf2.format(new Date());
		mpurchasePlanMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(MpurchasePlan model,LoginModel login){
		MpurchasePlan preModel = mpurchasePlanMapper.selectByPrimaryKey(model.getId());
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getPintro()==null||model.getPintro().equals("")){
			return "采购说明为必填属性";
		}
		if(model.getPdetail()==null||model.getPdetail().equals("")){
			return "采购详情为必填属性";
		}
		if(model.getPdetail()!=null){
			String [] fileSplit = model.getPdetail().split(";");
			if(fileSplit.length>1){
				return "采购详情的文件数量不能大于1";
			}
		}
		if(model.getTotalAmount()==null){
			return "采购总额为必填属性";
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		preModel.setTitle(model.getTitle());
		preModel.setPintro(model.getPintro());
		preModel.setPdetail(model.getPdetail());
		preModel.setTotalAmount(model.getTotalAmount());
		preModel.setJfDate(model.getJfDate());
		String today = sdf2.format(new Date());
		mpurchasePlanMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询物料采购计划列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(MpurchasePlan queryModel,Integer pageSize,LoginModel login) {
		MpurchasePlanExample se = new MpurchasePlanExample();
		MpurchasePlanExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getTitle()!=null&&queryModel.getTitle().equals("")==false){
			sc.andTitleLike("%"+queryModel.getTitle()+"%");//模糊查询
		}
		int count = (int)mpurchasePlanMapper.countByExample(se);
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
	*根据参数查询物料采购计划列表数据
	*/
	@Override
	public Map<String,Object> getDataList(MpurchasePlan queryModel,Integer page,Integer pageSize,LoginModel login) {
		MpurchasePlanExample se = new MpurchasePlanExample();
		MpurchasePlanExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getTitle()!=null&&queryModel.getTitle().equals("")==false){
			sc.andTitleLike("%"+queryModel.getTitle()+"%");//模糊查询
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<MpurchasePlan> list = mpurchasePlanMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(MpurchasePlan model:list){
			list2.add(getMpurchasePlanModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装物料采购计划为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getMpurchasePlanModel(MpurchasePlan model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mpurchasePlan",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		mpurchasePlanMapper.deleteByPrimaryKey(id);
	}
}
