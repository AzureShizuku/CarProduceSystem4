package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface MaterialInfoService{
	/**
	分页查询物料台账数据总数
	*/
	public Map<String,Integer> getDataListCount(MaterialInfo queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询物料台账数据列表
	*/
	public Map<String,Object> getDataList(MaterialInfo queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装物料台账为前台展示的数据形式
	*/
	public Map<String,Object> getMaterialInfoModel(MaterialInfo model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(MaterialInfo model,LoginModel login);
	/**
	新增
	*/
	public String add1(MaterialInfo model,LoginModel login);
	/**
	修改
	*/
	public String update(MaterialInfo model,LoginModel login);
	/**
	修改
	*/
	public String update1(MaterialInfo model,LoginModel login);
}
