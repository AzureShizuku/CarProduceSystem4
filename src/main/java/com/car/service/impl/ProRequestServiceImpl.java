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
public class ProRequestServiceImpl implements ProRequestService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	StockMsgMapper stockMsgMapper;
	@Autowired
	ProRequestMapper proRequestMapper;
	/**
	新增
	*/
	@Override
	public String add(ProRequest model,LoginModel login){
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getNeedNum()==null){
			return "需求数量为必填属性";
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		if(model.getRequestIntro()==null||model.getRequestIntro().equals("")){
			return "请求说明为必填属性";
		}
		if(model.getRequestFile()==null||model.getRequestFile().equals("")){
			return "附件为必填属性";
		}
		if(model.getRequestFile()!=null){
			String [] fileSplit = model.getRequestFile().split(";");
			if(fileSplit.length>1){
				return "附件的文件数量不能大于1";
			}
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		model.setRequestStatus(1);//默认已申请,
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			model.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			model.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		String today = sdf2.format(new Date());
		proRequestMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(ProRequest model,LoginModel login){
		ProRequest preModel = proRequestMapper.selectByPrimaryKey(model.getId());
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getNeedNum()==null){
			return "需求数量为必填属性";
		}
		if(model.getJfDate()==null||model.getJfDate().equals("")){
			return "交付日期为必填属性";
		}
		if(model.getRequestIntro()==null||model.getRequestIntro().equals("")){
			return "请求说明为必填属性";
		}
		if(model.getRequestFile()==null||model.getRequestFile().equals("")){
			return "附件为必填属性";
		}
		if(model.getRequestFile()!=null){
			String [] fileSplit = model.getRequestFile().split(";");
			if(fileSplit.length>1){
				return "附件的文件数量不能大于1";
			}
		}
		preModel.setStockId(model.getStockId());
		preModel.setNeedNum(model.getNeedNum());
		preModel.setJfDate(model.getJfDate());
		preModel.setRequestIntro(model.getRequestIntro());
		preModel.setRequestFile(model.getRequestFile());
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			preModel.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			preModel.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		String today = sdf2.format(new Date());
		proRequestMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	接受申请
	*/
	@Override
	public String jssq(ProRequest model,LoginModel login){
		ProRequest preModel = proRequestMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setRequestStatus(2);//请求状态设置为已接受申请
		preModel.setCheckRemark(model.getCheckRemark());
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			preModel.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			preModel.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		proRequestMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	拒绝申请
	*/
	@Override
	public String jjsq(ProRequest model,LoginModel login){
		ProRequest preModel = proRequestMapper.selectByPrimaryKey(model.getId());
		if(model.getCheckRemark()==null||model.getCheckRemark().equals("")){
			return "审核备注为必填属性";
		}
		preModel.setRequestStatus(3);//请求状态设置为已拒绝申请
		preModel.setCheckRemark(model.getCheckRemark());
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			preModel.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			preModel.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		proRequestMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询生产请求列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(ProRequest queryModel,Integer pageSize,LoginModel login) {
		ProRequestExample se = new ProRequestExample();
		ProRequestExample.Criteria sc = se.createCriteria();
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
		if(queryModel.getRequestStatus()!=null){
			sc.andRequestStatusEqualTo(queryModel.getRequestStatus());//查询请求状态等于指定值
		}
		int count = (int)proRequestMapper.countByExample(se);
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
	*根据参数查询生产请求列表数据
	*/
	@Override
	public Map<String,Object> getDataList(ProRequest queryModel,Integer page,Integer pageSize,LoginModel login) {
		ProRequestExample se = new ProRequestExample();
		ProRequestExample.Criteria sc = se.createCriteria();
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
		if(queryModel.getRequestStatus()!=null){
			sc.andRequestStatusEqualTo(queryModel.getRequestStatus());//查询请求状态等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<ProRequest> list = proRequestMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(ProRequest model:list){
			list2.add(getProRequestModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装生产请求为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getProRequestModel(ProRequest model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("proRequest",model);
		if(model.getStockId()!=null){
			StockMsg stockMsg = stockMsgMapper.selectByPrimaryKey(model.getStockId());//库存台账ID为外接字段，需要关联库存台账来解释该字段
			if(stockMsg!=null){
				map.put("stockIdStr",stockMsg.getProNo());
			}
		}
		map.put("requestStatusStr",DataListUtils.getNeedStatusNameById(model.getRequestStatus()+""));//解释请求状态字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		proRequestMapper.deleteByPrimaryKey(id);
	}
}
