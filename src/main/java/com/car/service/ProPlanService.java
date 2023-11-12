package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface ProPlanService{
	/**
	分页查询生产计划数据总数
	*/
	public Map<String,Integer> getDataListCount(ProPlan queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询生产计划数据列表
	*/
	public Map<String,Object> getDataList(ProPlan queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装生产计划为前台展示的数据形式
	*/
	public Map<String,Object> getProPlanModel(ProPlan model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(ProPlan model,LoginModel login);
	/**
	修改
	*/
	public String update(ProPlan model,LoginModel login);
}
