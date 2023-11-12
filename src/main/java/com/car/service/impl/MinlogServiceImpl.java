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
public class MinlogServiceImpl implements MinlogService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	MaterialInfoMapper materialInfoMapper;
	@Autowired
	MinlogMapper minlogMapper;
	/**
	新增
	*/
	@Override
	public String add(Minlog model,LoginModel login){
		if(model.getMaterialId()==null){
			return "物料ID为必填属性";
		}
		if(model.getNum()==null){
			return "入库数量为必填属性";
		}
		if(model.getInRemark()==null||model.getInRemark().equals("")){
			return "入库备注为必填属性";
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		model.setIsComfirm(1);//默认未确认,
		minlogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(Minlog model,LoginModel login){
		Minlog preModel = minlogMapper.selectByPrimaryKey(model.getId());
		if(model.getMaterialId()==null){
			return "物料ID为必填属性";
		}
		if(model.getNum()==null){
			return "入库数量为必填属性";
		}
		if(model.getInRemark()==null||model.getInRemark().equals("")){
			return "入库备注为必填属性";
		}
		preModel.setMaterialId(model.getMaterialId());
		preModel.setNum(model.getNum());
		preModel.setInRemark(model.getInRemark());
		minlogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询物料入库单列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(String createDate1,String createDate2,Minlog queryModel,Integer pageSize,LoginModel login) {
		MinlogExample se = new MinlogExample();
		MinlogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getMaterialId()!=null){
			sc.andMaterialIdEqualTo(queryModel.getMaterialId());//查询物料ID等于指定值
		}
		if(createDate1!=null&&createDate1.equals("")==false){
			sc.andCreateDateGreaterThanOrEqualTo(createDate1);
		}
		if(createDate2!=null&&createDate2.equals("")==false){
			sc.andCreateDateLessThanOrEqualTo(createDate2);
		}
		if(queryModel.getIsComfirm()!=null){
			sc.andIsComfirmEqualTo(queryModel.getIsComfirm());//查询是否确认等于指定值
		}
		int count = (int)minlogMapper.countByExample(se);
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
	*根据参数查询物料入库单列表数据
	*/
	@Override
	public Map<String,Object> getDataList(String createDate1,String createDate2,Minlog queryModel,Integer page,Integer pageSize,LoginModel login) {
		MinlogExample se = new MinlogExample();
		MinlogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getMaterialId()!=null){
			sc.andMaterialIdEqualTo(queryModel.getMaterialId());//查询物料ID等于指定值
		}
		if(createDate1!=null&&createDate1.equals("")==false){
			sc.andCreateDateGreaterThanOrEqualTo(createDate1);
		}
		if(createDate2!=null&&createDate2.equals("")==false){
			sc.andCreateDateLessThanOrEqualTo(createDate2);
		}
		if(queryModel.getIsComfirm()!=null){
			sc.andIsComfirmEqualTo(queryModel.getIsComfirm());//查询是否确认等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<Minlog> list = minlogMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(Minlog model:list){
			list2.add(getMinlogModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装物料入库单为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getMinlogModel(Minlog model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("minlog",model);
		if(model.getMaterialId()!=null){
			MaterialInfo materialInfo = materialInfoMapper.selectByPrimaryKey(model.getMaterialId());//物料ID为外接字段，需要关联物料台账来解释该字段
			if(materialInfo!=null){
				map.put("materialIdStr",materialInfo.getMno()+"，"+materialInfo.getMname());
			}
		}
		map.put("isComfirmStr",DataListUtils.getIsComfirmNameById(model.getIsComfirm()+""));//解释是否确认字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		minlogMapper.deleteByPrimaryKey(id);
	}
}
