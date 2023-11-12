package com.car.model;
public class PurchaseLog {
	private Integer id;//ID
	private String no;//订货单编号
	private String name;//物料名
	private String gg;//规格
	private String dw;//单位
	private String jsbz;//技术标准
	private Integer sl;//数量
	private Double price;//采购价格
	private Double totalAmount;//总金额
	private String jfDate;//交付日期
	private Integer checkStatus;//审核状态
	private String checkRemark;//审核备注
	private Integer providerId;//供应商ID
	private String createDate;//创建日期
	private Integer purchaseStatus;//订货单类型
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
	public String getDw(){
		return dw;
	}
	public void setDw(String dw){
		this.dw = dw == null ? null : dw.trim();
	}
	public String getJsbz(){
		return jsbz;
	}
	public void setJsbz(String jsbz){
		this.jsbz = jsbz == null ? null : jsbz.trim();
	}
	public Integer getSl(){
		return sl;
	}
	public void setSl(Integer sl){
		this.sl = sl;
	}
	public Double getPrice(){
		return price;
	}
	public void setPrice(Double price){
		this.price = price;
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
	public Integer getProviderId(){
		return providerId;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
	public Integer getPurchaseStatus(){
		return purchaseStatus;
	}
	public void setPurchaseStatus(Integer purchaseStatus){
		this.purchaseStatus = purchaseStatus;
	}
}
