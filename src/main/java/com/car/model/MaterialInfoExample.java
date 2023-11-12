package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class MaterialInfoExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public MaterialInfoExample() {
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
		public Criteria andMnameIsNull() {
			addCriterion("mname is null");
			return (Criteria) this;
		}
		public Criteria andMnameIsNotNull(){
			addCriterion("mname is not null");
			return (Criteria) this;
		}
		public Criteria andMnameEqualTo(String value) {
			addCriterion("mname =", value, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameNotEqualTo(String value) {
			addCriterion("mname <>", value, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameGreaterThan(String value) {
			addCriterion("mname >", value, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameGreaterThanOrEqualTo(String value) {
			addCriterion("mname >=", value, "Mname");
			return (Criteria) this;
		}
		public Criteria andMnameLessThan(String value) {
			addCriterion("mname <", value, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameLessThanOrEqualTo(String value) {
			addCriterion("mname <=", value, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameIn(List<String> values) {
			addCriterion("mname in", values, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameNotIn(List<String> values) {
			addCriterion("mname not in", values, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameBetween(String value1, String value2) {
			addCriterion("mname between", value1, value2, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameNotBetween(String value1, String value2) {
			addCriterion("mname not between", value1, value2, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameLike(String value) {
			addCriterion("mname like", value, "mname");
			return (Criteria) this;
		}
		public Criteria andMnameNotLike(String value) {
			addCriterion("mname not like", value, "mname");
			return (Criteria) this;
		}
		public Criteria andMintroIsNull() {
			addCriterion("mintro is null");
			return (Criteria) this;
		}
		public Criteria andMintroIsNotNull(){
			addCriterion("mintro is not null");
			return (Criteria) this;
		}
		public Criteria andMintroEqualTo(String value) {
			addCriterion("mintro =", value, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroNotEqualTo(String value) {
			addCriterion("mintro <>", value, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroGreaterThan(String value) {
			addCriterion("mintro >", value, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroGreaterThanOrEqualTo(String value) {
			addCriterion("mintro >=", value, "Mintro");
			return (Criteria) this;
		}
		public Criteria andMintroLessThan(String value) {
			addCriterion("mintro <", value, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroLessThanOrEqualTo(String value) {
			addCriterion("mintro <=", value, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroIn(List<String> values) {
			addCriterion("mintro in", values, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroNotIn(List<String> values) {
			addCriterion("mintro not in", values, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroBetween(String value1, String value2) {
			addCriterion("mintro between", value1, value2, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroNotBetween(String value1, String value2) {
			addCriterion("mintro not between", value1, value2, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroLike(String value) {
			addCriterion("mintro like", value, "mintro");
			return (Criteria) this;
		}
		public Criteria andMintroNotLike(String value) {
			addCriterion("mintro not like", value, "mintro");
			return (Criteria) this;
		}
		public Criteria andStockNumIsNull() {
			addCriterion("stock_num is null");
			return (Criteria) this;
		}
		public Criteria andStockNumIsNotNull(){
			addCriterion("stock_num is not null");
			return (Criteria) this;
		}
		public Criteria andStockNumEqualTo(Double value) {
			addCriterion("stock_num =", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotEqualTo(Double value) {
			addCriterion("stock_num <>", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumGreaterThan(Double value) {
			addCriterion("stock_num >", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumGreaterThanOrEqualTo(Double value) {
			addCriterion("stock_num >=", value, "StockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumLessThan(Double value) {
			addCriterion("stock_num <", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumLessThanOrEqualTo(Double value) {
			addCriterion("stock_num <=", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumIn(List<Double> values) {
			addCriterion("stock_num in", values, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotIn(List<Double> values) {
			addCriterion("stock_num not in", values, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumBetween(Double value1, Double value2) {
			addCriterion("stock_num between", value1, value2, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotBetween(Double value1, Double value2) {
			addCriterion("stock_num not between", value1, value2, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumLike(Double value) {
			addCriterion("stock_num like", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andStockNumNotLike(Double value) {
			addCriterion("stock_num not like", value, "stockNum");
			return (Criteria) this;
		}
		public Criteria andDwIsNull() {
			addCriterion("dw is null");
			return (Criteria) this;
		}
		public Criteria andDwIsNotNull(){
			addCriterion("dw is not null");
			return (Criteria) this;
		}
		public Criteria andDwEqualTo(String value) {
			addCriterion("dw =", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotEqualTo(String value) {
			addCriterion("dw <>", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwGreaterThan(String value) {
			addCriterion("dw >", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwGreaterThanOrEqualTo(String value) {
			addCriterion("dw >=", value, "Dw");
			return (Criteria) this;
		}
		public Criteria andDwLessThan(String value) {
			addCriterion("dw <", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwLessThanOrEqualTo(String value) {
			addCriterion("dw <=", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwIn(List<String> values) {
			addCriterion("dw in", values, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotIn(List<String> values) {
			addCriterion("dw not in", values, "dw");
			return (Criteria) this;
		}
		public Criteria andDwBetween(String value1, String value2) {
			addCriterion("dw between", value1, value2, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotBetween(String value1, String value2) {
			addCriterion("dw not between", value1, value2, "dw");
			return (Criteria) this;
		}
		public Criteria andDwLike(String value) {
			addCriterion("dw like", value, "dw");
			return (Criteria) this;
		}
		public Criteria andDwNotLike(String value) {
			addCriterion("dw not like", value, "dw");
			return (Criteria) this;
		}
		public Criteria andGgIsNull() {
			addCriterion("gg is null");
			return (Criteria) this;
		}
		public Criteria andGgIsNotNull(){
			addCriterion("gg is not null");
			return (Criteria) this;
		}
		public Criteria andGgEqualTo(String value) {
			addCriterion("gg =", value, "gg");
			return (Criteria) this;
		}
		public Criteria andGgNotEqualTo(String value) {
			addCriterion("gg <>", value, "gg");
			return (Criteria) this;
		}
		public Criteria andGgGreaterThan(String value) {
			addCriterion("gg >", value, "gg");
			return (Criteria) this;
		}
		public Criteria andGgGreaterThanOrEqualTo(String value) {
			addCriterion("gg >=", value, "Gg");
			return (Criteria) this;
		}
		public Criteria andGgLessThan(String value) {
			addCriterion("gg <", value, "gg");
			return (Criteria) this;
		}
		public Criteria andGgLessThanOrEqualTo(String value) {
			addCriterion("gg <=", value, "gg");
			return (Criteria) this;
		}
		public Criteria andGgIn(List<String> values) {
			addCriterion("gg in", values, "gg");
			return (Criteria) this;
		}
		public Criteria andGgNotIn(List<String> values) {
			addCriterion("gg not in", values, "gg");
			return (Criteria) this;
		}
		public Criteria andGgBetween(String value1, String value2) {
			addCriterion("gg between", value1, value2, "gg");
			return (Criteria) this;
		}
		public Criteria andGgNotBetween(String value1, String value2) {
			addCriterion("gg not between", value1, value2, "gg");
			return (Criteria) this;
		}
		public Criteria andGgLike(String value) {
			addCriterion("gg like", value, "gg");
			return (Criteria) this;
		}
		public Criteria andGgNotLike(String value) {
			addCriterion("gg not like", value, "gg");
			return (Criteria) this;
		}
		public Criteria andProviderIdIsNull() {
			addCriterion("provider_id is null");
			return (Criteria) this;
		}
		public Criteria andProviderIdIsNotNull(){
			addCriterion("provider_id is not null");
			return (Criteria) this;
		}
		public Criteria andProviderIdEqualTo(Integer value) {
			addCriterion("provider_id =", value, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdNotEqualTo(Integer value) {
			addCriterion("provider_id <>", value, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdGreaterThan(Integer value) {
			addCriterion("provider_id >", value, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("provider_id >=", value, "ProviderId");
			return (Criteria) this;
		}
		public Criteria andProviderIdLessThan(Integer value) {
			addCriterion("provider_id <", value, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdLessThanOrEqualTo(Integer value) {
			addCriterion("provider_id <=", value, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdIn(List<Integer> values) {
			addCriterion("provider_id in", values, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdNotIn(List<Integer> values) {
			addCriterion("provider_id not in", values, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdBetween(Integer value1, Integer value2) {
			addCriterion("provider_id between", value1, value2, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdNotBetween(Integer value1, Integer value2) {
			addCriterion("provider_id not between", value1, value2, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdLike(Integer value) {
			addCriterion("provider_id like", value, "providerId");
			return (Criteria) this;
		}
		public Criteria andProviderIdNotLike(Integer value) {
			addCriterion("provider_id not like", value, "providerId");
			return (Criteria) this;
		}
		public Criteria andMnoIsNull() {
			addCriterion("mno is null");
			return (Criteria) this;
		}
		public Criteria andMnoIsNotNull(){
			addCriterion("mno is not null");
			return (Criteria) this;
		}
		public Criteria andMnoEqualTo(String value) {
			addCriterion("mno =", value, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoNotEqualTo(String value) {
			addCriterion("mno <>", value, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoGreaterThan(String value) {
			addCriterion("mno >", value, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoGreaterThanOrEqualTo(String value) {
			addCriterion("mno >=", value, "Mno");
			return (Criteria) this;
		}
		public Criteria andMnoLessThan(String value) {
			addCriterion("mno <", value, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoLessThanOrEqualTo(String value) {
			addCriterion("mno <=", value, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoIn(List<String> values) {
			addCriterion("mno in", values, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoNotIn(List<String> values) {
			addCriterion("mno not in", values, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoBetween(String value1, String value2) {
			addCriterion("mno between", value1, value2, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoNotBetween(String value1, String value2) {
			addCriterion("mno not between", value1, value2, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoLike(String value) {
			addCriterion("mno like", value, "mno");
			return (Criteria) this;
		}
		public Criteria andMnoNotLike(String value) {
			addCriterion("mno not like", value, "mno");
			return (Criteria) this;
		}
		public Criteria andJsbzIsNull() {
			addCriterion("jsbz is null");
			return (Criteria) this;
		}
		public Criteria andJsbzIsNotNull(){
			addCriterion("jsbz is not null");
			return (Criteria) this;
		}
		public Criteria andJsbzEqualTo(String value) {
			addCriterion("jsbz =", value, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzNotEqualTo(String value) {
			addCriterion("jsbz <>", value, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzGreaterThan(String value) {
			addCriterion("jsbz >", value, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzGreaterThanOrEqualTo(String value) {
			addCriterion("jsbz >=", value, "Jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzLessThan(String value) {
			addCriterion("jsbz <", value, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzLessThanOrEqualTo(String value) {
			addCriterion("jsbz <=", value, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzIn(List<String> values) {
			addCriterion("jsbz in", values, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzNotIn(List<String> values) {
			addCriterion("jsbz not in", values, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzBetween(String value1, String value2) {
			addCriterion("jsbz between", value1, value2, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzNotBetween(String value1, String value2) {
			addCriterion("jsbz not between", value1, value2, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzLike(String value) {
			addCriterion("jsbz like", value, "jsbz");
			return (Criteria) this;
		}
		public Criteria andJsbzNotLike(String value) {
			addCriterion("jsbz not like", value, "jsbz");
			return (Criteria) this;
		}
		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return (Criteria) this;
		}
		public Criteria andPriceIsNotNull(){
			addCriterion("price is not null");
			return (Criteria) this;
		}
		public Criteria andPriceEqualTo(Double value) {
			addCriterion("price =", value, "price");
			return (Criteria) this;
		}
		public Criteria andPriceNotEqualTo(Double value) {
			addCriterion("price <>", value, "price");
			return (Criteria) this;
		}
		public Criteria andPriceGreaterThan(Double value) {
			addCriterion("price >", value, "price");
			return (Criteria) this;
		}
		public Criteria andPriceGreaterThanOrEqualTo(Double value) {
			addCriterion("price >=", value, "Price");
			return (Criteria) this;
		}
		public Criteria andPriceLessThan(Double value) {
			addCriterion("price <", value, "price");
			return (Criteria) this;
		}
		public Criteria andPriceLessThanOrEqualTo(Double value) {
			addCriterion("price <=", value, "price");
			return (Criteria) this;
		}
		public Criteria andPriceIn(List<Double> values) {
			addCriterion("price in", values, "price");
			return (Criteria) this;
		}
		public Criteria andPriceNotIn(List<Double> values) {
			addCriterion("price not in", values, "price");
			return (Criteria) this;
		}
		public Criteria andPriceBetween(Double value1, Double value2) {
			addCriterion("price between", value1, value2, "price");
			return (Criteria) this;
		}
		public Criteria andPriceNotBetween(Double value1, Double value2) {
			addCriterion("price not between", value1, value2, "price");
			return (Criteria) this;
		}
		public Criteria andPriceLike(Double value) {
			addCriterion("price like", value, "price");
			return (Criteria) this;
		}
		public Criteria andPriceNotLike(Double value) {
			addCriterion("price not like", value, "price");
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
