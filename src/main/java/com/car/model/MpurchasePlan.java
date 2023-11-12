package com.car.model;
public class MpurchasePlan {
	private Integer id;//ID
	private String title;//标题
	private String pintro;//采购说明
	private String pdetail;//采购详情
	private Double totalAmount;//采购总额
	private String jfDate;//交付日期
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
	public Double getTotalAmount(){
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount){
		this.totalAmount = totalAmount;
	}
	public String getJfDate(){
		return jfDate;
	}
	public void setJfDate(String jfDate){
		this.jfDate = jfDate == null ? null : jfDate.trim();
	}
}
