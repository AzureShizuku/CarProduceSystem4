package com.car.model;
public class MneedMsg {
	private Integer id;//ID
	private String title;//标题
	private String nintro;//需求说明
	private String ndetail;//需求详情
	private String createDate;//创建日期
	private String jfDate;//交付日期
	private Integer checkStatus;//请求状态
	private String checkRemark;//审核备注
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title == null ? null : title.trim();
	}
	public String getNintro(){
		return nintro;
	}
	public void setNintro(String nintro){
		this.nintro = nintro == null ? null : nintro.trim();
	}
	public String getNdetail(){
		return ndetail;
	}
	public void setNdetail(String ndetail){
		this.ndetail = ndetail == null ? null : ndetail.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
	public String getJfDate(){
		return jfDate;
	}
	public void setJfDate(String jfDate){
		this.jfDate = jfDate == null ? null : jfDate.trim();
	}
	public Integer getCheckStatus(){
		return checkStatus;
	}
	public void setCheckStatus(Integer checkStatus){
		this.checkStatus = checkStatus;
	}
	public String getCheckRemark(){
		return checkRemark;
	}
	public void setCheckRemark(String checkRemark){
		this.checkRemark = checkRemark == null ? null : checkRemark.trim();
	}
}
