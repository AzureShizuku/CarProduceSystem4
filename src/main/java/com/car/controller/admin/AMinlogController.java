package com.car.controller.admin;
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
@RequestMapping("/admin/minlog")
public class AMinlogController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	MinlogService minlogService;
	@Autowired
	AdminMsgMapper adminMsgMapper;
	@Autowired
	MaterialInfoMapper materialInfoMapper;
	@Autowired
	MinlogMapper minlogMapper;
	public void getList(ModelMap modelMap,LoginModel login){
		MaterialInfoExample materialInfoE = new MaterialInfoExample();
		List<MaterialInfo> materialInfoList=materialInfoMapper.selectByExample(materialInfoE);
		List<Map<String,Object>>  materialInfoList2 = new ArrayList<Map<String,Object>>();
		for(MaterialInfo m:materialInfoList){
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("id",m.getId());
			map.put("name",m.getMno()+","+m.getMname());
			materialInfoList2.add(map);
		}
		modelMap.addAttribute("materialInfoList",materialInfoList2);
		modelMap.addAttribute("isComfirmList",DataListUtils.getIsComfirmList());//返回is_comfirm列表
	}
	/**
	* 根据查询条件分页查询物料入库单数据总数
	*/
	@RequestMapping(value="queryCount")
	@ResponseBody
	public Object queryCount(Minlog model,Integer page,String createDate1,String createDate2,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return minlogService.getDataListCount(createDate1,createDate2,model,CommonVal.pageSize,login);//分页查询数据总数
	}
	/**
	* 返回物料入库单列表jsp页面
	*/
	@RequestMapping(value="")
	public String index(ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//获取当前登录账号信息
		AdminMsg adminMsg = adminMsgMapper.selectByPrimaryKey(login.getId());
		modelMap.addAttribute("user",adminMsg);
		getList( modelMap,login);//获取数据列表并返回给前台
		return "admin/minlog/list";
	}
	/**
	* 根据查询条件分页查询物料入库单数据，然后返回给前台渲染
	*/
	@RequestMapping(value="queryList")
	@ResponseBody
	public Object toList(Minlog model,Integer page,String createDate1,String createDate2,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		return minlogService.getDataList(createDate1,createDate2,model,page,CommonVal.pageSize,login);//分页查询数据
	}
	/**
	删除物料入库单接口
	*/
	@RequestMapping("del")
	@ResponseBody
	public Object del(Integer id,ModelMap modelMap,HttpServletRequest request) {
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Map<String,Object> rs = new HashMap<String,Object>();
		minlogService.delete(id);
		rs.put("code",1);
		rs.put("msg","删除成功");
		return rs;
	}
}
