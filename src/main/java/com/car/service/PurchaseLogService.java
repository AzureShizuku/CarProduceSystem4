package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface PurchaseLogService{
	/**
	分页查询订货单数据总数
	*/
	public Map<String,Integer> getDataListCount(PurchaseLog queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询订货单数据列表
	*/
	public Map<String,Object> getDataList(PurchaseLog queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装订货单为前台展示的数据形式
	*/
	public Map<String,Object> getPurchaseLogModel(PurchaseLog model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(PurchaseLog model,LoginModel login);
	/**
	修改
	*/
	public String update(PurchaseLog model,LoginModel login);
	/**
	接受申请
	*/
	public String jssq(PurchaseLog model,LoginModel login);
	/**
	拒绝申请
	*/
	public String jjsq(PurchaseLog model,LoginModel login);
}
