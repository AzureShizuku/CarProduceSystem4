package com.car.model;
public class SendLog {
	private Integer id;//ID
	private String title;//标题
	private String psIntro;//配送说明
	private String address;//配送地址
	private String contactName;//联系人
	private String contactCel;//联系电话
	private String driverName;//司机
	private String driverCel;//副驾驶
	private String driverName2;//司机电话
	private String driverCel2;//副驾驶电话
	private String psDetail;//配送单详情
	private String totalAmount;//价值总额
	private String psDate;//配送日期
	private String remark;//备注
	private String createDate;//创建日期
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
	public String getPsIntro(){
		return psIntro;
	}
	public void setPsIntro(String psIntro){
		this.psIntro = psIntro == null ? null : psIntro.trim();
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address == null ? null : address.trim();
	}
	public String getContactName(){
		return contactName;
	}
	public void setContactName(String contactName){
		this.contactName = contactName == null ? null : contactName.trim();
	}
	public String getContactCel(){
		return contactCel;
	}
	public void setContactCel(String contactCel){
		this.contactCel = contactCel == null ? null : contactCel.trim();
	}
	public String getDriverName(){
		return driverName;
	}
	public void setDriverName(String driverName){
		this.driverName = driverName == null ? null : driverName.trim();
	}
	public String getDriverCel(){
		return driverCel;
	}
	public void setDriverCel(String driverCel){
		this.driverCel = driverCel == null ? null : driverCel.trim();
	}
	public String getDriverName2(){
		return driverName2;
	}
	public void setDriverName2(String driverName2){
		this.driverName2 = driverName2 == null ? null : driverName2.trim();
	}
	public String getDriverCel2(){
		return driverCel2;
	}
	public void setDriverCel2(String driverCel2){
		this.driverCel2 = driverCel2 == null ? null : driverCel2.trim();
	}
	public String getPsDetail(){
		return psDetail;
	}
	public void setPsDetail(String psDetail){
		this.psDetail = psDetail == null ? null : psDetail.trim();
	}
	public String getTotalAmount(){
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount){
		this.totalAmount = totalAmount == null ? null : totalAmount.trim();
	}
	public String getPsDate(){
		return psDate;
	}
	public void setPsDate(String psDate){
		this.psDate = psDate == null ? null : psDate.trim();
	}
	public String getRemark(){
		return remark;
	}
	public void setRemark(String remark){
		this.remark = remark == null ? null : remark.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
}
