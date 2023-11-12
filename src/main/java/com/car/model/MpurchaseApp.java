package com.car.model;
public class MpurchaseApp {
	private Integer id;//ID
	private String no;//物料编号
	private String name;//物料名
	private String gg;//规格
	private String mtype;//型号
	private String pintro;//采购说明
	private String mstandard;//技术标准
	private Integer num;//数量
	private Double price;//参考价格
	private Double planPrice;//预购价格
	private Double totalAmount;//总金额
	private String dhDate;//到货日期
	private Integer checkStatus;//审核状态
	private String shbz;//审核备注
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getNo(){
		return no;
	}
	public void setNo(String no){
		this.no = no == null ? null : no.trim();
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name == null ? null : name.trim();
	}
	public String getGg(){
		return gg;
	}
	public void setGg(String gg){
		this.gg = gg == null ? null : gg.trim();
	}
	public String getMtype(){
		return mtype;
	}
	public void setMtype(String mtype){
		this.mtype = mtype == null ? null : mtype.trim();
	}
	public String getPintro(){
		return pintro;
	}
	public void setPintro(String pintro){
		this.pintro = pintro == null ? null : pintro.trim();
	}
	public String getMstandard(){
		return mstandard;
	}
	public void setMstandard(String mstandard){
		this.mstandard = mstandard == null ? null : mstandard.trim();
	}
	public Integer getNum(){
		return num;
	}
	public void setNum(Integer num){
		this.num = num;
	}
	public Double getPrice(){
		return price;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Double getPlanPrice(){
		return planPrice;
	}
	public void setPlanPrice(Double planPrice){
		this.planPrice = planPrice;
	}
	public Double getTotalAmount(){
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount){
		this.totalAmount = totalAmount;
	}
	public String getDhDate(){
		return dhDate;
	}
	public void setDhDate(String dhDate){
		this.dhDate = dhDate == null ? null : dhDate.trim();
	}
	public Integer getCheckStatus(){
		return checkStatus;
	}
	public void setCheckStatus(Integer checkStatus){
		this.checkStatus = checkStatus;
	}
	public String getShbz(){
		return shbz;
	}
	public void setShbz(String shbz){
		this.shbz = shbz == null ? null : shbz.trim();
	}
}
