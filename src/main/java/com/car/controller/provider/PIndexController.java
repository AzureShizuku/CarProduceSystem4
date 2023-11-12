package com.car.controller.provider;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.car.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import com.car.controller.LoginModel;
import com.car.util.CommonVal;
import  com.car.model.*;
import com.car.dao.*;
import java.text.SimpleDateFormat;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;
@Controller
@RequestMapping("/provider/index")
public class PIndexController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	@Autowired
	ProviderMapper providerMapper;
	/**
	供应商角色进入管理首页接口
	*/
	@RequestMapping(value="")
	public String index(ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Provider user = providerMapper.selectByPrimaryKey(login.getId());
		modelMap.addAttribute("user", user);
		modelMap.addAttribute("roleName", "供应商");
		modelMap.addAttribute("login", login);
		return "provider/index";
	}
}
