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
public class StockMsgServiceImpl implements StockMsgService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	StockMsgMapper stockMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(StockMsg model,LoginModel login){
		if(model.getProNo()==null||model.getProNo().equals("")){
			return "商品编号为必填属性";
		}
		if(model.getProNo()!=null){
			StockMsgExample te=new StockMsgExample();
			StockMsgExample.Criteria tc=te.createCriteria();
			tc.andProNoEqualTo(model.getProNo());
			int count = (int)stockMsgMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 商品编号 ,请重新填写";
			}
		}
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getPrice()==null){
			return "单价为必填属性";
		}
		if(model.getNum()==null){
			return "数量为必填属性";
		}
		stockMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(StockMsg model,LoginModel login){
		if(model.getProNo()==null||model.getProNo().equals("")){
			return "商品编号为必填属性";
		}
		if(model.getProNo()!=null){
			StockMsgExample te=new StockMsgExample();
			StockMsgExample.Criteria tc=te.createCriteria();
			tc.andProNoEqualTo(model.getProNo());
			int count = (int)stockMsgMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 商品编号 ,请重新填写";
			}
		}
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getPrice()==null){
			return "单价为必填属性";
		}
		if(model.getNum()==null){
			return "数量为必填属性";
		}
		stockMsgMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(StockMsg model,LoginModel login){
		StockMsg preModel = stockMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getProNo()==null||model.getProNo().equals("")){
			return "商品编号为必填属性";
		}
		if(model.getProNo()!=null){
			StockMsgExample te=new StockMsgExample();
			StockMsgExample.Criteria tc=te.createCriteria();
			tc.andProNoEqualTo(model.getProNo());
			tc.andIdNotEqualTo(model.getId());
			int count = (int)stockMsgMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 商品编号 ,请重新填写";
			}
		}
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getPrice()==null){
			return "单价为必填属性";
		}
		if(model.getNum()==null){
			return "数量为必填属性";
		}
		preModel.setProNo(model.getProNo());
		preModel.setProName(model.getProName());
		preModel.setGg(model.getGg());
		preModel.setDw(model.getDw());
		preModel.setPrice(model.getPrice());
		preModel.setNum(model.getNum());
		stockMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(StockMsg model,LoginModel login){
		StockMsg preModel = stockMsgMapper.selectByPrimaryKey(model.getId());
		if(model.getProNo()==null||model.getProNo().equals("")){
			return "商品编号为必填属性";
		}
		if(model.getProNo()!=null){
			StockMsgExample te=new StockMsgExample();
			StockMsgExample.Criteria tc=te.createCriteria();
			tc.andProNoEqualTo(model.getProNo());
			tc.andIdNotEqualTo(model.getId());
			int count = (int)stockMsgMapper.countByExample(te);
			if(count>0){
				return "系统已存在该 商品编号 ,请重新填写";
			}
		}
		if(model.getProName()==null||model.getProName().equals("")){
			return "商品名为必填属性";
		}
		if(model.getGg()==null||model.getGg().equals("")){
			return "规格为必填属性";
		}
		if(model.getDw()==null||model.getDw().equals("")){
			return "单位为必填属性";
		}
		if(model.getPrice()==null){
			return "单价为必填属性";
		}
		if(model.getNum()==null){
			return "数量为必填属性";
		}
		preModel.setProNo(model.getProNo());
		preModel.setProName(model.getProName());
		preModel.setGg(model.getGg());
		preModel.setDw(model.getDw());
		preModel.setPrice(model.getPrice());
		preModel.setNum(model.getNum());
		stockMsgMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询库存台账列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(StockMsg queryModel,Integer pageSize,LoginModel login) {
		StockMsgExample se = new StockMsgExample();
		StockMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getProNo()!=null&&queryModel.getProNo().equals("")==false){
			sc.andProNoLike("%"+queryModel.getProNo()+"%");//模糊查询
		}
		if(queryModel.getProName()!=null&&queryModel.getProName().equals("")==false){
			sc.andProNameLike("%"+queryModel.getProName()+"%");//模糊查询
		}
		int count = (int)stockMsgMapper.countByExample(se);
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
	*根据参数查询库存台账列表数据
	*/
	@Override
	public Map<String,Object> getDataList(StockMsg queryModel,Integer page,Integer pageSize,LoginModel login) {
		StockMsgExample se = new StockMsgExample();
		StockMsgExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getProNo()!=null&&queryModel.getProNo().equals("")==false){
			sc.andProNoLike("%"+queryModel.getProNo()+"%");//模糊查询
		}
		if(queryModel.getProName()!=null&&queryModel.getProName().equals("")==false){
			sc.andProNameLike("%"+queryModel.getProName()+"%");//模糊查询
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<StockMsg> list = stockMsgMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(StockMsg model:list){
			list2.add(getStockMsgModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装库存台账为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getStockMsgModel(StockMsg model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("stockMsg",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		stockMsgMapper.deleteByPrimaryKey(id);
	}
}
