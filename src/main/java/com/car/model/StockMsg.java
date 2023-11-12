package com.car.model;
public class StockMsg {
	private Integer id;//ID
	private String proNo;//商品编号
	private String proName;//商品名
	private String gg;//规格
	private String dw;//单位
	private Double price;//单价
	private Integer num;//数量
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
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
	public Double getPrice(){
		return price;
	}
	public void setPrice(Double price){
		this.price = price;
	}
	public Integer getNum(){
		return num;
	}
	public void setNum(Integer num){
		this.num = num;
	}
}
