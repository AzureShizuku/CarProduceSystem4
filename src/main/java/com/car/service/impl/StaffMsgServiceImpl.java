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
public class StaffMsgServiceImpl implements StaffMsgService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	StaffMsgMapper staffMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(StaffMsg model,LoginModel login){
		if(model.getStaffNo()==null||model.getStaffNo().equals("")){
			return "员工号为必填属性";
		}
		if(model.getStaffNo()!=null){
			StaffMsgExample te=new StaffMsgExample();
			StaffMsgExample.Criteria tc=te.createCriteria();
			tc.andStaffNoEqualTo(model.getStaffNo());
			int count = (int)staffMsgMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 员工号 ,请重新填写";
			}
		}
		if(model.getPassword()==null||model.getPassword().equals("")){
			return "密码为必填属性";
		}
		if(model.getRealName()==null||model.getRealName().equals("")){
			return "姓名为必填属性";
		}
		if(model.getCelPhone()==null||model.getCelPhone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelPhone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelPhone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		if(model.getStaffType()==null){
			return "权限类型为必填属性";
		}
		model.setCreateTime(sdf1.format(new Date()));//当前时间格式
		staffMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(StaffMsg model,LoginModel login){
		StaffMsg preModel = staffMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getStaffNo()==null||model.getStaffNo().equals("")){
			return "员工号为必填属性";
		}
		if(model.getStaffNo()!=null){
			StaffMsgExample te=new StaffMsgExample();
			StaffMsgExample.Criteria tc=te.createCriteria();
			tc.andStaffNoEqualTo(model.getStaffNo());
			tc.andIdNotEqualTo(model.getId());
			int count = (int)staffMsgMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 员工号 ,请重新填写";
			}
		}
		if(model.getPassword()==null||model.getPassword().equals("")){
			return "密码为必填属性";
		}
		if(model.getRealName()==null||model.getRealName().equals("")){
			return "姓名为必填属性";
		}
		if(model.getCelPhone()==null||model.getCelPhone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelPhone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelPhone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		if(model.getStaffType()==null){
			return "权限类型为必填属性";
		}
		preModel.setStaffNo(model.getStaffNo());
		preModel.setPassword(model.getPassword());
		preModel.setRealName(model.getRealName());
		preModel.setCelPhone(model.getCelPhone());
		preModel.setEmail(model.getEmail());
		preModel.setStaffType(model.getStaffType());
		staffMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(StaffMsg model,LoginModel login){
		StaffMsg preModel = staffMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getRealName()==null||model.getRealName().equals("")){
			return "姓名为必填属性";
		}
		if(model.getCelPhone()==null||model.getCelPhone().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getCelPhone()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getCelPhone());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getEmail()==null||model.getEmail().equals("")){
			return "邮箱为必填属性";
		}
		if(model.getEmail()!=null){
		Pattern p = Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$");
			Matcher m = p.matcher(model.getEmail());
			if( m.matches()==false){
				return "请输入正确的邮箱";
			}
		}
		preModel.setRealName(model.getRealName());
		preModel.setCelPhone(model.getCelPhone());
		preModel.setEmail(model.getEmail());
		staffMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询员工列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(StaffMsg queryModel,Integer pageSize,LoginModel login) {
		StaffMsgExample se = new StaffMsgExample();
		StaffMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getStaffNo()!=null&&queryModel.getStaffNo().equals("")==false){
			sc.andStaffNoLike("%"+queryModel.getStaffNo()+"%");//模糊查询
		}
		if(queryModel.getRealName()!=null&&queryModel.getRealName().equals("")==false){
			sc.andRealNameLike("%"+queryModel.getRealName()+"%");//模糊查询
		}
		if(queryModel.getStaffType()!=null){
			sc.andStaffTypeEqualTo(queryModel.getStaffType());//查询权限类型等于指定值
		}
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		int count = (int)staffMsgMapper.countByExample(se);
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
	*根据参数查询员工列表数据
	*/
	@Override
	public Map<String,Object> getDataList(StaffMsg queryModel,Integer page,Integer pageSize,LoginModel login) {
		StaffMsgExample se = new StaffMsgExample();
		StaffMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getStaffNo()!=null&&queryModel.getStaffNo().equals("")==false){
			sc.andStaffNoLike("%"+queryModel.getStaffNo()+"%");//模糊查询
		}
		if(queryModel.getRealName()!=null&&queryModel.getRealName().equals("")==false){
			sc.andRealNameLike("%"+queryModel.getRealName()+"%");//模糊查询
		}
		if(queryModel.getStaffType()!=null){
			sc.andStaffTypeEqualTo(queryModel.getStaffType());//查询权限类型等于指定值
		}
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<StaffMsg> list = staffMsgMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(StaffMsg model:list){
			list2.add(getStaffMsgModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装员工为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getStaffMsgModel(StaffMsg model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("staffMsg",model);
		map.put("staffTypeStr",DataListUtils.getStaffTypeNameById(model.getStaffType()+""));//解释权限类型字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		staffMsgMapper.deleteByPrimaryKey(id);
	}
}
