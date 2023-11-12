package com.car.model;
public class SaleLog {
	private Integer id;//ID
	private String orderNo;//订单编号
	private Integer stockId;//库存台账ID
	private String proNo;//商品编号
	private String proName;//商品名
	private Integer num;//销售数量
	private Double amount;//销售金额
	private String htFile;//销售合同
	private String createDate;//创建日期
	private Integer staffId;//销售员工
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getOrderNo(){
		return orderNo;
	}
	public void setOrderNo(String orderNo){
		this.orderNo = orderNo == null ? null : orderNo.trim();
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
	public Double getAmount(){
		return amount;
	}
	public void setAmount(Double amount){
		this.amount = amount;
	}
	public String getHtFile(){
		return htFile;
	}
	public void setHtFile(String htFile){
		this.htFile = htFile == null ? null : htFile.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
	public Integer getStaffId(){
		return staffId;
	}
	public void setStaffId(Integer staffId){
		this.staffId = staffId;
	}
}
