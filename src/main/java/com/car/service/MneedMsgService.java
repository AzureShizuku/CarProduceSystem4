package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface MneedMsgService{
	/**
	分页查询物料需求单数据总数
	*/
	public Map<String,Integer> getDataListCount(String createDate1,String createDate2,MneedMsg queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询物料需求单数据列表
	*/
	public Map<String,Object> getDataList(String createDate1,String createDate2,MneedMsg queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装物料需求单为前台展示的数据形式
	*/
	public Map<String,Object> getMneedMsgModel(MneedMsg model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(MneedMsg model,LoginModel login);
	/**
	修改
	*/
	public String update(MneedMsg model,LoginModel login);
	/**
	接受申请
	*/
	public String jssq(MneedMsg model,LoginModel login);
	/**
	拒绝申请
	*/
	public String jjsq(MneedMsg model,LoginModel login);
}
