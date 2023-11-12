package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface ProviderAppService{
	/**
	分页查询供应商申请数据总数
	*/
	public Map<String,Integer> getDataListCount(ProviderApp queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询供应商申请数据列表
	*/
	public Map<String,Object> getDataList(ProviderApp queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装供应商申请为前台展示的数据形式
	*/
	public Map<String,Object> getProviderAppModel(ProviderApp model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(ProviderApp model,LoginModel login);
	/**
	修改
	*/
	public String update(ProviderApp model,LoginModel login);
}
