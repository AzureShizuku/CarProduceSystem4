package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class MpurchasePlanExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public MpurchasePlanExample() {
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
		public Criteria andTotalAmountIsNull() {
			addCriterion("total_amount is null");
			return (Criteria) this;
		}
		public Criteria andTotalAmountIsNotNull(){
			addCriterion("total_amount is not null");
			return (Criteria) this;
		}
		public Criteria andTotalAmountEqualTo(Double value) {
			addCriterion("total_amount =", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotEqualTo(Double value) {
			addCriterion("total_amount <>", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountGreaterThan(Double value) {
			addCriterion("total_amount >", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountGreaterThanOrEqualTo(Double value) {
			addCriterion("total_amount >=", value, "TotalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLessThan(Double value) {
			addCriterion("total_amount <", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLessThanOrEqualTo(Double value) {
			addCriterion("total_amount <=", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountIn(List<Double> values) {
			addCriterion("total_amount in", values, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotIn(List<Double> values) {
			addCriterion("total_amount not in", values, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountBetween(Double value1, Double value2) {
			addCriterion("total_amount between", value1, value2, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotBetween(Double value1, Double value2) {
			addCriterion("total_amount not between", value1, value2, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLike(Double value) {
			addCriterion("total_amount like", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotLike(Double value) {
			addCriterion("total_amount not like", value, "totalAmount");
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
