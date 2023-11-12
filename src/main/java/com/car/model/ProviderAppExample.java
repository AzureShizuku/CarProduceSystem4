package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class ProviderAppExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ProviderAppExample() {
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
		public Criteria andNameIsNull() {
			addCriterion("name is null");
			return (Criteria) this;
		}
		public Criteria andNameIsNotNull(){
			addCriterion("name is not null");
			return (Criteria) this;
		}
		public Criteria andNameEqualTo(String value) {
			addCriterion("name =", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotEqualTo(String value) {
			addCriterion("name <>", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameGreaterThan(String value) {
			addCriterion("name >", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameGreaterThanOrEqualTo(String value) {
			addCriterion("name >=", value, "Name");
			return (Criteria) this;
		}
		public Criteria andNameLessThan(String value) {
			addCriterion("name <", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameLessThanOrEqualTo(String value) {
			addCriterion("name <=", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameIn(List<String> values) {
			addCriterion("name in", values, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotIn(List<String> values) {
			addCriterion("name not in", values, "name");
			return (Criteria) this;
		}
		public Criteria andNameBetween(String value1, String value2) {
			addCriterion("name between", value1, value2, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotBetween(String value1, String value2) {
			addCriterion("name not between", value1, value2, "name");
			return (Criteria) this;
		}
		public Criteria andNameLike(String value) {
			addCriterion("name like", value, "name");
			return (Criteria) this;
		}
		public Criteria andNameNotLike(String value) {
			addCriterion("name not like", value, "name");
			return (Criteria) this;
		}
		public Criteria andContactNameIsNull() {
			addCriterion("contact_name is null");
			return (Criteria) this;
		}
		public Criteria andContactNameIsNotNull(){
			addCriterion("contact_name is not null");
			return (Criteria) this;
		}
		public Criteria andContactNameEqualTo(String value) {
			addCriterion("contact_name =", value, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameNotEqualTo(String value) {
			addCriterion("contact_name <>", value, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameGreaterThan(String value) {
			addCriterion("contact_name >", value, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameGreaterThanOrEqualTo(String value) {
			addCriterion("contact_name >=", value, "ContactName");
			return (Criteria) this;
		}
		public Criteria andContactNameLessThan(String value) {
			addCriterion("contact_name <", value, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameLessThanOrEqualTo(String value) {
			addCriterion("contact_name <=", value, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameIn(List<String> values) {
			addCriterion("contact_name in", values, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameNotIn(List<String> values) {
			addCriterion("contact_name not in", values, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameBetween(String value1, String value2) {
			addCriterion("contact_name between", value1, value2, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameNotBetween(String value1, String value2) {
			addCriterion("contact_name not between", value1, value2, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameLike(String value) {
			addCriterion("contact_name like", value, "contactName");
			return (Criteria) this;
		}
		public Criteria andContactNameNotLike(String value) {
			addCriterion("contact_name not like", value, "contactName");
			return (Criteria) this;
		}
		public Criteria andCelcontact_IsNull() {
			addCriterion("celcontact_ is null");
			return (Criteria) this;
		}
		public Criteria andCelcontact_IsNotNull(){
			addCriterion("celcontact_ is not null");
			return (Criteria) this;
		}
		public Criteria andCelcontact_EqualTo(String value) {
			addCriterion("celcontact_ =", value, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_NotEqualTo(String value) {
			addCriterion("celcontact_ <>", value, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_GreaterThan(String value) {
			addCriterion("celcontact_ >", value, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_GreaterThanOrEqualTo(String value) {
			addCriterion("celcontact_ >=", value, "Celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_LessThan(String value) {
			addCriterion("celcontact_ <", value, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_LessThanOrEqualTo(String value) {
			addCriterion("celcontact_ <=", value, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_In(List<String> values) {
			addCriterion("celcontact_ in", values, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_NotIn(List<String> values) {
			addCriterion("celcontact_ not in", values, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_Between(String value1, String value2) {
			addCriterion("celcontact_ between", value1, value2, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_NotBetween(String value1, String value2) {
			addCriterion("celcontact_ not between", value1, value2, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_Like(String value) {
			addCriterion("celcontact_ like", value, "celcontact_");
			return (Criteria) this;
		}
		public Criteria andCelcontact_NotLike(String value) {
			addCriterion("celcontact_ not like", value, "celcontact_");
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
		public Criteria andGmIsNull() {
			addCriterion("gm is null");
			return (Criteria) this;
		}
		public Criteria andGmIsNotNull(){
			addCriterion("gm is not null");
			return (Criteria) this;
		}
		public Criteria andGmEqualTo(String value) {
			addCriterion("gm =", value, "gm");
			return (Criteria) this;
		}
		public Criteria andGmNotEqualTo(String value) {
			addCriterion("gm <>", value, "gm");
			return (Criteria) this;
		}
		public Criteria andGmGreaterThan(String value) {
			addCriterion("gm >", value, "gm");
			return (Criteria) this;
		}
		public Criteria andGmGreaterThanOrEqualTo(String value) {
			addCriterion("gm >=", value, "Gm");
			return (Criteria) this;
		}
		public Criteria andGmLessThan(String value) {
			addCriterion("gm <", value, "gm");
			return (Criteria) this;
		}
		public Criteria andGmLessThanOrEqualTo(String value) {
			addCriterion("gm <=", value, "gm");
			return (Criteria) this;
		}
		public Criteria andGmIn(List<String> values) {
			addCriterion("gm in", values, "gm");
			return (Criteria) this;
		}
		public Criteria andGmNotIn(List<String> values) {
			addCriterion("gm not in", values, "gm");
			return (Criteria) this;
		}
		public Criteria andGmBetween(String value1, String value2) {
			addCriterion("gm between", value1, value2, "gm");
			return (Criteria) this;
		}
		public Criteria andGmNotBetween(String value1, String value2) {
			addCriterion("gm not between", value1, value2, "gm");
			return (Criteria) this;
		}
		public Criteria andGmLike(String value) {
			addCriterion("gm like", value, "gm");
			return (Criteria) this;
		}
		public Criteria andGmNotLike(String value) {
			addCriterion("gm not like", value, "gm");
			return (Criteria) this;
		}
		public Criteria andProNamesIsNull() {
			addCriterion("pro_names is null");
			return (Criteria) this;
		}
		public Criteria andProNamesIsNotNull(){
			addCriterion("pro_names is not null");
			return (Criteria) this;
		}
		public Criteria andProNamesEqualTo(String value) {
			addCriterion("pro_names =", value, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesNotEqualTo(String value) {
			addCriterion("pro_names <>", value, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesGreaterThan(String value) {
			addCriterion("pro_names >", value, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesGreaterThanOrEqualTo(String value) {
			addCriterion("pro_names >=", value, "ProNames");
			return (Criteria) this;
		}
		public Criteria andProNamesLessThan(String value) {
			addCriterion("pro_names <", value, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesLessThanOrEqualTo(String value) {
			addCriterion("pro_names <=", value, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesIn(List<String> values) {
			addCriterion("pro_names in", values, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesNotIn(List<String> values) {
			addCriterion("pro_names not in", values, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesBetween(String value1, String value2) {
			addCriterion("pro_names between", value1, value2, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesNotBetween(String value1, String value2) {
			addCriterion("pro_names not between", value1, value2, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesLike(String value) {
			addCriterion("pro_names like", value, "proNames");
			return (Criteria) this;
		}
		public Criteria andProNamesNotLike(String value) {
			addCriterion("pro_names not like", value, "proNames");
			return (Criteria) this;
		}
		public Criteria andProDetailIsNull() {
			addCriterion("pro_detail is null");
			return (Criteria) this;
		}
		public Criteria andProDetailIsNotNull(){
			addCriterion("pro_detail is not null");
			return (Criteria) this;
		}
		public Criteria andProDetailEqualTo(String value) {
			addCriterion("pro_detail =", value, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailNotEqualTo(String value) {
			addCriterion("pro_detail <>", value, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailGreaterThan(String value) {
			addCriterion("pro_detail >", value, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailGreaterThanOrEqualTo(String value) {
			addCriterion("pro_detail >=", value, "ProDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailLessThan(String value) {
			addCriterion("pro_detail <", value, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailLessThanOrEqualTo(String value) {
			addCriterion("pro_detail <=", value, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailIn(List<String> values) {
			addCriterion("pro_detail in", values, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailNotIn(List<String> values) {
			addCriterion("pro_detail not in", values, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailBetween(String value1, String value2) {
			addCriterion("pro_detail between", value1, value2, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailNotBetween(String value1, String value2) {
			addCriterion("pro_detail not between", value1, value2, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailLike(String value) {
			addCriterion("pro_detail like", value, "proDetail");
			return (Criteria) this;
		}
		public Criteria andProDetailNotLike(String value) {
			addCriterion("pro_detail not like", value, "proDetail");
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
		public Criteria andEvalTypeIsNull() {
			addCriterion("eval_type is null");
			return (Criteria) this;
		}
		public Criteria andEvalTypeIsNotNull(){
			addCriterion("eval_type is not null");
			return (Criteria) this;
		}
		public Criteria andEvalTypeEqualTo(Integer value) {
			addCriterion("eval_type =", value, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeNotEqualTo(Integer value) {
			addCriterion("eval_type <>", value, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeGreaterThan(Integer value) {
			addCriterion("eval_type >", value, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeGreaterThanOrEqualTo(Integer value) {
			addCriterion("eval_type >=", value, "EvalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeLessThan(Integer value) {
			addCriterion("eval_type <", value, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeLessThanOrEqualTo(Integer value) {
			addCriterion("eval_type <=", value, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeIn(List<Integer> values) {
			addCriterion("eval_type in", values, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeNotIn(List<Integer> values) {
			addCriterion("eval_type not in", values, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeBetween(Integer value1, Integer value2) {
			addCriterion("eval_type between", value1, value2, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeNotBetween(Integer value1, Integer value2) {
			addCriterion("eval_type not between", value1, value2, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeLike(Integer value) {
			addCriterion("eval_type like", value, "evalType");
			return (Criteria) this;
		}
		public Criteria andEvalTypeNotLike(Integer value) {
			addCriterion("eval_type not like", value, "evalType");
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
