package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class PinlogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public PinlogExample() {
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
		public Criteria andStockIdIsNull() {
			addCriterion("stock_id is null");
			return (Criteria) this;
		}
		public Criteria andStockIdIsNotNull(){
			addCriterion("stock_id is not null");
			return (Criteria) this;
		}
		public Criteria andStockIdEqualTo(Integer value) {
			addCriterion("stock_id =", value, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdNotEqualTo(Integer value) {
			addCriterion("stock_id <>", value, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdGreaterThan(Integer value) {
			addCriterion("stock_id >", value, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("stock_id >=", value, "StockId");
			return (Criteria) this;
		}
		public Criteria andStockIdLessThan(Integer value) {
			addCriterion("stock_id <", value, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdLessThanOrEqualTo(Integer value) {
			addCriterion("stock_id <=", value, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdIn(List<Integer> values) {
			addCriterion("stock_id in", values, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdNotIn(List<Integer> values) {
			addCriterion("stock_id not in", values, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdBetween(Integer value1, Integer value2) {
			addCriterion("stock_id between", value1, value2, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdNotBetween(Integer value1, Integer value2) {
			addCriterion("stock_id not between", value1, value2, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdLike(Integer value) {
			addCriterion("stock_id like", value, "stockId");
			return (Criteria) this;
		}
		public Criteria andStockIdNotLike(Integer value) {
			addCriterion("stock_id not like", value, "stockId");
			return (Criteria) this;
		}
		public Criteria andProNoIsNull() {
			addCriterion("pro_no is null");
			return (Criteria) this;
		}
		public Criteria andProNoIsNotNull(){
			addCriterion("pro_no is not null");
			return (Criteria) this;
		}
		public Criteria andProNoEqualTo(String value) {
			addCriterion("pro_no =", value, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoNotEqualTo(String value) {
			addCriterion("pro_no <>", value, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoGreaterThan(String value) {
			addCriterion("pro_no >", value, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoGreaterThanOrEqualTo(String value) {
			addCriterion("pro_no >=", value, "ProNo");
			return (Criteria) this;
		}
		public Criteria andProNoLessThan(String value) {
			addCriterion("pro_no <", value, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoLessThanOrEqualTo(String value) {
			addCriterion("pro_no <=", value, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoIn(List<String> values) {
			addCriterion("pro_no in", values, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoNotIn(List<String> values) {
			addCriterion("pro_no not in", values, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoBetween(String value1, String value2) {
			addCriterion("pro_no between", value1, value2, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoNotBetween(String value1, String value2) {
			addCriterion("pro_no not between", value1, value2, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoLike(String value) {
			addCriterion("pro_no like", value, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNoNotLike(String value) {
			addCriterion("pro_no not like", value, "proNo");
			return (Criteria) this;
		}
		public Criteria andProNameIsNull() {
			addCriterion("pro_name is null");
			return (Criteria) this;
		}
		public Criteria andProNameIsNotNull(){
			addCriterion("pro_name is not null");
			return (Criteria) this;
		}
		public Criteria andProNameEqualTo(String value) {
			addCriterion("pro_name =", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotEqualTo(String value) {
			addCriterion("pro_name <>", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameGreaterThan(String value) {
			addCriterion("pro_name >", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameGreaterThanOrEqualTo(String value) {
			addCriterion("pro_name >=", value, "ProName");
			return (Criteria) this;
		}
		public Criteria andProNameLessThan(String value) {
			addCriterion("pro_name <", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameLessThanOrEqualTo(String value) {
			addCriterion("pro_name <=", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameIn(List<String> values) {
			addCriterion("pro_name in", values, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotIn(List<String> values) {
			addCriterion("pro_name not in", values, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameBetween(String value1, String value2) {
			addCriterion("pro_name between", value1, value2, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotBetween(String value1, String value2) {
			addCriterion("pro_name not between", value1, value2, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameLike(String value) {
			addCriterion("pro_name like", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotLike(String value) {
			addCriterion("pro_name not like", value, "proName");
			return (Criteria) this;
		}
		public Criteria andNumIsNull() {
			addCriterion("num is null");
			return (Criteria) this;
		}
		public Criteria andNumIsNotNull(){
			addCriterion("num is not null");
			return (Criteria) this;
		}
		public Criteria andNumEqualTo(Integer value) {
			addCriterion("num =", value, "num");
			return (Criteria) this;
		}
		public Criteria andNumNotEqualTo(Integer value) {
			addCriterion("num <>", value, "num");
			return (Criteria) this;
		}
		public Criteria andNumGreaterThan(Integer value) {
			addCriterion("num >", value, "num");
			return (Criteria) this;
		}
		public Criteria andNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("num >=", value, "Num");
			return (Criteria) this;
		}
		public Criteria andNumLessThan(Integer value) {
			addCriterion("num <", value, "num");
			return (Criteria) this;
		}
		public Criteria andNumLessThanOrEqualTo(Integer value) {
			addCriterion("num <=", value, "num");
			return (Criteria) this;
		}
		public Criteria andNumIn(List<Integer> values) {
			addCriterion("num in", values, "num");
			return (Criteria) this;
		}
		public Criteria andNumNotIn(List<Integer> values) {
			addCriterion("num not in", values, "num");
			return (Criteria) this;
		}
		public Criteria andNumBetween(Integer value1, Integer value2) {
			addCriterion("num between", value1, value2, "num");
			return (Criteria) this;
		}
		public Criteria andNumNotBetween(Integer value1, Integer value2) {
			addCriterion("num not between", value1, value2, "num");
			return (Criteria) this;
		}
		public Criteria andNumLike(Integer value) {
			addCriterion("num like", value, "num");
			return (Criteria) this;
		}
		public Criteria andNumNotLike(Integer value) {
			addCriterion("num not like", value, "num");
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
		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}
		public Criteria andStatusIsNotNull(){
			addCriterion("status is not null");
			return (Criteria) this;
		}
		public Criteria andStatusEqualTo(Integer value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}
		public Criteria andStatusNotEqualTo(Integer value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}
		public Criteria andStatusGreaterThan(Integer value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}
		public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("status >=", value, "Status");
			return (Criteria) this;
		}
		public Criteria andStatusLessThan(Integer value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}
		public Criteria andStatusLessThanOrEqualTo(Integer value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}
		public Criteria andStatusIn(List<Integer> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}
		public Criteria andStatusNotIn(List<Integer> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}
		public Criteria andStatusBetween(Integer value1, Integer value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}
		public Criteria andStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}
		public Criteria andStatusLike(Integer value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}
		public Criteria andStatusNotLike(Integer value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}
		public Criteria andCreateDateIsNull() {
			addCriterion("create_date is null");
			return (Criteria) this;
		}
		public Criteria andCreateDateIsNotNull(){
			addCriterion("create_date is not null");
			return (Criteria) this;
		}
		public Criteria andCreateDateEqualTo(String value) {
			addCriterion("create_date =", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotEqualTo(String value) {
			addCriterion("create_date <>", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateGreaterThan(String value) {
			addCriterion("create_date >", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
			addCriterion("create_date >=", value, "CreateDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateLessThan(String value) {
			addCriterion("create_date <", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateLessThanOrEqualTo(String value) {
			addCriterion("create_date <=", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateIn(List<String> values) {
			addCriterion("create_date in", values, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotIn(List<String> values) {
			addCriterion("create_date not in", values, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateBetween(String value1, String value2) {
			addCriterion("create_date between", value1, value2, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotBetween(String value1, String value2) {
			addCriterion("create_date not between", value1, value2, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateLike(String value) {
			addCriterion("create_date like", value, "createDate");
			return (Criteria) this;
		}
		public Criteria andCreateDateNotLike(String value) {
			addCriterion("create_date not like", value, "createDate");
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
