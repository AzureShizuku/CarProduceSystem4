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
public class MoutlogServiceImpl implements MoutlogService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	MaterialInfoMapper materialInfoMapper;
	@Autowired
	MoutlogMapper moutlogMapper;
	/**
	新增
	*/
	@Override
	public String add(Moutlog model,LoginModel login){
		if(model.getMaterialId()==null){
			return "物料ID为必填属性";
		}
		if(model.getNum()==null){
			return "出库数量为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "出库备注为必填属性";
		}
		model.setCkDate(sdf2.format(new Date()));//当前日期格式
		model.setIsComfirm(1);//默认未确认,
		MaterialInfo materialIdT = materialInfoMapper.selectByPrimaryKey(model.getMaterialId());//查询物料台账
		if(materialIdT!=null){
			model.setMno(materialIdT.getMno());//赋值materialIdT的物料编号
		}
		if(materialIdT!=null){
			model.setMname(materialIdT.getMname());//赋值materialIdT的物料名
		}
		moutlogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(Moutlog model,LoginModel login){
		Moutlog preModel = moutlogMapper.selectByPrimaryKey(model.getId());
		if(model.getMaterialId()==null){
			return "物料ID为必填属性";
		}
		if(model.getNum()==null){
			return "出库数量为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "出库备注为必填属性";
		}
		preModel.setMaterialId(model.getMaterialId());
		preModel.setNum(model.getNum());
		preModel.setRemark(model.getRemark());
		MaterialInfo materialIdT = materialInfoMapper.selectByPrimaryKey(model.getMaterialId());//查询物料台账
		if(materialIdT!=null){
			preModel.setMno(materialIdT.getMno());//赋值materialIdT的物料编号
		}
		if(materialIdT!=null){
			preModel.setMname(materialIdT.getMname());//赋值materialIdT的物料名
		}
		moutlogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询物料出库列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(Moutlog queryModel,Integer pageSize,LoginModel login) {
		MoutlogExample se = new MoutlogExample();
		MoutlogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getMno()!=null&&queryModel.getMno().equals("")==false){
			sc.andMnoLike("%"+queryModel.getMno()+"%");//模糊查询
		}
		if(queryModel.getMname()!=null&&queryModel.getMname().equals("")==false){
			sc.andMnameLike("%"+queryModel.getMname()+"%");//模糊查询
		}
		if(queryModel.getIsComfirm()!=null){
			sc.andIsComfirmEqualTo(queryModel.getIsComfirm());//查询是否确认等于指定值
		}
		int count = (int)moutlogMapper.countByExample(se);
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
	*根据参数查询物料出库列表数据
	*/
	@Override
	public Map<String,Object> getDataList(Moutlog queryModel,Integer page,Integer pageSize,LoginModel login) {
		MoutlogExample se = new MoutlogExample();
		MoutlogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getMno()!=null&&queryModel.getMno().equals("")==false){
			sc.andMnoLike("%"+queryModel.getMno()+"%");//模糊查询
		}
		if(queryModel.getMname()!=null&&queryModel.getMname().equals("")==false){
			sc.andMnameLike("%"+queryModel.getMname()+"%");//模糊查询
		}
		if(queryModel.getIsComfirm()!=null){
			sc.andIsComfirmEqualTo(queryModel.getIsComfirm());//查询是否确认等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<Moutlog> list = moutlogMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(Moutlog model:list){
			list2.add(getMoutlogModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装物料出库为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getMoutlogModel(Moutlog model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("moutlog",model);
		if(model.getMaterialId()!=null){
			MaterialInfo materialInfo = materialInfoMapper.selectByPrimaryKey(model.getMaterialId());//物料ID为外接字段，需要关联物料台账来解释该字段
			if(materialInfo!=null){
				map.put("materialIdStr",materialInfo.getMno());
			}
		}
		map.put("isComfirmStr",DataListUtils.getIsComfirmNameById(model.getIsComfirm()+""));//解释是否确认字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		moutlogMapper.deleteByPrimaryKey(id);
	}
}
