package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class ProviderExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ProviderExample() {
		oredCriteria = new ArrayList<>();
	}
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}
	public String getOrderByClause() {
		return orderByClause;
	}
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}
	public boolean isDistinct() {
		return distinct;
	}
	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}
	public int getStartRow() {
		return startRow;
	}
	public void setPageRows(int pageRows) {
		this.pageRows = pageRows;
	}
	public int getPageRows() {
		return pageRows;
	}
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;
		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}
		public boolean isValid() {
			return criteria.size() > 0;
		}
		public List<Criterion> getAllCriteria() {
			return criteria;
		}
		public List<Criterion> getCriteria() {
			return criteria;
		}
		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}
		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}
		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}
		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}
		public Criteria andIdIsNotNull(){
			addCriterion("id is not null");
			return (Criteria) this;
		}
		public Criteria andIdEqualTo(Integer value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotEqualTo(Integer value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdGreaterThan(Integer value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("id >=", value, "Id");
			return (Criteria) this;
		}
		public Criteria andIdLessThan(Integer value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdLessThanOrEqualTo(Integer value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdIn(List<Integer> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotIn(List<Integer> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}
		public Criteria andIdBetween(Integer value1, Integer value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotBetween(Integer value1, Integer value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}
		public Criteria andIdLike(Integer value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}
		public Criteria andIdNotLike(Integer value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}
		public Criteria andLoginNameIsNull() {
			addCriterion("login_name is null");
			return (Criteria) this;
		}
		public Criteria andLoginNameIsNotNull(){
			addCriterion("login_name is not null");
			return (Criteria) this;
		}
		public Criteria andLoginNameEqualTo(String value) {
			addCriterion("login_name =", value, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameNotEqualTo(String value) {
			addCriterion("login_name <>", value, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameGreaterThan(String value) {
			addCriterion("login_name >", value, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
			addCriterion("login_name >=", value, "LoginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameLessThan(String value) {
			addCriterion("login_name <", value, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameLessThanOrEqualTo(String value) {
			addCriterion("login_name <=", value, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameIn(List<String> values) {
			addCriterion("login_name in", values, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameNotIn(List<String> values) {
			addCriterion("login_name not in", values, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameBetween(String value1, String value2) {
			addCriterion("login_name between", value1, value2, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameNotBetween(String value1, String value2) {
			addCriterion("login_name not between", value1, value2, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameLike(String value) {
			addCriterion("login_name like", value, "loginName");
			return (Criteria) this;
		}
		public Criteria andLoginNameNotLike(String value) {
			addCriterion("login_name not like", value, "loginName");
			return (Criteria) this;
		}
		public Criteria andPasswordIsNull() {
			addCriterion("password is null");
			return (Criteria) this;
		}
		public Criteria andPasswordIsNotNull(){
			addCriterion("password is not null");
			return (Criteria) this;
		}
		public Criteria andPasswordEqualTo(String value) {
			addCriterion("password =", value, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordNotEqualTo(String value) {
			addCriterion("password <>", value, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordGreaterThan(String value) {
			addCriterion("password >", value, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordGreaterThanOrEqualTo(String value) {
			addCriterion("password >=", value, "Password");
			return (Criteria) this;
		}
		public Criteria andPasswordLessThan(String value) {
			addCriterion("password <", value, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordLessThanOrEqualTo(String value) {
			addCriterion("password <=", value, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordIn(List<String> values) {
			addCriterion("password in", values, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordNotIn(List<String> values) {
			addCriterion("password not in", values, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordBetween(String value1, String value2) {
			addCriterion("password between", value1, value2, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordNotBetween(String value1, String value2) {
			addCriterion("password not between", value1, value2, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordLike(String value) {
			addCriterion("password like", value, "password");
			return (Criteria) this;
		}
		public Criteria andPasswordNotLike(String value) {
			addCriterion("password not like", value, "password");
			return (Criteria) this;
		}
		public Criteria andCelPhoneIsNull() {
			addCriterion("cel_phone is null");
			return (Criteria) this;
		}
		public Criteria andCelPhoneIsNotNull(){
			addCriterion("cel_phone is not null");
			return (Criteria) this;
		}
		public Criteria andCelPhoneEqualTo(String value) {
			addCriterion("cel_phone =", value, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneNotEqualTo(String value) {
			addCriterion("cel_phone <>", value, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneGreaterThan(String value) {
			addCriterion("cel_phone >", value, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("cel_phone >=", value, "CelPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneLessThan(String value) {
			addCriterion("cel_phone <", value, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneLessThanOrEqualTo(String value) {
			addCriterion("cel_phone <=", value, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneIn(List<String> values) {
			addCriterion("cel_phone in", values, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneNotIn(List<String> values) {
			addCriterion("cel_phone not in", values, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneBetween(String value1, String value2) {
			addCriterion("cel_phone between", value1, value2, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneNotBetween(String value1, String value2) {
			addCriterion("cel_phone not between", value1, value2, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneLike(String value) {
			addCriterion("cel_phone like", value, "celPhone");
			return (Criteria) this;
		}
		public Criteria andCelPhoneNotLike(String value) {
			addCriterion("cel_phone not like", value, "celPhone");
			return (Criteria) this;
		}
		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}
		public Criteria andEmailIsNotNull(){
			addCriterion("email is not null");
			return (Criteria) this;
		}
		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "Email");
			return (Criteria) this;
		}
		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}
		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
			return (Criteria) this;
		}
		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}
		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}
		public Criteria andAddressIsNull() {
			addCriterion("address is null");
			return (Criteria) this;
		}
		public Criteria andAddressIsNotNull(){
			addCriterion("address is not null");
			return (Criteria) this;
		}
		public Criteria andAddressEqualTo(String value) {
			addCriterion("address =", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotEqualTo(String value) {
			addCriterion("address <>", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressGreaterThan(String value) {
			addCriterion("address >", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressGreaterThanOrEqualTo(String value) {
			addCriterion("address >=", value, "Address");
			return (Criteria) this;
		}
		public Criteria andAddressLessThan(String value) {
			addCriterion("address <", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressLessThanOrEqualTo(String value) {
			addCriterion("address <=", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressIn(List<String> values) {
			addCriterion("address in", values, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotIn(List<String> values) {
			addCriterion("address not in", values, "address");
			return (Criteria) this;
		}
		public Criteria andAddressBetween(String value1, String value2) {
			addCriterion("address between", value1, value2, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotBetween(String value1, String value2) {
			addCriterion("address not between", value1, value2, "address");
			return (Criteria) this;
		}
		public Criteria andAddressLike(String value) {
			addCriterion("address like", value, "address");
			return (Criteria) this;
		}
		public Criteria andAddressNotLike(String value) {
			addCriterion("address not like", value, "address");
			return (Criteria) this;
		}
		public Criteria andRemarkIsNull() {
			addCriterion("remark is null");
			return (Criteria) this;
		}
		public Criteria andRemarkIsNotNull(){
			addCriterion("remark is not null");
			return (Criteria) this;
		}
		public Criteria andRemarkEqualTo(String value) {
			addCriterion("remark =", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("remark <>", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("remark >", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("remark >=", value, "Remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLessThan(String value) {
			addCriterion("remark <", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("remark <=", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkIn(List<String> values) {
			addCriterion("remark in", values, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotIn(List<String> values) {
			addCriterion("remark not in", values, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("remark between", value1, value2, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("remark not between", value1, value2, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkLike(String value) {
			addCriterion("remark like", value, "remark");
			return (Criteria) this;
		}
		public Criteria andRemarkNotLike(String value) {
			addCriterion("remark not like", value, "remark");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIsNull() {
			addCriterion("create_time is null");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIsNotNull(){
			addCriterion("create_time is not null");
			return (Criteria) this;
		}
		public Criteria andCreateTimeEqualTo(String value) {
			addCriterion("create_time =", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotEqualTo(String value) {
			addCriterion("create_time <>", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeGreaterThan(String value) {
			addCriterion("create_time >", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
			addCriterion("create_time >=", value, "CreateTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLessThan(String value) {
			addCriterion("create_time <", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLessThanOrEqualTo(String value) {
			addCriterion("create_time <=", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeIn(List<String> values) {
			addCriterion("create_time in", values, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotIn(List<String> values) {
			addCriterion("create_time not in", values, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeBetween(String value1, String value2) {
			addCriterion("create_time between", value1, value2, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotBetween(String value1, String value2) {
			addCriterion("create_time not between", value1, value2, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeLike(String value) {
			addCriterion("create_time like", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andCreateTimeNotLike(String value) {
			addCriterion("create_time not like", value, "createTime");
			return (Criteria) this;
		}
		public Criteria andGysdjIsNull() {
			addCriterion("gysdj is null");
			return (Criteria) this;
		}
		public Criteria andGysdjIsNotNull(){
			addCriterion("gysdj is not null");
			return (Criteria) this;
		}
		public Criteria andGysdjEqualTo(Integer value) {
			addCriterion("gysdj =", value, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjNotEqualTo(Integer value) {
			addCriterion("gysdj <>", value, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjGreaterThan(Integer value) {
			addCriterion("gysdj >", value, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjGreaterThanOrEqualTo(Integer value) {
			addCriterion("gysdj >=", value, "Gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjLessThan(Integer value) {
			addCriterion("gysdj <", value, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjLessThanOrEqualTo(Integer value) {
			addCriterion("gysdj <=", value, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjIn(List<Integer> values) {
			addCriterion("gysdj in", values, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjNotIn(List<Integer> values) {
			addCriterion("gysdj not in", values, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjBetween(Integer value1, Integer value2) {
			addCriterion("gysdj between", value1, value2, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjNotBetween(Integer value1, Integer value2) {
			addCriterion("gysdj not between", value1, value2, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjLike(Integer value) {
			addCriterion("gysdj like", value, "gysdj");
			return (Criteria) this;
		}
		public Criteria andGysdjNotLike(Integer value) {
			addCriterion("gysdj not like", value, "gysdj");
			return (Criteria) this;
		}
	}
	public static class Criteria extends GeneratedCriteria {
		protected Criteria() {
			super();
		}
	}
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;
		public String getCondition() {
			return condition;
		}
		public Object getValue() {
			return value;
		}
		public Object getSecondValue() {
			return secondValue;
		}
		public boolean isNoValue() {
			return noValue;
		}
		public boolean isSingleValue() {
			return singleValue;
		}
		public boolean isBetweenValue() {
			return betweenValue;
		}
		public boolean isListValue() {
			return listValue;
		}
		public String getTypeHandler() {
			return typeHandler;
		}
		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}
		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}
		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}
		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}
		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}
