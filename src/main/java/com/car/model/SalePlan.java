package com.car.model;
public class SalePlan {
	private Integer id;//ID
	private String planName;//计划名
	private String planDetail;//计划详情
	private String ksDate;//开始日期
	private String jsDate;//结束日期
	private String createDate;//创建日期
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getPlanName(){
		return planName;
	}
	public void setPlanName(String planName){
		this.planName = planName == null ? null : planName.trim();
	}
	public String getPlanDetail(){
		return planDetail;
	}
	public void setPlanDetail(String planDetail){
		this.planDetail = planDetail == null ? null : planDetail.trim();
	}
	public String getKsDate(){
		return ksDate;
	}
	public void setKsDate(String ksDate){
		this.ksDate = ksDate == null ? null : ksDate.trim();
	}
	public String getJsDate(){
		return jsDate;
	}
	public void setJsDate(String jsDate){
		this.jsDate = jsDate == null ? null : jsDate.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
}
