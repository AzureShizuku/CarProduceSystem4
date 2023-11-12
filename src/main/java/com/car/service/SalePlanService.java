package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface SalePlanService{
	/**
	分页查询销售计划数据总数
	*/
	public Map<String,Integer> getDataListCount(SalePlan queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询销售计划数据列表
	*/
	public Map<String,Object> getDataList(SalePlan queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装销售计划为前台展示的数据形式
	*/
	public Map<String,Object> getSalePlanModel(SalePlan model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(SalePlan model,LoginModel login);
	/**
	修改
	*/
	public String update(SalePlan model,LoginModel login);
}
