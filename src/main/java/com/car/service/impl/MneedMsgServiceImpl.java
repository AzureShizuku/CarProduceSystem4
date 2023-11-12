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
public class MneedMsgServiceImpl implements MneedMsgService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	MneedMsgMapper mneedMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(MneedMsg model,LoginModel login){
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getNintro()==null||model.getNintro().equals("")){
			return "需求说明为必填属性";
		}
		if(model.getNdetail()==null||model.getNdetail().equals("")){
			return "需求详情为必填属性";
		}
		if(model.getNdetail()!=null){
			String [] fileSplit = model.getNdetail().split(";");
			if(fileSplit.length>1){
				return "需求详情的文件数量不能大于1";
			}
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		model.setCheckStatus(1);//默认已申请,
		String today = sdf2.format(new Date());
		mneedMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(MneedMsg model,LoginModel login){
		MneedMsg preModel = mneedMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getNintro()==null||model.getNintro().equals("")){
			return "需求说明为必填属性";
		}
		if(model.getNdetail()==null||model.getNdetail().equals("")){
			return "需求详情为必填属性";
		}
		if(model.getNdetail()!=null){
			String [] fileSplit = model.getNdetail().split(";");
			if(fileSplit.length>1){
				return "需求详情的文件数量不能大于1";
			}
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		preModel.setTitle(model.getTitle());
		preModel.setNintro(model.getNintro());
		preModel.setNdetail(model.getNdetail());
		preModel.setJfDate(model.getJfDate());
		String today = sdf2.format(new Date());
		mneedMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	接受申请
	*/
	@Override
	public String jssq(MneedMsg model,LoginModel login){
		MneedMsg preModel = mneedMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCheckStatus(2);//请求状态设置为已接受申请
		preModel.setCheckRemark(model.getCheckRemark());
		mneedMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	拒绝申请
	*/
	@Override
	public String jjsq(MneedMsg model,LoginModel login){
		MneedMsg preModel = mneedMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCheckStatus(3);//请求状态设置为已拒绝申请
		preModel.setCheckRemark(model.getCheckRemark());
		mneedMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询物料需求单列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(String createDate1,String createDate2,MneedMsg queryModel,Integer pageSize,LoginModel login) {
		MneedMsgExample se = new MneedMsgExample();
		MneedMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getTitle()!=null&&queryModel.getTitle().equals("")==false){
			sc.andTitleLike("%"+queryModel.getTitle()+"%");//模糊查询
		}
		if(createDate1!=null&&createDate1.equals("")==false){
			sc.andCreateDateGreaterThanOrEqualTo(createDate1);
		}
		if(createDate2!=null&&createDate2.equals("")==false){
			sc.andCreateDateLessThanOrEqualTo(createDate2);
		}
		if(queryModel.getCheckStatus()!=null){
			sc.andCheckStatusEqualTo(queryModel.getCheckStatus());//查询请求状态等于指定值
		}
		int count = (int)mneedMsgMapper.countByExample(se);
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
	*根据参数查询物料需求单列表数据
	*/
	@Override
	public Map<String,Object> getDataList(String createDate1,String createDate2,MneedMsg queryModel,Integer page,Integer pageSize,LoginModel login) {
		MneedMsgExample se = new MneedMsgExample();
		MneedMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getTitle()!=null&&queryModel.getTitle().equals("")==false){
			sc.andTitleLike("%"+queryModel.getTitle()+"%");//模糊查询
		}
		if(createDate1!=null&&createDate1.equals("")==false){
			sc.andCreateDateGreaterThanOrEqualTo(createDate1);
		}
		if(createDate2!=null&&createDate2.equals("")==false){
			sc.andCreateDateLessThanOrEqualTo(createDate2);
		}
		if(queryModel.getCheckStatus()!=null){
			sc.andCheckStatusEqualTo(queryModel.getCheckStatus());//查询请求状态等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<MneedMsg> list = mneedMsgMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(MneedMsg model:list){
			list2.add(getMneedMsgModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装物料需求单为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getMneedMsgModel(MneedMsg model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mneedMsg",model);
		map.put("checkStatusStr",DataListUtils.getNeedStatusNameById(model.getCheckStatus()+""));//解释请求状态字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		mneedMsgMapper.deleteByPrimaryKey(id);
	}
}
