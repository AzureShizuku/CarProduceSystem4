package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class ProPlanExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ProPlanExample() {
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
		public Criteria andPnameIsNull() {
			addCriterion("pname is null");
			return (Criteria) this;
		}
		public Criteria andPnameIsNotNull(){
			addCriterion("pname is not null");
			return (Criteria) this;
		}
		public Criteria andPnameEqualTo(String value) {
			addCriterion("pname =", value, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameNotEqualTo(String value) {
			addCriterion("pname <>", value, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameGreaterThan(String value) {
			addCriterion("pname >", value, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameGreaterThanOrEqualTo(String value) {
			addCriterion("pname >=", value, "Pname");
			return (Criteria) this;
		}
		public Criteria andPnameLessThan(String value) {
			addCriterion("pname <", value, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameLessThanOrEqualTo(String value) {
			addCriterion("pname <=", value, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameIn(List<String> values) {
			addCriterion("pname in", values, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameNotIn(List<String> values) {
			addCriterion("pname not in", values, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameBetween(String value1, String value2) {
			addCriterion("pname between", value1, value2, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameNotBetween(String value1, String value2) {
			addCriterion("pname not between", value1, value2, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameLike(String value) {
			addCriterion("pname like", value, "pname");
			return (Criteria) this;
		}
		public Criteria andPnameNotLike(String value) {
			addCriterion("pname not like", value, "pname");
			return (Criteria) this;
		}
		public Criteria andPintroIsNull() {
			addCriterion("pintro is null");
			return (Criteria) this;
		}
		public Criteria andPintroIsNotNull(){
			addCriterion("pintro is not null");
			return (Criteria) this;
		}
		public Criteria andPintroEqualTo(String value) {
			addCriterion("pintro =", value, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroNotEqualTo(String value) {
			addCriterion("pintro <>", value, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroGreaterThan(String value) {
			addCriterion("pintro >", value, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroGreaterThanOrEqualTo(String value) {
			addCriterion("pintro >=", value, "Pintro");
			return (Criteria) this;
		}
		public Criteria andPintroLessThan(String value) {
			addCriterion("pintro <", value, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroLessThanOrEqualTo(String value) {
			addCriterion("pintro <=", value, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroIn(List<String> values) {
			addCriterion("pintro in", values, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroNotIn(List<String> values) {
			addCriterion("pintro not in", values, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroBetween(String value1, String value2) {
			addCriterion("pintro between", value1, value2, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroNotBetween(String value1, String value2) {
			addCriterion("pintro not between", value1, value2, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroLike(String value) {
			addCriterion("pintro like", value, "pintro");
			return (Criteria) this;
		}
		public Criteria andPintroNotLike(String value) {
			addCriterion("pintro not like", value, "pintro");
			return (Criteria) this;
		}
		public Criteria andPdetailIsNull() {
			addCriterion("pdetail is null");
			return (Criteria) this;
		}
		public Criteria andPdetailIsNotNull(){
			addCriterion("pdetail is not null");
			return (Criteria) this;
		}
		public Criteria andPdetailEqualTo(String value) {
			addCriterion("pdetail =", value, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailNotEqualTo(String value) {
			addCriterion("pdetail <>", value, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailGreaterThan(String value) {
			addCriterion("pdetail >", value, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailGreaterThanOrEqualTo(String value) {
			addCriterion("pdetail >=", value, "Pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailLessThan(String value) {
			addCriterion("pdetail <", value, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailLessThanOrEqualTo(String value) {
			addCriterion("pdetail <=", value, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailIn(List<String> values) {
			addCriterion("pdetail in", values, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailNotIn(List<String> values) {
			addCriterion("pdetail not in", values, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailBetween(String value1, String value2) {
			addCriterion("pdetail between", value1, value2, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailNotBetween(String value1, String value2) {
			addCriterion("pdetail not between", value1, value2, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailLike(String value) {
			addCriterion("pdetail like", value, "pdetail");
			return (Criteria) this;
		}
		public Criteria andPdetailNotLike(String value) {
			addCriterion("pdetail not like", value, "pdetail");
			return (Criteria) this;
		}
		public Criteria andKsDateIsNull() {
			addCriterion("ks_date is null");
			return (Criteria) this;
		}
		public Criteria andKsDateIsNotNull(){
			addCriterion("ks_date is not null");
			return (Criteria) this;
		}
		public Criteria andKsDateEqualTo(String value) {
			addCriterion("ks_date =", value, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateNotEqualTo(String value) {
			addCriterion("ks_date <>", value, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateGreaterThan(String value) {
			addCriterion("ks_date >", value, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateGreaterThanOrEqualTo(String value) {
			addCriterion("ks_date >=", value, "KsDate");
			return (Criteria) this;
		}
		public Criteria andKsDateLessThan(String value) {
			addCriterion("ks_date <", value, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateLessThanOrEqualTo(String value) {
			addCriterion("ks_date <=", value, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateIn(List<String> values) {
			addCriterion("ks_date in", values, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateNotIn(List<String> values) {
			addCriterion("ks_date not in", values, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateBetween(String value1, String value2) {
			addCriterion("ks_date between", value1, value2, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateNotBetween(String value1, String value2) {
			addCriterion("ks_date not between", value1, value2, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateLike(String value) {
			addCriterion("ks_date like", value, "ksDate");
			return (Criteria) this;
		}
		public Criteria andKsDateNotLike(String value) {
			addCriterion("ks_date not like", value, "ksDate");
			return (Criteria) this;
		}
		public Criteria andJsDateIsNull() {
			addCriterion("js_date is null");
			return (Criteria) this;
		}
		public Criteria andJsDateIsNotNull(){
			addCriterion("js_date is not null");
			return (Criteria) this;
		}
		public Criteria andJsDateEqualTo(String value) {
			addCriterion("js_date =", value, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateNotEqualTo(String value) {
			addCriterion("js_date <>", value, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateGreaterThan(String value) {
			addCriterion("js_date >", value, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateGreaterThanOrEqualTo(String value) {
			addCriterion("js_date >=", value, "JsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateLessThan(String value) {
			addCriterion("js_date <", value, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateLessThanOrEqualTo(String value) {
			addCriterion("js_date <=", value, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateIn(List<String> values) {
			addCriterion("js_date in", values, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateNotIn(List<String> values) {
			addCriterion("js_date not in", values, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateBetween(String value1, String value2) {
			addCriterion("js_date between", value1, value2, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateNotBetween(String value1, String value2) {
			addCriterion("js_date not between", value1, value2, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateLike(String value) {
			addCriterion("js_date like", value, "jsDate");
			return (Criteria) this;
		}
		public Criteria andJsDateNotLike(String value) {
			addCriterion("js_date not like", value, "jsDate");
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
