package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class MneedMsgExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public MneedMsgExample() {
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
		public Criteria andTitleIsNull() {
			addCriterion("title is null");
			return (Criteria) this;
		}
		public Criteria andTitleIsNotNull(){
			addCriterion("title is not null");
			return (Criteria) this;
		}
		public Criteria andTitleEqualTo(String value) {
			addCriterion("title =", value, "title");
			return (Criteria) this;
		}
		public Criteria andTitleNotEqualTo(String value) {
			addCriterion("title <>", value, "title");
			return (Criteria) this;
		}
		public Criteria andTitleGreaterThan(String value) {
			addCriterion("title >", value, "title");
			return (Criteria) this;
		}
		public Criteria andTitleGreaterThanOrEqualTo(String value) {
			addCriterion("title >=", value, "Title");
			return (Criteria) this;
		}
		public Criteria andTitleLessThan(String value) {
			addCriterion("title <", value, "title");
			return (Criteria) this;
		}
		public Criteria andTitleLessThanOrEqualTo(String value) {
			addCriterion("title <=", value, "title");
			return (Criteria) this;
		}
		public Criteria andTitleIn(List<String> values) {
			addCriterion("title in", values, "title");
			return (Criteria) this;
		}
		public Criteria andTitleNotIn(List<String> values) {
			addCriterion("title not in", values, "title");
			return (Criteria) this;
		}
		public Criteria andTitleBetween(String value1, String value2) {
			addCriterion("title between", value1, value2, "title");
			return (Criteria) this;
		}
		public Criteria andTitleNotBetween(String value1, String value2) {
			addCriterion("title not between", value1, value2, "title");
			return (Criteria) this;
		}
		public Criteria andTitleLike(String value) {
			addCriterion("title like", value, "title");
			return (Criteria) this;
		}
		public Criteria andTitleNotLike(String value) {
			addCriterion("title not like", value, "title");
			return (Criteria) this;
		}
		public Criteria andNintroIsNull() {
			addCriterion("nintro is null");
			return (Criteria) this;
		}
		public Criteria andNintroIsNotNull(){
			addCriterion("nintro is not null");
			return (Criteria) this;
		}
		public Criteria andNintroEqualTo(String value) {
			addCriterion("nintro =", value, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroNotEqualTo(String value) {
			addCriterion("nintro <>", value, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroGreaterThan(String value) {
			addCriterion("nintro >", value, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroGreaterThanOrEqualTo(String value) {
			addCriterion("nintro >=", value, "Nintro");
			return (Criteria) this;
		}
		public Criteria andNintroLessThan(String value) {
			addCriterion("nintro <", value, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroLessThanOrEqualTo(String value) {
			addCriterion("nintro <=", value, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroIn(List<String> values) {
			addCriterion("nintro in", values, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroNotIn(List<String> values) {
			addCriterion("nintro not in", values, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroBetween(String value1, String value2) {
			addCriterion("nintro between", value1, value2, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroNotBetween(String value1, String value2) {
			addCriterion("nintro not between", value1, value2, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroLike(String value) {
			addCriterion("nintro like", value, "nintro");
			return (Criteria) this;
		}
		public Criteria andNintroNotLike(String value) {
			addCriterion("nintro not like", value, "nintro");
			return (Criteria) this;
		}
		public Criteria andNdetailIsNull() {
			addCriterion("ndetail is null");
			return (Criteria) this;
		}
		public Criteria andNdetailIsNotNull(){
			addCriterion("ndetail is not null");
			return (Criteria) this;
		}
		public Criteria andNdetailEqualTo(String value) {
			addCriterion("ndetail =", value, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailNotEqualTo(String value) {
			addCriterion("ndetail <>", value, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailGreaterThan(String value) {
			addCriterion("ndetail >", value, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailGreaterThanOrEqualTo(String value) {
			addCriterion("ndetail >=", value, "Ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailLessThan(String value) {
			addCriterion("ndetail <", value, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailLessThanOrEqualTo(String value) {
			addCriterion("ndetail <=", value, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailIn(List<String> values) {
			addCriterion("ndetail in", values, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailNotIn(List<String> values) {
			addCriterion("ndetail not in", values, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailBetween(String value1, String value2) {
			addCriterion("ndetail between", value1, value2, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailNotBetween(String value1, String value2) {
			addCriterion("ndetail not between", value1, value2, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailLike(String value) {
			addCriterion("ndetail like", value, "ndetail");
			return (Criteria) this;
		}
		public Criteria andNdetailNotLike(String value) {
			addCriterion("ndetail not like", value, "ndetail");
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
		public Criteria andJfDateIsNull() {
			addCriterion("jf_date is null");
			return (Criteria) this;
		}
		public Criteria andJfDateIsNotNull(){
			addCriterion("jf_date is not null");
			return (Criteria) this;
		}
		public Criteria andJfDateEqualTo(String value) {
			addCriterion("jf_date =", value, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateNotEqualTo(String value) {
			addCriterion("jf_date <>", value, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateGreaterThan(String value) {
			addCriterion("jf_date >", value, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateGreaterThanOrEqualTo(String value) {
			addCriterion("jf_date >=", value, "JfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateLessThan(String value) {
			addCriterion("jf_date <", value, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateLessThanOrEqualTo(String value) {
			addCriterion("jf_date <=", value, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateIn(List<String> values) {
			addCriterion("jf_date in", values, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateNotIn(List<String> values) {
			addCriterion("jf_date not in", values, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateBetween(String value1, String value2) {
			addCriterion("jf_date between", value1, value2, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateNotBetween(String value1, String value2) {
			addCriterion("jf_date not between", value1, value2, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateLike(String value) {
			addCriterion("jf_date like", value, "jfDate");
			return (Criteria) this;
		}
		public Criteria andJfDateNotLike(String value) {
			addCriterion("jf_date not like", value, "jfDate");
			return (Criteria) this;
		}
		public Criteria andCheckStatusIsNull() {
			addCriterion("check_status is null");
			return (Criteria) this;
		}
		public Criteria andCheckStatusIsNotNull(){
			addCriterion("check_status is not null");
			return (Criteria) this;
		}
		public Criteria andCheckStatusEqualTo(Integer value) {
			addCriterion("check_status =", value, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusNotEqualTo(Integer value) {
			addCriterion("check_status <>", value, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusGreaterThan(Integer value) {
			addCriterion("check_status >", value, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("check_status >=", value, "CheckStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusLessThan(Integer value) {
			addCriterion("check_status <", value, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusLessThanOrEqualTo(Integer value) {
			addCriterion("check_status <=", value, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusIn(List<Integer> values) {
			addCriterion("check_status in", values, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusNotIn(List<Integer> values) {
			addCriterion("check_status not in", values, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusBetween(Integer value1, Integer value2) {
			addCriterion("check_status between", value1, value2, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("check_status not between", value1, value2, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusLike(Integer value) {
			addCriterion("check_status like", value, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckStatusNotLike(Integer value) {
			addCriterion("check_status not like", value, "checkStatus");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkIsNull() {
			addCriterion("check_remark is null");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkIsNotNull(){
			addCriterion("check_remark is not null");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkEqualTo(String value) {
			addCriterion("check_remark =", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotEqualTo(String value) {
			addCriterion("check_remark <>", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkGreaterThan(String value) {
			addCriterion("check_remark >", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("check_remark >=", value, "CheckRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkLessThan(String value) {
			addCriterion("check_remark <", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkLessThanOrEqualTo(String value) {
			addCriterion("check_remark <=", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkIn(List<String> values) {
			addCriterion("check_remark in", values, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotIn(List<String> values) {
			addCriterion("check_remark not in", values, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkBetween(String value1, String value2) {
			addCriterion("check_remark between", value1, value2, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotBetween(String value1, String value2) {
			addCriterion("check_remark not between", value1, value2, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkLike(String value) {
			addCriterion("check_remark like", value, "checkRemark");
			return (Criteria) this;
		}
		public Criteria andCheckRemarkNotLike(String value) {
			addCriterion("check_remark not like", value, "checkRemark");
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
