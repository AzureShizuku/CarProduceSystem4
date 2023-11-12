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
public class MpurchaseAppServiceImpl implements MpurchaseAppService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	MpurchaseAppMapper mpurchaseAppMapper;
	/**
	新增
	*/
	@Override
	public String add(MpurchaseApp model,LoginModel login){
		if(model.getName()==null||model.getName().equals("")){
			return "物料名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getMtype()==null||model.getMtype().equals("")){
			return "型号为必填属性";
		}
		if(model.getPintro()==null||model.getPintro().equals("")){
			return "采购说明为必填属性";
		}
		if(model.getMstandard()==null||model.getMstandard().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getNum()==null){
			return "数量为必填属性";
		}
		if(model.getPrice()==null){
			return "参考价格为必填属性";
		}
		if(model.getPlanPrice()==null){
			return "预购价格为必填属性";
		}
		if(model.getTotalAmount()==null){
			return "总金额为必填属性";
		}
		if(model.getDhDate()==null||model.getDhDate().equals("")){
			return "到货日期为必填属性";
		}
		model.setCheckStatus(1);//默认已申请,
		String today = sdf2.format(new Date());
		mpurchaseAppMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(MpurchaseApp model,LoginModel login){
		MpurchaseApp preModel = mpurchaseAppMapper.selectByPrimaryKey(model.getId());
		if(model.getName()==null||model.getName().equals("")){
			return "物料名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getMtype()==null||model.getMtype().equals("")){
			return "型号为必填属性";
		}
		if(model.getPintro()==null||model.getPintro().equals("")){
			return "采购说明为必填属性";
		}
		if(model.getMstandard()==null||model.getMstandard().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getNum()==null){
			return "数量为必填属性";
		}
		if(model.getPrice()==null){
			return "参考价格为必填属性";
		}
		if(model.getPlanPrice()==null){
			return "预购价格为必填属性";
		}
		if(model.getTotalAmount()==null){
			return "总金额为必填属性";
		}
		if(model.getDhDate()==null||model.getDhDate().equals("")){
			return "到货日期为必填属性";
		}
		preModel.setNo(model.getNo());
		preModel.setName(model.getName());
		preModel.setGg(model.getGg());
		preModel.setMtype(model.getMtype());
		preModel.setPintro(model.getPintro());
		preModel.setMstandard(model.getMstandard());
		preModel.setNum(model.getNum());
		preModel.setPrice(model.getPrice());
		preModel.setPlanPrice(model.getPlanPrice());
		preModel.setTotalAmount(model.getTotalAmount());
		preModel.setDhDate(model.getDhDate());
		String today = sdf2.format(new Date());
		mpurchaseAppMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	接受申请
	*/
	@Override
	public String jssq(MpurchaseApp model,LoginModel login){
		MpurchaseApp preModel = mpurchaseAppMapper.selectByPrimaryKey(model.getId());
		if(model.getShbz()==null||model.getShbz().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCheckStatus(2);//审核状态设置为已接受申请
		preModel.setShbz(model.getShbz());
		mpurchaseAppMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	拒绝申请
	*/
	@Override
	public String jjsq(MpurchaseApp model,LoginModel login){
		MpurchaseApp preModel = mpurchaseAppMapper.selectByPrimaryKey(model.getId());
		if(model.getShbz()==null||model.getShbz().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setCheckStatus(3);//审核状态设置为已拒绝申请
		preModel.setShbz(model.getShbz());
		mpurchaseAppMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询物料申购单列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(MpurchaseApp queryModel,Integer pageSize,LoginModel login) {
		MpurchaseAppExample se = new MpurchaseAppExample();
		MpurchaseAppExample.Criteria sc = se.createCriteria();
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
		int count = (int)mpurchaseAppMapper.countByExample(se);
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
	*根据参数查询物料申购单列表数据
	*/
	@Override
	public Map<String,Object> getDataList(MpurchaseApp queryModel,Integer page,Integer pageSize,LoginModel login) {
		MpurchaseAppExample se = new MpurchaseAppExample();
		MpurchaseAppExample.Criteria sc = se.createCriteria();
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
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<MpurchaseApp> list = mpurchaseAppMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(MpurchaseApp model:list){
			list2.add(getMpurchaseAppModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装物料申购单为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getMpurchaseAppModel(MpurchaseApp model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("mpurchaseApp",model);
		map.put("checkStatusStr",DataListUtils.getNeedStatusNameById(model.getCheckStatus()+""));//解释审核状态字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		mpurchaseAppMapper.deleteByPrimaryKey(id);
	}
}
