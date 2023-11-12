package com.car.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;
import java.io.IOException;
import com.car.dao.*;
import com.car.model.*;
import com.car.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Comparator;
import java.text.DecimalFormat;
@Controller
@RequestMapping("/commonapi/home")
public class HomeController{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	DecimalFormat df = new DecimalFormat("0.0");
	@Autowired
	ProviderMapper providerMapper;
	@Autowired
	SaleLogMapper saleLogMapper;
	@Autowired
	StockMsgMapper stockMsgMapper;
	@Autowired
	PurchaseLogMapper purchaseLogMapper;
	/**
	* 首页数据统计：
	* 统计库存台账数
	* 统计订货支出
	* 统计销售收入
	* 统计供应商数
	**/
	@RequestMapping(value="")
	public String index(ModelMap modelMap,HttpServletRequest request){
		LoginModel login = (LoginModel) request.getSession().getAttribute(CommonVal.sessionName);//获取当前登录账号信息
		//获取库存台账数
		StockMsgExample qe = new StockMsgExample();
		List<StockMsg> ql = stockMsgMapper.selectByExample(qe);//获取查询结果
		Integer qlData = 0;
		for(StockMsg model:ql){
			qlData+=model.getNum();
		}
		modelMap.addAttribute("qlData",qlData);
		//获取订货支出
		PurchaseLogExample qe1 = new PurchaseLogExample();
		List<PurchaseLog> ql1 = purchaseLogMapper.selectByExample(qe1);//获取查询结果
		Double ql1Data = 0.0;
		for(PurchaseLog model:ql1){
			ql1Data+=model.getTotalAmount();
		}
		modelMap.addAttribute("ql1Data",df.format(ql1Data));
		//获取销售收入
		SaleLogExample qe2 = new SaleLogExample();
		List<SaleLog> ql2 = saleLogMapper.selectByExample(qe2);//获取查询结果
		Double ql2Data = 0.0;
		for(SaleLog model:ql2){
			ql2Data+=model.getAmount();
		}
		modelMap.addAttribute("ql2Data",df.format(ql2Data));
		//获取供应商数
		ProviderExample qe3 = new ProviderExample();
		List<Provider> ql3 = providerMapper.selectByExample(qe3);//获取查询结果
		Integer ql3Data =ql3.size();
		modelMap.addAttribute("ql3Data",ql3Data);
		return "home";
	}
}
