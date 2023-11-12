package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface MoutlogService{
	/**
	分页查询物料出库数据总数
	*/
	public Map<String,Integer> getDataListCount(Moutlog queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询物料出库数据列表
	*/
	public Map<String,Object> getDataList(Moutlog queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装物料出库为前台展示的数据形式
	*/
	public Map<String,Object> getMoutlogModel(Moutlog model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(Moutlog model,LoginModel login);
	/**
	修改
	*/
	public String update(Moutlog model,LoginModel login);
}
