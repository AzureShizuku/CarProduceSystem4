package com.car.model;
public class ProviderApp {
	private Integer id;//ID
	private String name;//厂家名
	private String contactName;//联系人
	private String celcontact_;//联系电话
	private String address;//地址
	private String gm;//厂家规模
	private String proNames;//生产产品
	private String proDetail;//产品报价单
	private String createDate;//创建日期
	private Integer evalType;//评价等级
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name == null ? null : name.trim();
	}
	public String getContactName(){
		return contactName;
	}
	public void setContactName(String contactName){
		this.contactName = contactName == null ? null : contactName.trim();
	}
	public String getCelcontact_(){
		return celcontact_;
	}
	public void setCelcontact_(String celcontact_){
		this.celcontact_ = celcontact_ == null ? null : celcontact_.trim();
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address == null ? null : address.trim();
	}
	public String getGm(){
		return gm;
	}
	public void setGm(String gm){
		this.gm = gm == null ? null : gm.trim();
	}
	public String getProNames(){
		return proNames;
	}
	public void setProNames(String proNames){
		this.proNames = proNames == null ? null : proNames.trim();
	}
	public String getProDetail(){
		return proDetail;
	}
	public void setProDetail(String proDetail){
		this.proDetail = proDetail == null ? null : proDetail.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
	public Integer getEvalType(){
		return evalType;
	}
	public void setEvalType(Integer evalType){
		this.evalType = evalType;
	}
}
