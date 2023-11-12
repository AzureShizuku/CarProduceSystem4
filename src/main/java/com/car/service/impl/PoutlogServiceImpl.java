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
public class PoutlogServiceImpl implements PoutlogService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	PoutlogMapper poutlogMapper;
	@Autowired
	StockMsgMapper stockMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(Poutlog model,LoginModel login){
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getOutNum()==null){
			return "出库数量为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "出库备注为必填属性";
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		model.setStatus(1);//默认未确认,
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			model.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			model.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		poutlogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(Poutlog model,LoginModel login){
		Poutlog preModel = poutlogMapper.selectByPrimaryKey(model.getId());
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getOutNum()==null){
			return "出库数量为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "出库备注为必填属性";
		}
		preModel.setStockId(model.getStockId());
		preModel.setOutNum(model.getOutNum());
		preModel.setRemark(model.getRemark());
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			preModel.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			preModel.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		poutlogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询出库单列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(String createDate1,String createDate2,Poutlog queryModel,Integer pageSize,LoginModel login) {
		PoutlogExample se = new PoutlogExample();
		PoutlogExample.Criteria sc = se.createCriteria();
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
		if(createDate1!=null&&createDate1.equals("")==false){
			sc.andCreateDateGreaterThanOrEqualTo(createDate1);
		}
		if(createDate2!=null&&createDate2.equals("")==false){
			sc.andCreateDateLessThanOrEqualTo(createDate2);
		}
		if(queryModel.getStatus()!=null){
			sc.andStatusEqualTo(queryModel.getStatus());//查询确认状态等于指定值
		}
		int count = (int)poutlogMapper.countByExample(se);
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
	*根据参数查询出库单列表数据
	*/
	@Override
	public Map<String,Object> getDataList(String createDate1,String createDate2,Poutlog queryModel,Integer page,Integer pageSize,LoginModel login) {
		PoutlogExample se = new PoutlogExample();
		PoutlogExample.Criteria sc = se.createCriteria();
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
		if(createDate1!=null&&createDate1.equals("")==false){
			sc.andCreateDateGreaterThanOrEqualTo(createDate1);
		}
		if(createDate2!=null&&createDate2.equals("")==false){
			sc.andCreateDateLessThanOrEqualTo(createDate2);
		}
		if(queryModel.getStatus()!=null){
			sc.andStatusEqualTo(queryModel.getStatus());//查询确认状态等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<Poutlog> list = poutlogMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(Poutlog model:list){
			list2.add(getPoutlogModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装出库单为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getPoutlogModel(Poutlog model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("poutlog",model);
		if(model.getStockId()!=null){
			StockMsg stockMsg = stockMsgMapper.selectByPrimaryKey(model.getStockId());//库存台账ID为外接字段，需要关联库存台账来解释该字段
			if(stockMsg!=null){
				map.put("stockIdStr",stockMsg.getProNo());
			}
		}
		map.put("statusStr",DataListUtils.getIsComfirmNameById(model.getStatus()+""));//解释确认状态字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		poutlogMapper.deleteByPrimaryKey(id);
	}
}
