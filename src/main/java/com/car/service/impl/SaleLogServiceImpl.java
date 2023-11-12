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
public class SaleLogServiceImpl implements SaleLogService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	StaffMsgMapper staffMsgMapper;
	@Autowired
	SaleLogMapper saleLogMapper;
	@Autowired
	StockMsgMapper stockMsgMapper;
	/**
	新增
	*/
	@Override
	public String add(SaleLog model,LoginModel login){
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getNum()==null){
			return "销售数量为必填属性";
		}
		if(model.getAmount()==null){
			return "销售金额为必填属性";
		}
		if(model.getHtFile()==null||model.getHtFile().equals("")){
			return "销售合同为必填属性";
		}
		if(model.getHtFile()!=null){
			String [] fileSplit = model.getHtFile().split(";");
			if(fileSplit.length>1){
				return "销售合同的文件数量不能大于1";
			}
		}
		model.setOrderNo(sdf3.format(new Date())+RandomCodeUtils.getRandomCode());//随机码(当前时间+6位随机码)
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		model.setStaffId(login.getId());//登录id
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			model.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			model.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		saleLogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(SaleLog model,LoginModel login){
		SaleLog preModel = saleLogMapper.selectByPrimaryKey(model.getId());
		if(model.getStockId()==null){
			return "库存台账ID为必填属性";
		}
		if(model.getNum()==null){
			return "销售数量为必填属性";
		}
		if(model.getAmount()==null){
			return "销售金额为必填属性";
		}
		if(model.getHtFile()==null||model.getHtFile().equals("")){
			return "销售合同为必填属性";
		}
		if(model.getHtFile()!=null){
			String [] fileSplit = model.getHtFile().split(";");
			if(fileSplit.length>1){
				return "销售合同的文件数量不能大于1";
			}
		}
		preModel.setStockId(model.getStockId());
		preModel.setNum(model.getNum());
		preModel.setAmount(model.getAmount());
		preModel.setHtFile(model.getHtFile());
		StockMsg stockIdT = stockMsgMapper.selectByPrimaryKey(model.getStockId());//查询库存台账
		if(stockIdT!=null){
			preModel.setProNo(stockIdT.getProNo());//赋值stockIdT的商品编号
		}
		if(stockIdT!=null){
			preModel.setProName(stockIdT.getProName());//赋值stockIdT的商品名
		}
		saleLogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询销售订单列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(SaleLog queryModel,Integer pageSize,LoginModel login) {
		SaleLogExample se = new SaleLogExample();
		SaleLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getOrderNo()!=null&&queryModel.getOrderNo().equals("")==false){
			sc.andOrderNoLike("%"+queryModel.getOrderNo()+"%");//模糊查询
		}
		if(queryModel.getProNo()!=null&&queryModel.getProNo().equals("")==false){
			sc.andProNoLike("%"+queryModel.getProNo()+"%");//模糊查询
		}
		if(queryModel.getProName()!=null&&queryModel.getProName().equals("")==false){
			sc.andProNameLike("%"+queryModel.getProName()+"%");//模糊查询
		}
		if(queryModel.getStaffId()!=null){
			sc.andStaffIdEqualTo(queryModel.getStaffId());
		}
		int count = (int)saleLogMapper.countByExample(se);
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
	*根据参数查询销售订单列表数据
	*/
	@Override
	public Map<String,Object> getDataList(SaleLog queryModel,Integer page,Integer pageSize,LoginModel login) {
		SaleLogExample se = new SaleLogExample();
		SaleLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getOrderNo()!=null&&queryModel.getOrderNo().equals("")==false){
			sc.andOrderNoLike("%"+queryModel.getOrderNo()+"%");//模糊查询
		}
		if(queryModel.getProNo()!=null&&queryModel.getProNo().equals("")==false){
			sc.andProNoLike("%"+queryModel.getProNo()+"%");//模糊查询
		}
		if(queryModel.getProName()!=null&&queryModel.getProName().equals("")==false){
			sc.andProNameLike("%"+queryModel.getProName()+"%");//模糊查询
		}
		if(queryModel.getStaffId()!=null){
			sc.andStaffIdEqualTo(queryModel.getStaffId());
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<SaleLog> list = saleLogMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(SaleLog model:list){
			list2.add(getSaleLogModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装销售订单为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getSaleLogModel(SaleLog model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("saleLog",model);
		if(model.getStockId()!=null){
			StockMsg stockMsg = stockMsgMapper.selectByPrimaryKey(model.getStockId());//库存台账ID为外接字段，需要关联库存台账来解释该字段
			if(stockMsg!=null){
				map.put("stockIdStr",stockMsg.getProNo());
			}
		}
		if(model.getStaffId()!=null){
			StaffMsg staffMsg = staffMsgMapper.selectByPrimaryKey(model.getStaffId());//销售员工为外接字段，需要关联员工来解释该字段
			if(staffMsg!=null){
				map.put("staffIdStr",staffMsg.getStaffNo());
			}
		}
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		saleLogMapper.deleteByPrimaryKey(id);
	}
	@Override
	public void exportSale(HttpServletRequest request, HttpServletResponse response,Map<String,Object> data,LoginModel login){
		List<Map<String,Object>> list2 = (List<Map<String,Object>>)data.get("list");//根据查询条件获取数据
		List<Map<String,Object>> list3 = new ArrayList<Map<String,Object>>();
		for(Map<String,Object> map:list2){
			Map<String,Object> map2 = new HashMap<String,Object>();
			SaleLog saleLog = (SaleLog)map.get("saleLog");
			map2.put("orderNo",saleLog.getOrderNo());//解释订单编号
			Object stockId = map.get("stockIdStr");
			if(stockId!=null){
				map2.put("stockId",stockId.toString());//解释库存台账ID
			}
			map2.put("proNo",saleLog.getProNo());//解释商品编号
			map2.put("proName",saleLog.getProName());//解释商品名
			map2.put("num",saleLog.getNum());//解释销售数量
			map2.put("amount",saleLog.getAmount());//解释销售金额
			map2.put("htFile",saleLog.getHtFile());//解释销售合同
			map2.put("createDate",saleLog.getCreateDate());//解释创建日期
			Object staffId = map.get("staffIdStr");
			if(staffId!=null){
				map2.put("staffId",staffId.toString());//解释销售员工
			}
			list3.add(map2);
		}
		PoiExcelExport pee = new PoiExcelExport(response,"销售订单导出报表"+sdf2.format(new Date()),"sheet1");
	String[] headers = {"订单编号","库存台账ID","商品编号","商品名","销售数量","销售金额","销售合同","创建日期","销售员工"};
	String[] columns = {"orderNo","stockId","proNo","proName","num","amount","htFile","createDate","staffId"};
	int[] titleSize = {20,20,20,20,20,20,20,20,20};
		try {
			pee.wirteExcel(columns, headers, titleSize, list3);//根据数据列表生成excel文件
			response.getOutputStream().close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
