package com.car.model;
public class Moutlog {
	private Integer id;//ID
	private Integer materialId;//物料ID
	private String mno;//物料编号
	private String mname;//物料名
	private Integer num;//出库数量
	private String remark;//出库备注
	private String ckDate;//出库日期
	private Integer isComfirm;//是否确认
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getMaterialId(){
		return materialId;
	}
	public void setMaterialId(Integer materialId){
		this.materialId = materialId;
	}
	public String getMno(){
		return mno;
	}
	public void setMno(String mno){
		this.mno = mno == null ? null : mno.trim();
	}
	public String getMname(){
		return mname;
	}
	public void setMname(String mname){
		this.mname = mname == null ? null : mname.trim();
	}
	public Integer getNum(){
		return num;
	}
	public void setNum(Integer num){
		this.num = num;
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.trim();
	}
	public String getCkDate(){
		return ckDate;
	}
	public void setCkDate(String ckDate){
		this.ckDate = ckDate == null ? null : ckDate.trim();
	}
	public Integer getIsComfirm(){
		return isComfirm;
	}
	public void setIsComfirm(Integer isComfirm){
		this.isComfirm = isComfirm;
	}
}
