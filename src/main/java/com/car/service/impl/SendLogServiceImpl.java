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
public class SendLogServiceImpl implements SendLogService{
	SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
	SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM");
	@Autowired
	SendLogMapper sendLogMapper;
	/**
	新增
	*/
	@Override
	public String add(SendLog model,LoginModel login){
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getPsIntro()==null||model.getPsIntro().equals("")){
			return "配送说明为必填属性";
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "配送地址为必填属性";
		}
		if(model.getContactName()==null||model.getContactName().equals("")){
			return "联系人为必填属性";
		}
		if(model.getContactCel()==null||model.getContactCel().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getContactCel()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getContactCel());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getDriverName()==null||model.getDriverName().equals("")){
			return "司机为必填属性";
		}
		if(model.getDriverCel()==null||model.getDriverCel().equals("")){
			return "副驾驶为必填属性";
		}
		if(model.getDriverName2()==null||model.getDriverName2().equals("")){
			return "司机电话为必填属性";
		}
		if(model.getDriverName2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverName2());
			if( m.matches()==false){
				return "请输入正确的司机电话";
			}
		}
		if(model.getDriverCel2()==null||model.getDriverCel2().equals("")){
			return "副驾驶电话为必填属性";
		}
		if(model.getDriverCel2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverCel2());
			if( m.matches()==false){
				return "请输入正确的副驾驶电话";
			}
		}
		if(model.getPsDetail()==null||model.getPsDetail().equals("")){
			return "配送单详情为必填属性";
		}
		if(model.getPsDetail()!=null){
			String [] fileSplit = model.getPsDetail().split(";");
			if(fileSplit.length>1){
				return "配送单详情的文件数量不能大于1";
			}
		}
		if(model.getTotalAmount()==null||model.getTotalAmount().equals("")){
			return "价值总额为必填属性";
		}
		if(model.getPsDate()==null||model.getPsDate().equals("")){
			return "配送日期为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		String today = sdf2.format(new Date());
		sendLogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	新增
	*/
	@Override
	public String add1(SendLog model,LoginModel login){
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getPsIntro()==null||model.getPsIntro().equals("")){
			return "配送说明为必填属性";
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "配送地址为必填属性";
		}
		if(model.getContactName()==null||model.getContactName().equals("")){
			return "联系人为必填属性";
		}
		if(model.getContactCel()==null||model.getContactCel().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getContactCel()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getContactCel());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getDriverName()==null||model.getDriverName().equals("")){
			return "司机为必填属性";
		}
		if(model.getDriverCel()==null||model.getDriverCel().equals("")){
			return "副驾驶为必填属性";
		}
		if(model.getDriverName2()==null||model.getDriverName2().equals("")){
			return "司机电话为必填属性";
		}
		if(model.getDriverName2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverName2());
			if( m.matches()==false){
				return "请输入正确的司机电话";
			}
		}
		if(model.getDriverCel2()==null||model.getDriverCel2().equals("")){
			return "副驾驶电话为必填属性";
		}
		if(model.getDriverCel2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverCel2());
			if( m.matches()==false){
				return "请输入正确的副驾驶电话";
			}
		}
		if(model.getPsDetail()==null||model.getPsDetail().equals("")){
			return "配送单详情为必填属性";
		}
		if(model.getPsDetail()!=null){
			String [] fileSplit = model.getPsDetail().split(";");
			if(fileSplit.length>1){
				return "配送单详情的文件数量不能大于1";
			}
		}
		if(model.getTotalAmount()==null||model.getTotalAmount().equals("")){
			return "价值总额为必填属性";
		}
		if(model.getPsDate()==null||model.getPsDate().equals("")){
			return "配送日期为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		model.setCreateDate(sdf2.format(new Date()));//当前日期格式
		String today = sdf2.format(new Date());
		sendLogMapper.insertSelective(model);//插入数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update(SendLog model,LoginModel login){
		SendLog preModel = sendLogMapper.selectByPrimaryKey(model.getId());
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getPsIntro()==null||model.getPsIntro().equals("")){
			return "配送说明为必填属性";
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "配送地址为必填属性";
		}
		if(model.getContactName()==null||model.getContactName().equals("")){
			return "联系人为必填属性";
		}
		if(model.getContactCel()==null||model.getContactCel().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getContactCel()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getContactCel());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getDriverName()==null||model.getDriverName().equals("")){
			return "司机为必填属性";
		}
		if(model.getDriverCel()==null||model.getDriverCel().equals("")){
			return "副驾驶为必填属性";
		}
		if(model.getDriverName2()==null||model.getDriverName2().equals("")){
			return "司机电话为必填属性";
		}
		if(model.getDriverName2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverName2());
			if( m.matches()==false){
				return "请输入正确的司机电话";
			}
		}
		if(model.getDriverCel2()==null||model.getDriverCel2().equals("")){
			return "副驾驶电话为必填属性";
		}
		if(model.getDriverCel2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverCel2());
			if( m.matches()==false){
				return "请输入正确的副驾驶电话";
			}
		}
		if(model.getPsDetail()==null||model.getPsDetail().equals("")){
			return "配送单详情为必填属性";
		}
		if(model.getPsDetail()!=null){
			String [] fileSplit = model.getPsDetail().split(";");
			if(fileSplit.length>1){
				return "配送单详情的文件数量不能大于1";
			}
		}
		if(model.getTotalAmount()==null||model.getTotalAmount().equals("")){
			return "价值总额为必填属性";
		}
		if(model.getPsDate()==null||model.getPsDate().equals("")){
			return "配送日期为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		preModel.setTitle(model.getTitle());
		preModel.setPsIntro(model.getPsIntro());
		preModel.setAddress(model.getAddress());
		preModel.setContactName(model.getContactName());
		preModel.setContactCel(model.getContactCel());
		preModel.setDriverName(model.getDriverName());
		preModel.setDriverCel(model.getDriverCel());
		preModel.setDriverName2(model.getDriverName2());
		preModel.setDriverCel2(model.getDriverCel2());
		preModel.setPsDetail(model.getPsDetail());
		preModel.setTotalAmount(model.getTotalAmount());
		preModel.setPsDate(model.getPsDate());
		preModel.setRemark(model.getRemark());
		String today = sdf2.format(new Date());
		sendLogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	修改
	*/
	@Override
	public String update1(SendLog model,LoginModel login){
		SendLog preModel = sendLogMapper.selectByPrimaryKey(model.getId());
		if(model.getTitle()==null||model.getTitle().equals("")){
			return "标题为必填属性";
		}
		if(model.getPsIntro()==null||model.getPsIntro().equals("")){
			return "配送说明为必填属性";
		}
		if(model.getAddress()==null||model.getAddress().equals("")){
			return "配送地址为必填属性";
		}
		if(model.getContactName()==null||model.getContactName().equals("")){
			return "联系人为必填属性";
		}
		if(model.getContactCel()==null||model.getContactCel().equals("")){
			return "联系电话为必填属性";
		}
		if(model.getContactCel()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getContactCel());
			if( m.matches()==false){
				return "请输入正确的联系电话";
			}
		}
		if(model.getDriverName()==null||model.getDriverName().equals("")){
			return "司机为必填属性";
		}
		if(model.getDriverCel()==null||model.getDriverCel().equals("")){
			return "副驾驶为必填属性";
		}
		if(model.getDriverName2()==null||model.getDriverName2().equals("")){
			return "司机电话为必填属性";
		}
		if(model.getDriverName2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverName2());
			if( m.matches()==false){
				return "请输入正确的司机电话";
			}
		}
		if(model.getDriverCel2()==null||model.getDriverCel2().equals("")){
			return "副驾驶电话为必填属性";
		}
		if(model.getDriverCel2()!=null){
		Pattern p = Pattern.compile("^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$");
			Matcher m = p.matcher(model.getDriverCel2());
			if( m.matches()==false){
				return "请输入正确的副驾驶电话";
			}
		}
		if(model.getPsDetail()==null||model.getPsDetail().equals("")){
			return "配送单详情为必填属性";
		}
		if(model.getPsDetail()!=null){
			String [] fileSplit = model.getPsDetail().split(";");
			if(fileSplit.length>1){
				return "配送单详情的文件数量不能大于1";
			}
		}
		if(model.getTotalAmount()==null||model.getTotalAmount().equals("")){
			return "价值总额为必填属性";
		}
		if(model.getPsDate()==null||model.getPsDate().equals("")){
			return "配送日期为必填属性";
		}
		if(model.getRemark()==null||model.getRemark().equals("")){
			return "备注为必填属性";
		}
		preModel.setTitle(model.getTitle());
		preModel.setPsIntro(model.getPsIntro());
		preModel.setAddress(model.getAddress());
		preModel.setContactName(model.getContactName());
		preModel.setContactCel(model.getContactCel());
		preModel.setDriverName(model.getDriverName());
		preModel.setDriverCel(model.getDriverCel());
		preModel.setDriverName2(model.getDriverName2());
		preModel.setDriverCel2(model.getDriverCel2());
		preModel.setPsDetail(model.getPsDetail());
		preModel.setTotalAmount(model.getTotalAmount());
		preModel.setPsDate(model.getPsDate());
		preModel.setRemark(model.getRemark());
		String today = sdf2.format(new Date());
		sendLogMapper.updateByPrimaryKey(preModel);//更新数据
		return "";
	}
	/**
	*根据参数查询配送单列表总数
	*/
	@Override
	public Map<String,Integer> getDataListCount(SendLog queryModel,Integer pageSize,LoginModel login) {
		SendLogExample se = new SendLogExample();
		SendLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getTitle()!=null&&queryModel.getTitle().equals("")==false){
			sc.andTitleLike("%"+queryModel.getTitle()+"%");//模糊查询
		}
		int count = (int)sendLogMapper.countByExample(se);
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
	*根据参数查询配送单列表数据
	*/
	@Override
	public Map<String,Object> getDataList(SendLog queryModel,Integer page,Integer pageSize,LoginModel login) {
		SendLogExample se = new SendLogExample();
		SendLogExample.Criteria sc = se.createCriteria();
		se.setOrderByClause("id desc");//默认按照id倒序排序
		if(queryModel.getId()!=null){
			sc.andIdEqualTo(queryModel.getId());
		}
		if(queryModel.getTitle()!=null&&queryModel.getTitle().equals("")==false){
			sc.andTitleLike("%"+queryModel.getTitle()+"%");//模糊查询
		}
		if(page!=null&&pageSize!=null){
			se.setPageRows(pageSize);
			se.setStartRow((page-1)*pageSize);
		}
		List<SendLog> list = sendLogMapper.selectByExample(se);//执行查询语句
		Map<String,Object> rs = new HashMap<String,Object>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
		for(SendLog model:list){
			list2.add(getSendLogModel(model,login));
		}
		rs.put("list",list2);//数据列表
		return rs;
	}
	/**
	封装配送单为前台展示的数据形式
	*/
	@Override
	public Map<String,Object> getSendLogModel(SendLog model,LoginModel login){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("sendLog",model);
		return map;
	}
	/**
	* 删除数据
	*/
	@Override
	public void delete(Integer id) {
		sendLogMapper.deleteByPrimaryKey(id);
	}
}
