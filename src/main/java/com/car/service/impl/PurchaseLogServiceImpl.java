package com.car.service.impl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.car.dao.*;
import com.car.model.*;
import com.car.service.*;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import com.car.util.*;
import org.springframework.ui.ModelMap;
import java.util.*;
import com.car.service.*;
import com.car.controller.LoginModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.io.IOException;
@Service
public class PurchaseLogServiceImpl implements PurchaseLogService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	ProviderMapper providerMapper;
	@Autowired
	PurchaseLogMapper purchaseLogMapper;
	/**
	新增
	*/
	@Override
	public String add(PurchaseLog model,LoginModel login){
		if(model.getName()==null||model.getName().equals("")){
			return "物料名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getJsbz()==null||model.getJsbz().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getSl()==null){
			return "数量为必填属性";
		}
		if(model.getPrice()==null){
			return "采购价格为必填属性";
		}
		if(model.getTotalAmount()==null){
			return "总金额为必填属性";
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		if(model.getProviderId()==null){
			return "供应商ID为必填属性";
		}
		model.setNo(sdf3.format(new Date())+RandomCodeUtils.getRandomCode());//随机码(当前时间+6位随机码)
		model.setCheckStatus(1);//默认已申请,
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		model.setPurchaseStatus(1);//默认未到货,
		String today = sdf2.format(new Date());
		purchaseLogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(PurchaseLog model,LoginModel login){
		PurchaseLog preModel = purchaseLogMapper.selectByPrimaryKey(model.getId());
		if(model.getName()==null||model.getName().equals("")){
			return "物料名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getJsbz()==null||model.getJsbz().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getSl()==null){
			return "数量为必填属性";
		}
		if(model.getPrice()==null){
			return "采购价格为必填属性";
		}
		if(model.getTotalAmount()==null){
			return "总金额为必填属性";
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		if(model.getProviderId()==null){
			return "供应商ID为必填属性";
		}
		preModel.setName(model.getName());
		preModel.setGg(model.getGg());
		preModel.setDw(model.getDw());
		preModel.setJsbz(model.getJsbz());
		preModel.setSl(model.getSl());
		preModel.setPrice(model.getPrice());
		preModel.setTotalAmount(model.getTotalAmount());
		preModel.setJfDate(model.getJfDate());
		preModel.setProviderId(model.getProviderId());
		String today = sdf2.format(new Date());
		purchaseLogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	接受申请
	*/
	@Override
	public String jssq(PurchaseLog model,LoginModel login){
		PurchaseLog preModel = purchaseLogMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCheckStatus(2);//审核状态设置为已接受申请
		preModel.setCheckRemark(model.getCheckRemark());
		purchaseLogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	拒绝申请
	*/
	@Override
	public String jjsq(PurchaseLog model,LoginModel login){
		PurchaseLog preModel = purchaseLogMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCheckStatus(3);//审核状态设置为已拒绝申请
		preModel.setCheckRemark(model.getCheckRemark());
		purchaseLogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询订货单列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(PurchaseLog queryModel,Integer pageSize,LoginModel login) {
		PurchaseLogExample se = new PurchaseLogExample();
		PurchaseLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getNo()!=null&&queryModel.getNo().equals("")==false){
			sc.andNoLike("%"+queryModel.getNo()+"%");//模糊查询
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getCheckStatus()!=null){
			sc.andCheckStatusEqualTo(queryModel.getCheckStatus());//查询审核状态等于指定值
		}
		if(queryModel.getPurchaseStatus()!=null){
			sc.andPurchaseStatusEqualTo(queryModel.getPurchaseStatus());//查询订货单类型等于指定值
		}
		int count = (int)purchaseLogMapper.countByExample(se);
		int totalPage = 0;
		if ((count > 0) && ((count % pageSize) == 0)) {
			totalPage = count / pageSize;
		} else {
			totalPage = (count / pageSize) + 1;
		}
		Map<String,Integer> rs = new HashMap<String,Integer>();
		rs.put("count",count);//数据总数
		rs.put("totalPage",totalPage);//总页数
		return rs;
	}
	/**
	*根据参数查询订货单列表数据
	*/
	@Override
	public Map<String,Object> getDataList(PurchaseLog queryModel,Integer page,Integer pageSize,LoginModel login) {
		PurchaseLogExample se = new PurchaseLogExample();
		PurchaseLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getNo()!=null&&queryModel.getNo().equals("")==false){
			sc.andNoLike("%"+queryModel.getNo()+"%");//模糊查询
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getCheckStatus()!=null){
			sc.andCheckStatusEqualTo(queryModel.getCheckStatus());//查询审核状态等于指定值
		}
		if(queryModel.getPurchaseStatus()!=null){
			sc.andPurchaseStatusEqualTo(queryModel.getPurchaseStatus());//查询订货单类型等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<PurchaseLog> list = purchaseLogMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(PurchaseLog model:list){
			list2.add(getPurchaseLogModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装订货单为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getPurchaseLogModel(PurchaseLog model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("purchaseLog",model);
		map.put("checkStatusStr",DataListUtils.getNeedStatusNameById(model.getCheckStatus()+""));//解释审核状态字段
		if(model.getProviderId()!=null){
			Provider provider = providerMapper.selectByPrimaryKey(model.getProviderId());//供应商ID为外接字段，需要关联供应商来解释该字段
			if(provider!=null){
				map.put("providerIdStr",provider.getLoginName());
			}
		}
		map.put("purchaseStatusStr",DataListUtils.getPurchaseStatusNameById(model.getPurchaseStatus()+""));//解释订货单类型字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		purchaseLogMapper.deleteByPrimaryKey(id);
	}
}
