package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface SaleLogService{
	/**
	分页查询销售订单数据总数
	*/
	public Map<String,Integer> getDataListCount(SaleLog queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询销售订单数据列表
	*/
	public Map<String,Object> getDataList(SaleLog queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装销售订单为前台展示的数据形式
	*/
	public Map<String,Object> getSaleLogModel(SaleLog model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(SaleLog model,LoginModel login);
	/**
	修改
	*/
	public String update(SaleLog model,LoginModel login);
	/**
	导出销售订单数据
	*/
	public void exportSale(HttpServletRequest request, HttpServletResponse response,Map<String,Object> data,LoginModel login);
}
