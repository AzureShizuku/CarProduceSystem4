package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class MinlogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public MinlogExample() {
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
		public Criteria andInRemarkIsNull() {
			addCriterion("in_remark is null");
			return (Criteria) this;
		}
		public Criteria andInRemarkIsNotNull(){
			addCriterion("in_remark is not null");
			return (Criteria) this;
		}
		public Criteria andInRemarkEqualTo(String value) {
			addCriterion("in_remark =", value, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkNotEqualTo(String value) {
			addCriterion("in_remark <>", value, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkGreaterThan(String value) {
			addCriterion("in_remark >", value, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("in_remark >=", value, "InRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkLessThan(String value) {
			addCriterion("in_remark <", value, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkLessThanOrEqualTo(String value) {
			addCriterion("in_remark <=", value, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkIn(List<String> values) {
			addCriterion("in_remark in", values, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkNotIn(List<String> values) {
			addCriterion("in_remark not in", values, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkBetween(String value1, String value2) {
			addCriterion("in_remark between", value1, value2, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkNotBetween(String value1, String value2) {
			addCriterion("in_remark not between", value1, value2, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkLike(String value) {
			addCriterion("in_remark like", value, "inRemark");
			return (Criteria) this;
		}
		public Criteria andInRemarkNotLike(String value) {
			addCriterion("in_remark not like", value, "inRemark");
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
