package com.car.controller.staff;
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
@RequestMapping("/staff/poutlog")
public class SPoutlogController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	PoutlogService poutlogService;
	@Autowired
	PoutlogMapper poutlogMapper;
	@Autowired
	StaffMsgMapper staffMsgMapper;
	@Autowired
	StockMsgMapper stockMsgMapper;
	public void getList(ModelMap modelMap,LoginModel login){
		StockMsgExample stockMsgE = new StockMsgExample();
		List<StockMsg> stockMsgList=stockMsgMapper.selectByExample(stockMsgE);
		List<Map<String,Object>>  stockMsgList2 = new ArrayList<Map<String,Object>>();
		for(StockMsg m:stockMsgList){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("id",m.getId());
			map.put("name",m.getProNo());
			stockMsgList2.add(map);
		}
		modelMap.addAttribute("stockMsgList",stockMsgList2);
		modelMap.addAttribute("isComfirmList",DataListUtils.getIsComfirmList());//返回is_comfirm列表
	}
	/**
	* 根据查询条件分页查询出库单数据总数
	*/
	@RequestMapping(value="queryCount")
	@ResponseBody
	public Object queryCount(Poutlog model,Integer page,String createDate1,String createDate2,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return poutlogService.getDataListCount(createDate1,createDate2,model,CommonVal.pageSize,login);//分页查询数据总数
	}
	/**
	* 返回出库单列表jsp页面
	*/
	@RequestMapping(value="")
	public String index(ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//获取当前登录账号信息
		StaffMsg staffMsg = staffMsgMapper.selectByPrimaryKey(login.getId());
		modelMap.addAttribute("user",staffMsg);
		getList( modelMap,login);//获取数据列表并返回给前台
		return "staff/poutlog/list";
	}
	/**
	* 根据查询条件分页查询出库单数据，然后返回给前台渲染
	*/
	@RequestMapping(value="queryList")
	@ResponseBody
	public Object toList(Poutlog model,Integer page,String createDate1,String createDate2,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return poutlogService.getDataList(createDate1,createDate2,model,page,CommonVal.pageSize,login);//分页查询数据
	}
	/**
	进入新增页面
	*/
	@RequestMapping("add")
	public String add(ModelMap modelMap,Poutlog model,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//从session中获取当前登录账号
		getList( modelMap,login);//获取前台需要用到的数据列表并返回给前台
		modelMap.addAttribute("data",model);
		return "staff/poutlog/add_page";
	}
	/**
	新增提交信息接口
	*/
	@RequestMapping("add_submit")
	@ResponseBody
	public Object add_submit(Poutlog model,ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		String msg = poutlogService.add(model,login);//执行添加操作
		if(msg.equals("")){
			rs.put("code",1);
			rs.put("msg","新增成功");
			return rs;
		}
		rs.put("code",0);
		rs.put("msg",msg);
		return rs;
	}
	/**
	进入修改页面
	*/
	@RequestMapping("update")
	public String update(ModelMap modelMap,Poutlog model,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//从session中获取当前登录账号
		getList( modelMap,login);//获取前台需要用到的数据列表并返回给前台
		Poutlog data = poutlogMapper.selectByPrimaryKey(model.getId());
		modelMap.addAttribute("data",data);
		return "staff/poutlog/update_page";
	}
	/**
	修改提交信息接口
	*/
	@RequestMapping("update_submit")
	@ResponseBody
	public Object update_submit(Poutlog model,ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		String msg = poutlogService.update(model,login);//执行修改操作
		if(msg.equals("")){
			rs.put("code",1);
			rs.put("msg","修改成功");
			return rs;
		}
		rs.put("code",0);
		rs.put("msg",msg);
		return rs;
	}
	/**
	删除出库单接口
	*/
	@RequestMapping("del1")
	@ResponseBody
	public Object del1(Integer id,ModelMap modelMap,HttpServletRequest request) {
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		poutlogService.delete(id);
		rs.put("code",1);
		rs.put("msg","删除成功");
		return rs;
	}
	@RequestMapping(value = "qr")
	@ResponseBody
	public Object qr(Integer id, ModelMap modelMap,
	HttpServletRequest request, HttpServletResponse response) {
		Map<String, Object> rs = new HashMap<String, Object>();
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Poutlog model = poutlogMapper.selectByPrimaryKey(id);
		if(model==null){
			rs.put("code", 0);
			rs.put("msg","该出库单已不存在");
			return rs;
		}
		StockMsg s = stockMsgMapper.selectByPrimaryKey(model.getStockId());
		if(s.getNum()<model.getOutNum()) {
			rs.put("code", 0);
			rs.put("msg","库存量不足，请先检查矫正库存后操作");
			return rs;
		}
		s.setNum(s.getNum()-model.getOutNum());
		stockMsgMapper.updateByPrimaryKeySelective(s);
		model.setStatus(2);
		poutlogMapper.updateByPrimaryKey(model);
		rs.put("code", 1);
		rs.put("msg","确认成功");
		return rs;
	}
}
