package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface StaffMsgService{
	/**
	分页查询员工数据总数
	*/
	public Map<String,Integer> getDataListCount(StaffMsg queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询员工数据列表
	*/
	public Map<String,Object> getDataList(StaffMsg queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装员工为前台展示的数据形式
	*/
	public Map<String,Object> getStaffMsgModel(StaffMsg model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(StaffMsg model,LoginModel login);
	/**
	修改
	*/
	public String update(StaffMsg model,LoginModel login);
	/**
	修改
	*/
	public String update1(StaffMsg model,LoginModel login);
}
