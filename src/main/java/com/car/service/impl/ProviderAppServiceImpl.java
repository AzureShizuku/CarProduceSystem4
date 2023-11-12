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
public class ProviderAppServiceImpl implements ProviderAppService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	ProviderAppMapper providerAppMapper;
	/**
	新增
	*/
	@Override
	public String add(ProviderApp model,LoginModel login){
		if(model.getName()==null||model.getName().equals("")){
			return "厂家名为必填属性";
		}
		if(model.getContactName()==null||model.getContactName().equals("")){
			return "联系人为必填属性";
		}
		if(model.getCelcontact_()==null||model.getCelcontact_().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelcontact_()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelcontact_());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "地址为必填属性";
		}
		if(model.getGm()==null||model.getGm().equals("")){
			return "厂家规模为必填属性";
		}
		if(model.getProNames()==null||model.getProNames().equals("")){
			return "生产产品为必填属性";
		}
		if(model.getProDetail()==null||model.getProDetail().equals("")){
			return "产品报价单为必填属性";
		}
		if(model.getProDetail()!=null){
			String [] fileSplit = model.getProDetail().split(";");
			if(fileSplit.length>1){
				return "产品报价单的文件数量不能大于1";
			}
		}
		if(model.getEvalType()==null){
			return "评价等级为必填属性";
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		providerAppMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(ProviderApp model,LoginModel login){
		ProviderApp preModel = providerAppMapper.selectByPrimaryKey(model.getId());
		if(model.getName()==null||model.getName().equals("")){
			return "厂家名为必填属性";
		}
		if(model.getContactName()==null||model.getContactName().equals("")){
			return "联系人为必填属性";
		}
		if(model.getCelcontact_()==null||model.getCelcontact_().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelcontact_()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelcontact_());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "地址为必填属性";
		}
		if(model.getGm()==null||model.getGm().equals("")){
			return "厂家规模为必填属性";
		}
		if(model.getProNames()==null||model.getProNames().equals("")){
			return "生产产品为必填属性";
		}
		if(model.getProDetail()==null||model.getProDetail().equals("")){
			return "产品报价单为必填属性";
		}
		if(model.getProDetail()!=null){
			String [] fileSplit = model.getProDetail().split(";");
			if(fileSplit.length>1){
				return "产品报价单的文件数量不能大于1";
			}
		}
		if(model.getEvalType()==null){
			return "评价等级为必填属性";
		}
		preModel.setName(model.getName());
		preModel.setContactName(model.getContactName());
		preModel.setCelcontact_(model.getCelcontact_());
		preModel.setAddress(model.getAddress());
		preModel.setGm(model.getGm());
		preModel.setProNames(model.getProNames());
		preModel.setProDetail(model.getProDetail());
		preModel.setEvalType(model.getEvalType());
		providerAppMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询供应商申请列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(ProviderApp queryModel,Integer pageSize,LoginModel login) {
		ProviderAppExample se = new ProviderAppExample();
		ProviderAppExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getEvalType()!=null){
			sc.andEvalTypeEqualTo(queryModel.getEvalType());//查询评价等级等于指定值
		}
		int count = (int)providerAppMapper.countByExample(se);
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
	*根据参数查询供应商申请列表数据
	*/
	@Override
	public Map<String,Object> getDataList(ProviderApp queryModel,Integer page,Integer pageSize,LoginModel login) {
		ProviderAppExample se = new ProviderAppExample();
		ProviderAppExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getName()!=null&&queryModel.getName().equals("")==false){
			sc.andNameLike("%"+queryModel.getName()+"%");//模糊查询
		}
		if(queryModel.getEvalType()!=null){
			sc.andEvalTypeEqualTo(queryModel.getEvalType());//查询评价等级等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<ProviderApp> list = providerAppMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(ProviderApp model:list){
			list2.add(getProviderAppModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装供应商申请为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getProviderAppModel(ProviderApp model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("providerApp",model);
		map.put("evalTypeStr",DataListUtils.getEvalTypeNameById(model.getEvalType()+""));//解释评价等级字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		providerAppMapper.deleteByPrimaryKey(id);
	}
}
