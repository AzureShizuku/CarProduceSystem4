package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface AdminMsgService{
	/**
	分页查询管理员数据总数
	*/
	public Map<String,Integer> getDataListCount(AdminMsg queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询管理员数据列表
	*/
	public Map<String,Object> getDataList(AdminMsg queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装管理员为前台展示的数据形式
	*/
	public Map<String,Object> getAdminMsgModel(AdminMsg model,LoginModel login);
}
