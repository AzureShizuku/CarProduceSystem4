package com.car.model;
public class ProRequest {
	private Integer id;//ID
	private Integer stockId;//库存台账ID
	private String proNo;//商品编号
	private String proName;//商品名
	private Integer needNum;//需求数量
	private String jfDate;//交付日期
	private String createDate;//创建日期
	private String requestIntro;//请求说明
	private String requestFile;//附件
	private Integer requestStatus;//请求状态
	private String checkRemark;//审核备注
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
	public Integer getNeedNum(){
		return needNum;
	}
	public void setNeedNum(Integer needNum){
		this.needNum = needNum;
	}
	public String getJfDate(){
		return jfDate;
	}
	public void setJfDate(String jfDate){
		this.jfDate = jfDate == null ? null : jfDate.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
	public String getRequestIntro(){
		return requestIntro;
	}
	public void setRequestIntro(String requestIntro){
		this.requestIntro = requestIntro == null ? null : requestIntro.trim();
	}
	public String getRequestFile(){
		return requestFile;
	}
	public void setRequestFile(String requestFile){
		this.requestFile = requestFile == null ? null : requestFile.trim();
	}
	public Integer getRequestStatus(){
		return requestStatus;
	}
	public void setRequestStatus(Integer requestStatus){
		this.requestStatus = requestStatus;
	}
	public String getCheckRemark(){
		return checkRemark;
	}
	public void setCheckRemark(String checkRemark){
		this.checkRemark = checkRemark == null ? null : checkRemark.trim();
	}
}
