package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface ProRequestService{
	/**
	分页查询生产请求数据总数
	*/
	public Map<String,Integer> getDataListCount(ProRequest queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询生产请求数据列表
	*/
	public Map<String,Object> getDataList(ProRequest queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装生产请求为前台展示的数据形式
	*/
	public Map<String,Object> getProRequestModel(ProRequest model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(ProRequest model,LoginModel login);
	/**
	修改
	*/
	public String update(ProRequest model,LoginModel login);
	/**
	接受申请
	*/
	public String jssq(ProRequest model,LoginModel login);
	/**
	拒绝申请
	*/
	public String jjsq(ProRequest model,LoginModel login);
}
