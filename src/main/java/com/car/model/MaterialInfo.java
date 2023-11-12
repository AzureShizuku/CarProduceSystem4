package com.car.model;
public class MaterialInfo {
	private Integer id;//ID
	private String mname;//物料名
	private String mintro;//物料介绍
	private Double stockNum;//库存量
	private String dw;//单位
	private String gg;//规格
	private Integer providerId;//供应商
	private String mno;//物料编号
	private String jsbz;//技术标准
	private Double price;//参考价格
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getMname(){
		return mname;
	}
	public void setMname(String mname){
		this.mname = mname == null ? null : mname.trim();
	}
	public String getMintro(){
		return mintro;
	}
	public void setMintro(String mintro){
		this.mintro = mintro == null ? null : mintro.trim();
	}
	public Double getStockNum(){
		return stockNum;
	}
	public void setStockNum(Double stockNum){
		this.stockNum = stockNum;
	}
	public String getDw(){
		return dw;
	}
	public void setDw(String dw){
		this.dw = dw == null ? null : dw.trim();
	}
	public String getGg(){
		return gg;
	}
	public void setGg(String gg){
		this.gg = gg == null ? null : gg.trim();
	}
	public Integer getProviderId(){
		return providerId;
	}
	public void setProviderId(Integer providerId){
		this.providerId = providerId;
	}
	public String getMno(){
		return mno;
	}
	public void setMno(String mno){
		this.mno = mno == null ? null : mno.trim();
	}
	public String getJsbz(){
		return jsbz;
	}
	public void setJsbz(String jsbz){
		this.jsbz = jsbz == null ? null : jsbz.trim();
	}
	public Double getPrice(){
		return price;
	}
	public void setPrice(Double price){
		this.price = price;
	}
}
