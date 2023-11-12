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
public class ProLogServiceImpl implements ProLogService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	StockMsgMapper stockMsgMapper;
	@Autowired
	ProLogMapper proLogMapper;
	/**
	新增
	*/
	@Override
	public String add(ProLog model,LoginModel login){
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getCheckIntro()==null||model.getCheckIntro().equals("")){
			return "质检说明为必填属性";
		}
		if(model.getCheckFile()==null||model.getCheckFile().equals("")){
			return "质检证书为必填属性";
		}
		if(model.getCheckFile()!=null){
			String [] fileSplit = model.getCheckFile().split(";");
			if(fileSplit.length>1){
				return "质检证书的文件数量不能大于1";
			}
		}
		model.setProNo(sdf3.format(new Date())+RandomCodeUtils.getRandomCode());//随机码(当前时间+6位随机码)
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		model.setInStatus(1);//默认未入库,
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			model.setStockProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			model.setStockProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		proLogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(ProLog model,LoginModel login){
		ProLog preModel = proLogMapper.selectByPrimaryKey(model.getId());
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getCheckIntro()==null||model.getCheckIntro().equals("")){
			return "质检说明为必填属性";
		}
		if(model.getCheckFile()==null||model.getCheckFile().equals("")){
			return "质检证书为必填属性";
		}
		if(model.getCheckFile()!=null){
			String [] fileSplit = model.getCheckFile().split(";");
			if(fileSplit.length>1){
				return "质检证书的文件数量不能大于1";
			}
		}
		preModel.setStockId(model.getStockId());
		preModel.setCheckIntro(model.getCheckIntro());
		preModel.setCheckFile(model.getCheckFile());
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			preModel.setStockProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			preModel.setStockProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		proLogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询生产记录列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(ProLog queryModel,Integer pageSize,LoginModel login) {
		ProLogExample se = new ProLogExample();
		ProLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getProNo()!=null&&queryModel.getProNo().equals("")==false){
			sc.andProNoLike("%"+queryModel.getProNo()+"%");//模糊查询
		}
		if(queryModel.getStockProNo()!=null&&queryModel.getStockProNo().equals("")==false){
			sc.andStockProNoLike("%"+queryModel.getStockProNo()+"%");//模糊查询
		}
		if(queryModel.getStockProName()!=null&&queryModel.getStockProName().equals("")==false){
			sc.andStockProNameLike("%"+queryModel.getStockProName()+"%");//模糊查询
		}
		if(queryModel.getInStatus()!=null){
			sc.andInStatusEqualTo(queryModel.getInStatus());//查询入库状态等于指定值
		}
		int count = (int)proLogMapper.countByExample(se);
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
	*根据参数查询生产记录列表数据
	*/
	@Override
	public Map<String,Object> getDataList(ProLog queryModel,Integer page,Integer pageSize,LoginModel login) {
		ProLogExample se = new ProLogExample();
		ProLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getProNo()!=null&&queryModel.getProNo().equals("")==false){
			sc.andProNoLike("%"+queryModel.getProNo()+"%");//模糊查询
		}
		if(queryModel.getStockProNo()!=null&&queryModel.getStockProNo().equals("")==false){
			sc.andStockProNoLike("%"+queryModel.getStockProNo()+"%");//模糊查询
		}
		if(queryModel.getStockProName()!=null&&queryModel.getStockProName().equals("")==false){
			sc.andStockProNameLike("%"+queryModel.getStockProName()+"%");//模糊查询
		}
		if(queryModel.getInStatus()!=null){
			sc.andInStatusEqualTo(queryModel.getInStatus());//查询入库状态等于指定值
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<ProLog> list = proLogMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(ProLog model:list){
			list2.add(getProLogModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装生产记录为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getProLogModel(ProLog model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("proLog",model);
		if(model.getStockId()!=null){
			StockMsg stockMsg = stockMsgMapper.selectByPrimaryKey(model.getStockId());//库存台账ID为外接字段，需要关联库存台账来解释该字段
			if(stockMsg!=null){
				map.put("stockIdStr",stockMsg.getProNo());
			}
		}
		map.put("inStatusStr",DataListUtils.getProStatusNameById(model.getInStatus()+""));//解释入库状态字段
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		proLogMapper.deleteByPrimaryKey(id);
	}
}
