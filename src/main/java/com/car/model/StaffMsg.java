package com.car.model;
public class StaffMsg {
	private Integer id;//ID
	private String staffNo;//员工号
	private String password;//密码
	private String realName;//姓名
	private String celPhone;//联系电话
	private String email;//邮箱
	private String createTime;//创建时间
	private Integer staffType;//权限类型
	public Integer getId(){
		return id;
	}
	public void setId(Integer id){
		this.id = id;
	}
	public String getStaffNo(){
		return staffNo;
	}
	public void setStaffNo(String staffNo){
		this.staffNo = staffNo == null ? null : staffNo.trim();
	}
	public String getPassword(){
		return password;
	}
	public void setPassword(String password){
		this.password = password == null ? null : password.trim();
	}
	public String getRealName(){
		return realName;
	}
	public void setRealName(String realName){
		this.realName = realName == null ? null : realName.trim();
	}
	public String getCelPhone(){
		return celPhone;
	}
	public void setCelPhone(String celPhone){
		this.celPhone = celPhone == null ? null : celPhone.trim();
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email == null ? null : email.trim();
	}
	public String getCreateTime(){
		return createTime;
	}
	public void setCreateTime(String createTime){
		this.createTime = createTime == null ? null : createTime.trim();
	}
	public Integer getStaffType(){
		return staffType;
	}
	public void setStaffType(Integer staffType){
		this.staffType = staffType;
	}
}
