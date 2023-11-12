package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface SendLogService{
	/**
	分页查询配送单数据总数
	*/
	public Map<String,Integer> getDataListCount(SendLog queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询配送单数据列表
	*/
	public Map<String,Object> getDataList(SendLog queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装配送单为前台展示的数据形式
	*/
	public Map<String,Object> getSendLogModel(SendLog model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(SendLog model,LoginModel login);
	/**
	新增
	*/
	public String add1(SendLog model,LoginModel login);
	/**
	修改
	*/
	public String update(SendLog model,LoginModel login);
	/**
	修改
	*/
	public String update1(SendLog model,LoginModel login);
}
