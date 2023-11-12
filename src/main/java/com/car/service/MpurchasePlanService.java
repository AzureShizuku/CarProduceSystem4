package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface MpurchasePlanService{
	/**
	分页查询物料采购计划数据总数
	*/
	public Map<String,Integer> getDataListCount(MpurchasePlan queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询物料采购计划数据列表
	*/
	public Map<String,Object> getDataList(MpurchasePlan queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装物料采购计划为前台展示的数据形式
	*/
	public Map<String,Object> getMpurchasePlanModel(MpurchasePlan model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(MpurchasePlan model,LoginModel login);
	/**
	修改
	*/
	public String update(MpurchasePlan model,LoginModel login);
}
