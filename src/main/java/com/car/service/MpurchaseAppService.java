package com.car.service;
import java.util.Map;
import com.car.controller.LoginModel;
import com.car.model.*;
import java.io.InputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface MpurchaseAppService{
	/**
	分页查询物料申购单数据总数
	*/
	public Map<String,Integer> getDataListCount(MpurchaseApp queryModel,Integer pageSize,LoginModel login) ;
	/**
	分页查询物料申购单数据列表
	*/
	public Map<String,Object> getDataList(MpurchaseApp queryModel,Integer page,Integer pageSize,LoginModel login) ;
	/**
	封装物料申购单为前台展示的数据形式
	*/
	public Map<String,Object> getMpurchaseAppModel(MpurchaseApp model,LoginModel login);
	/**
	* 删除数据
	*/
	public void delete(Integer id);
	/**
	新增
	*/
	public String add(MpurchaseApp model,LoginModel login);
	/**
	修改
	*/
	public String update(MpurchaseApp model,LoginModel login);
	/**
	接受申请
	*/
	public String jssq(MpurchaseApp model,LoginModel login);
	/**
	拒绝申请
	*/
	public String jjsq(MpurchaseApp model,LoginModel login);
}
