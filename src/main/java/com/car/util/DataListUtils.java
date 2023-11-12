package com.car.util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
*
数据列表解释器，键值对列举说明工具，例如性别字段：1表示男，2表示女
*
*/
public class DataListUtils {
	public static void main(String[] args) {
	}
	/**
	**获取登录角色列表
	*/
	public static List<Map<String,Object>> getLoginTypeList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","admin"));
		list.add(getMap("2","staff"));
		list.add(getMap("3","provider"));
		return list;
	}
	/**
	**获取staff_type数据列表
	*/
	public static List<Map<String,Object>> getStaffTypeList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","销售科"));
		list.add(getMap("2","库存科"));
		list.add(getMap("3","配送科"));
		list.add(getMap("4","服务科"));
		list.add(getMap("5","生产车间"));
		list.add(getMap("6","供应链管理科"));
		list.add(getMap("7","物料保障科"));
		return list;
	}
	public static String getStaffTypeNameById(String id){//根据staff_type的key值获取名称
		List<Map<String,Object>> list = getStaffTypeList();
		return getNameById(id,list);
	}
	/**
	**获取need_status数据列表
	*/
	public static List<Map<String,Object>> getNeedStatusList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","已申请"));
		list.add(getMap("2","已接受申请"));
		list.add(getMap("3","已拒绝申请"));
		return list;
	}
	public static String getNeedStatusNameById(String id){//根据need_status的key值获取名称
		List<Map<String,Object>> list = getNeedStatusList();
		return getNameById(id,list);
	}
	/**
	**获取purchase_status数据列表
	*/
	public static List<Map<String,Object>> getPurchaseStatusList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","未到货"));
		list.add(getMap("2","已到货"));
		return list;
	}
	public static String getPurchaseStatusNameById(String id){//根据purchase_status的key值获取名称
		List<Map<String,Object>> list = getPurchaseStatusList();
		return getNameById(id,list);
	}
	/**
	**获取is_comfirm数据列表
	*/
	public static List<Map<String,Object>> getIsComfirmList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","未确认"));
		list.add(getMap("2","已确认"));
		return list;
	}
	public static String getIsComfirmNameById(String id){//根据is_comfirm的key值获取名称
		List<Map<String,Object>> list = getIsComfirmList();
		return getNameById(id,list);
	}
	/**
	**获取eval_type数据列表
	*/
	public static List<Map<String,Object>> getEvalTypeList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","一级供应商"));
		list.add(getMap("2","二级供应商"));
		list.add(getMap("3","三级供应商"));
		list.add(getMap("4","四级供应商"));
		list.add(getMap("5","五级供应商"));
		list.add(getMap("6","资质不足"));
		return list;
	}
	public static String getEvalTypeNameById(String id){//根据eval_type的key值获取名称
		List<Map<String,Object>> list = getEvalTypeList();
		return getNameById(id,list);
	}
	/**
	**获取pro_status数据列表
	*/
	public static List<Map<String,Object>> getProStatusList(){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		list.add(getMap("1","未入库"));
		list.add(getMap("2","已入库"));
		return list;
	}
	public static String getProStatusNameById(String id){//根据pro_status的key值获取名称
		List<Map<String,Object>> list = getProStatusList();
		return getNameById(id,list);
	}
	public static String getNameById(String id,List<Map<String,Object>> list){
		if(id==null){
			return null;
		}
		if(id.endsWith(",")){
			id = id.substring(0,id.length()-1);
		}
		String[] idsplit = id.split(",");
		String rs = "";
		for(String tmp:idsplit){
			for(Map<String,Object> map:list){
				if(map.get("id").toString().equals(tmp)){
					rs+=map.get("name").toString()+",";
				}
			}
		}
		if(rs.endsWith(",")){
			rs = rs.substring(0,rs.length()-1);
		}
		return rs;
	}
	private static Map<String,Object> getMap(String id,String name){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", id);
		map.put("name", name);
		return map;
	}
}
