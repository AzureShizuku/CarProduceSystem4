package com.car.model;
public class Pinlog {
	private Integer id;//ID
	private Integer stockId;//台账ID
	private String proNo;//商品编号
	private String proName;//商品名
	private Integer num;//商品数
	private String remark;//入库备注
	private Integer status;//确认状态
	private String createDate;//创建日期
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public Integer getStockId(){
		return stockId;
	}
	public void setStockId(Integer stockId){
		this.stockId = stockId;
	}
	public String getProNo(){
		return proNo;
	}
	public void setProNo(String proNo){
		this.proNo = proNo == null ? null : proNo.trim();
	}
	public String getProName(){
		return proName;
	}
	public void setProName(String proName){
		this.proName = proName == null ? null : proName.trim();
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
	public Integer getStatus(){
		return status;
	}
	public void setStatus(Integer status){
		this.status = status;
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
}
