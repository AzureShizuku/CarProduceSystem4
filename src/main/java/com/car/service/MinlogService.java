package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface MinlogService{
	/**
	分页查询物料入库单数据总数
	*/
	public Map<String,Integer> getDataListCount(String createDate1,String createDate2,Minlog queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询物料入库单数据列表
	*/
	public Map<String,Object> getDataList(String createDate1,String createDate2,Minlog queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装物料入库单为前台展示的数据形式
	*/
	public Map<String,Object> getMinlogModel(Minlog model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(Minlog model,LoginModel login);
	/**
	修改
	*/
	public String update(Minlog model,LoginModel login);
}
