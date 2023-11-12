package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class MoutlogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public MoutlogExample() {
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
		public Criteria andMaterialIdIsNull() {
			addCriterion("material_id is null");
			return (Criteria) this;
		}
		public Criteria andMaterialIdIsNotNull(){
			addCriterion("material_id is not null");
			return (Criteria) this;
		}
		public Criteria andMaterialIdEqualTo(Integer value) {
			addCriterion("material_id =", value, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdNotEqualTo(Integer value) {
			addCriterion("material_id <>", value, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdGreaterThan(Integer value) {
			addCriterion("material_id >", value, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("material_id >=", value, "MaterialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdLessThan(Integer value) {
			addCriterion("material_id <", value, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdLessThanOrEqualTo(Integer value) {
			addCriterion("material_id <=", value, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdIn(List<Integer> values) {
			addCriterion("material_id in", values, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdNotIn(List<Integer> values) {
			addCriterion("material_id not in", values, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdBetween(Integer value1, Integer value2) {
			addCriterion("material_id between", value1, value2, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdNotBetween(Integer value1, Integer value2) {
			addCriterion("material_id not between", value1, value2, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdLike(Integer value) {
			addCriterion("material_id like", value, "materialId");
			return (Criteria) this;
		}
		public Criteria andMaterialIdNotLike(Integer value) {
			addCriterion("material_id not like", value, "materialId");
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
		public Criteria andCkDateIsNull() {
			addCriterion("ck_date is null");
			return (Criteria) this;
		}
		public Criteria andCkDateIsNotNull(){
			addCriterion("ck_date is not null");
			return (Criteria) this;
		}
		public Criteria andCkDateEqualTo(String value) {
			addCriterion("ck_date =", value, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateNotEqualTo(String value) {
			addCriterion("ck_date <>", value, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateGreaterThan(String value) {
			addCriterion("ck_date >", value, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateGreaterThanOrEqualTo(String value) {
			addCriterion("ck_date >=", value, "CkDate");
			return (Criteria) this;
		}
		public Criteria andCkDateLessThan(String value) {
			addCriterion("ck_date <", value, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateLessThanOrEqualTo(String value) {
			addCriterion("ck_date <=", value, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateIn(List<String> values) {
			addCriterion("ck_date in", values, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateNotIn(List<String> values) {
			addCriterion("ck_date not in", values, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateBetween(String value1, String value2) {
			addCriterion("ck_date between", value1, value2, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateNotBetween(String value1, String value2) {
			addCriterion("ck_date not between", value1, value2, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateLike(String value) {
			addCriterion("ck_date like", value, "ckDate");
			return (Criteria) this;
		}
		public Criteria andCkDateNotLike(String value) {
			addCriterion("ck_date not like", value, "ckDate");
			return (Criteria) this;
		}
		public Criteria andIsComfirmIsNull() {
			addCriterion("is_comfirm is null");
			return (Criteria) this;
		}
		public Criteria andIsComfirmIsNotNull(){
			addCriterion("is_comfirm is not null");
			return (Criteria) this;
		}
		public Criteria andIsComfirmEqualTo(Integer value) {
			addCriterion("is_comfirm =", value, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmNotEqualTo(Integer value) {
			addCriterion("is_comfirm <>", value, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmGreaterThan(Integer value) {
			addCriterion("is_comfirm >", value, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmGreaterThanOrEqualTo(Integer value) {
			addCriterion("is_comfirm >=", value, "IsComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmLessThan(Integer value) {
			addCriterion("is_comfirm <", value, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmLessThanOrEqualTo(Integer value) {
			addCriterion("is_comfirm <=", value, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmIn(List<Integer> values) {
			addCriterion("is_comfirm in", values, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmNotIn(List<Integer> values) {
			addCriterion("is_comfirm not in", values, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmBetween(Integer value1, Integer value2) {
			addCriterion("is_comfirm between", value1, value2, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmNotBetween(Integer value1, Integer value2) {
			addCriterion("is_comfirm not between", value1, value2, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmLike(Integer value) {
			addCriterion("is_comfirm like", value, "isComfirm");
			return (Criteria) this;
		}
		public Criteria andIsComfirmNotLike(Integer value) {
			addCriterion("is_comfirm not like", value, "isComfirm");
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
