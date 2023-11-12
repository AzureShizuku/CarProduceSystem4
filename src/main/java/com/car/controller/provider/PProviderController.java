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
@RequestMapping("/provider/provider")
public class PProviderController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	@Autowired
	ProviderService providerService;
	@Autowired
	ProviderMapper providerMapper;
	public void getList(ModelMap modelMap,LoginModel login){
		modelMap.addAttribute("evalTypeList",DataListUtils.getEvalTypeList());//返回eval_type列表
	}
	/**
	进入供应商详情页
	*/
	@RequestMapping("detail")
	public Object detail(ModelMap modelMap,HttpServletRequest request) {
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);
		Provider model = new Provider();
		model.setId(login.getId());
		Provider preModel = providerMapper.selectByPrimaryKey(login.getId());
		modelMap.addAttribute("detail",providerService.getProviderModel(preModel,login));
		return "provider/personal";
	}
}
