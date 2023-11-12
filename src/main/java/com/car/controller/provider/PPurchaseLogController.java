package com.car.controller.provider;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.IOException;
import com.car.dao.*;
import com.car.model.*;
import com.car.service.impl.*;
import com.car.util.*;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import java.util.ArrayList;
import com.car.controller.LoginModel;
import com.car.service.*;
@Controller
@RequestMapping("/provider/purchase_log")
public class PPurchaseLogController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	PurchaseLogService purchaseLogService;
	@Autowired
	ProviderMapper providerMapper;
	@Autowired
	PurchaseLogMapper purchaseLogMapper;
	public void getList(ModelMap modelMap,LoginModel login){
		modelMap.addAttribute("needStatusList",DataListUtils.getNeedStatusList());//返回need_status列表
		modelMap.addAttribute("purchaseStatusList",DataListUtils.getPurchaseStatusList());//返回purchase_status列表
	}
	/**
	* 根据查询条件分页查询订货单数据总数
	*/
	@RequestMapping(value="queryCount")
	@ResponseBody
	public Object queryCount(PurchaseLog model,Integer page,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return purchaseLogService.getDataListCount(model,CommonVal.pageSize,login);//分页查询数据总数
	}
	/**
	* 返回订货单列表jsp页面
	*/
	@RequestMapping(value="")
	public String index(ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//获取当前登录账号信息
		Provider provider = providerMapper.selectByPrimaryKey(login.getId());
		modelMap.addAttribute("user",provider);
		getList( modelMap,login);//获取数据列表并返回给前台
		return "provider/purchase_log/list";
	}
	/**
	* 根据查询条件分页查询订货单数据，然后返回给前台渲染
	*/
	@RequestMapping(value="queryList")
	@ResponseBody
	public Object toList(PurchaseLog model,Integer page,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return purchaseLogService.getDataList(model,page,CommonVal.pageSize,login);//分页查询数据
	}
	/**
	进入接受申请页面
	*/
	@RequestMapping("jssq")
	public String jssq(ModelMap modelMap,PurchaseLog model,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//从session中获取当前登录账号
		getList( modelMap,login);//获取前台需要用到的数据列表并返回给前台
		PurchaseLog data = purchaseLogMapper.selectByPrimaryKey(model.getId());
		modelMap.addAttribute("data",data);
		return "provider/purchase_log/jssq_page";
	}
	/**
	接受申请提交信息接口
	*/
	@RequestMapping("jssq_submit")
	@ResponseBody
	public Object jssq_submit(PurchaseLog model,ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		String msg = purchaseLogService.jssq(model,login);//执行修改操作
		if(msg.equals("")){
			rs.put("code",1);
			rs.put("msg","接受申请成功");
			return rs;
		}
		rs.put("code",0);
		rs.put("msg",msg);
		return rs;
	}
	/**
	进入拒绝申请页面
	*/
	@RequestMapping("jjsq")
	public String jjsq(ModelMap modelMap,PurchaseLog model,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//从session中获取当前登录账号
		getList( modelMap,login);//获取前台需要用到的数据列表并返回给前台
		PurchaseLog data = purchaseLogMapper.selectByPrimaryKey(model.getId());
		modelMap.addAttribute("data",data);
		return "provider/purchase_log/jjsq_page";
	}
	/**
	拒绝申请提交信息接口
	*/
	@RequestMapping("jjsq_submit")
	@ResponseBody
	public Object jjsq_submit(PurchaseLog model,ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		String msg = purchaseLogService.jjsq(model,login);//执行修改操作
		if(msg.equals("")){
			rs.put("code",1);
			rs.put("msg","拒绝申请成功");
			return rs;
		}
		rs.put("code",0);
		rs.put("msg",msg);
		return rs;
	}
}
