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
public class MaterialInfoServiceImpl implements MaterialInfoService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	ProviderMapper providerMapper;
	@Autowired
	MaterialInfoMapper materialInfoMapper;
	/**
	新增
	*/
	@Override
	public String add(MaterialInfo model,LoginModel login){
		if(model.getMno()==null||model.getMno().equals("")){
			return "物料编号为必填属性";
		}
		if(model.getMno()!=null){
			MaterialInfoExample te=new MaterialInfoExample();
			MaterialInfoExample.Criteria tc=te.createCriteria();
			tc.andMnoEqualTo(model.getMno());
			int count = (int)materialInfoMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 物料编号 ,请重新填写";
			}
		}
		if(model.getMname()==null||model.getMname().equals("")){
			return "物料名为必填属性";
		}
		if(model.getMintro()==null||model.getMintro().equals("")){
			return "物料介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getProviderId()==null){
			return "供应商为必填属性";
		}
		if(model.getJsbz()==null||model.getJsbz().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getPrice()==null){
			return "参考价格为必填属性";
		}
		materialInfoMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(MaterialInfo model,LoginModel login){
		if(model.getMno()==null||model.getMno().equals("")){
			return "物料编号为必填属性";
		}
		if(model.getMno()!=null){
			MaterialInfoExample te=new MaterialInfoExample();
			MaterialInfoExample.Criteria tc=te.createCriteria();
			tc.andMnoEqualTo(model.getMno());
			int count = (int)materialInfoMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 物料编号 ,请重新填写";
			}
		}
		if(model.getMname()==null||model.getMname().equals("")){
			return "物料名为必填属性";
		}
		if(model.getMintro()==null||model.getMintro().equals("")){
			return "物料介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getProviderId()==null){
			return "供应商为必填属性";
		}
		if(model.getJsbz()==null||model.getJsbz().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getPrice()==null){
			return "参考价格为必填属性";
		}
		materialInfoMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(MaterialInfo model,LoginModel login){
		MaterialInfo preModel = materialInfoMapper.selectByPrimaryKey(model.getId());
		if(model.getMno()==null||model.getMno().equals("")){
			return "物料编号为必填属性";
		}
		if(model.getMno()!=null){
			MaterialInfoExample te=new MaterialInfoExample();
			MaterialInfoExample.Criteria tc=te.createCriteria();
			tc.andMnoEqualTo(model.getMno());
			tc.andIdNotEqualTo(model.getId());
			int count = (int)materialInfoMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 物料编号 ,请重新填写";
			}
		}
		if(model.getMname()==null||model.getMname().equals("")){
			return "物料名为必填属性";
		}
		if(model.getMintro()==null||model.getMintro().equals("")){
			return "物料介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getProviderId()==null){
			return "供应商为必填属性";
		}
		if(model.getJsbz()==null||model.getJsbz().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getPrice()==null){
			return "参考价格为必填属性";
		}
		preModel.setMno(model.getMno());
		preModel.setMname(model.getMname());
		preModel.setMintro(model.getMintro());
		preModel.setStockNum(model.getStockNum());
		preModel.setDw(model.getDw());
		preModel.setGg(model.getGg());
		preModel.setProviderId(model.getProviderId());
		preModel.setJsbz(model.getJsbz());
		preModel.setPrice(model.getPrice());
		materialInfoMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(MaterialInfo model,LoginModel login){
		MaterialInfo preModel = materialInfoMapper.selectByPrimaryKey(model.getId());
		if(model.getMno()==null||model.getMno().equals("")){
			return "物料编号为必填属性";
		}
		if(model.getMno()!=null){
			MaterialInfoExample te=new MaterialInfoExample();
			MaterialInfoExample.Criteria tc=te.createCriteria();
			tc.andMnoEqualTo(model.getMno());
			tc.andIdNotEqualTo(model.getId());
			int count = (int)materialInfoMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 物料编号 ,请重新填写";
			}
		}
		if(model.getMname()==null||model.getMname().equals("")){
			return "物料名为必填属性";
		}
		if(model.getMintro()==null||model.getMintro().equals("")){
			return "物料介绍为必填属性";
		}
		if(model.getStockNum()==null){
			return "库存量为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getProviderId()==null){
			return "供应商为必填属性";
		}
		if(model.getJsbz()==null||model.getJsbz().equals("")){
			return "技术标准为必填属性";
		}
		if(model.getPrice()==null){
			return "参考价格为必填属性";
		}
		preModel.setMno(model.getMno());
		preModel.setMname(model.getMname());
		preModel.setMintro(model.getMintro());
		preModel.setStockNum(model.getStockNum());
		preModel.setDw(model.getDw());
		preModel.setGg(model.getGg());
		preModel.setProviderId(model.getProviderId());
		preModel.setJsbz(model.getJsbz());
		preModel.setPrice(model.getPrice());
		materialInfoMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询物料台账列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(MaterialInfo queryModel,Integer pageSize,LoginModel login) {
		MaterialInfoExample se = new MaterialInfoExample();
		MaterialInfoExample.Criteria sc = se.createCriteria();
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
		int count = (int)materialInfoMapper.countByExample(se);
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
	*根据参数查询物料台账列表数据
	*/
	@Override
	public Map<String,Object> getDataList(MaterialInfo queryModel,Integer page,Integer pageSize,LoginModel login) {
		MaterialInfoExample se = new MaterialInfoExample();
		MaterialInfoExample.Criteria sc = se.createCriteria();
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
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<MaterialInfo> list = materialInfoMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(MaterialInfo model:list){
			list2.add(getMaterialInfoModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装物料台账为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getMaterialInfoModel(MaterialInfo model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("materialInfo",model);
		if(model.getProviderId()!=null){
			Provider provider = providerMapper.selectByPrimaryKey(model.getProviderId());//供应商为外接字段，需要关联供应商来解释该字段
			if(provider!=null){
				map.put("providerIdStr",provider.getLoginName());
			}
		}
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		materialInfoMapper.deleteByPrimaryKey(id);
	}
}
