package com.car.model;
public class ProLog {
	private Integer id;//ID
	private Integer stockId;//库存台账ID
	private String stockProNo;//商品编号
	private String stockProName;//商品名
	private String checkIntro;//质检说明
	private String checkFile;//质检证书
	private String createDate;//创建日期
	private String proNo;//生产编号
	private Integer inStatus;//入库状态
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
	public String getStockProNo(){
		return stockProNo;
	}
	public void setStockProNo(String stockProNo){
		this.stockProNo = stockProNo == null ? null : stockProNo.trim();
	}
	public String getStockProName(){
		return stockProName;
	}
	public void setStockProName(String stockProName){
		this.stockProName = stockProName == null ? null : stockProName.trim();
	}
	public String getCheckIntro(){
		return checkIntro;
	}
	public void setCheckIntro(String checkIntro){
		this.checkIntro = checkIntro == null ? null : checkIntro.trim();
	}
	public String getCheckFile(){
		return checkFile;
	}
	public void setCheckFile(String checkFile){
		this.checkFile = checkFile == null ? null : checkFile.trim();
	}
	public String getCreateDate(){
		return createDate;
	}
	public void setCreateDate(String createDate){
		this.createDate = createDate == null ? null : createDate.trim();
	}
	public String getProNo(){
		return proNo;
	}
	public void setProNo(String proNo){
		this.proNo = proNo == null ? null : proNo.trim();
	}
	public Integer getInStatus(){
		return inStatus;
	}
	public void setInStatus(Integer inStatus){
		this.inStatus = inStatus;
	}
}
