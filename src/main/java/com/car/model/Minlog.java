package com.car.model;
public class Minlog {
	private Integer id;//ID
	private Integer materialId;//物料ID
	private Integer num;//入库数量
	private String inRemark;//入库备注
	private String createDate;//创建日期
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
	public Integer getNum(){
		return num;
	}
	public void setNum(Integer num){
		this.num = num;
	}
	public String getInRemark(){
		return inRemark;
	}
	public void setInRemark(String inRemark){
		this.inRemark = inRemark == null ? null : inRemark.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
	public Integer getIsComfirm(){
		return isComfirm;
	}
	public void setIsComfirm(Integer isComfirm){
		this.isComfirm = isComfirm;
	}
}
