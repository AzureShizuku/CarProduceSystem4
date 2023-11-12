package com.car.model;
public class ProPlan {
	private Integer id;//ID
	private String pname;//计划名
	private String pintro;//生产介绍
	private String pdetail;//生产详情单
	private String ksDate;//开始日期
	private String jsDate;//结束日期
	private String createDate;//创建日期
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getPname(){
		return pname;
	}
	public void setPname(String pname){
		this.pname = pname == null ? null : pname.trim();
	}
	public String getPintro(){
		return pintro;
	}
	public void setPintro(String pintro){
		this.pintro = pintro == null ? null : pintro.trim();
	}
	public String getPdetail(){
		return pdetail;
	}
	public void setPdetail(String pdetail){
		this.pdetail = pdetail == null ? null : pdetail.trim();
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
