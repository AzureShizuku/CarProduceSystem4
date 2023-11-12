package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class ProLogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ProLogExample() {
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
		public Criteria andStockProNoIsNull() {
			addCriterion("stock_pro_no is null");
			return (Criteria) this;
		}
		public Criteria andStockProNoIsNotNull(){
			addCriterion("stock_pro_no is not null");
			return (Criteria) this;
		}
		public Criteria andStockProNoEqualTo(String value) {
			addCriterion("stock_pro_no =", value, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoNotEqualTo(String value) {
			addCriterion("stock_pro_no <>", value, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoGreaterThan(String value) {
			addCriterion("stock_pro_no >", value, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoGreaterThanOrEqualTo(String value) {
			addCriterion("stock_pro_no >=", value, "StockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoLessThan(String value) {
			addCriterion("stock_pro_no <", value, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoLessThanOrEqualTo(String value) {
			addCriterion("stock_pro_no <=", value, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoIn(List<String> values) {
			addCriterion("stock_pro_no in", values, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoNotIn(List<String> values) {
			addCriterion("stock_pro_no not in", values, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoBetween(String value1, String value2) {
			addCriterion("stock_pro_no between", value1, value2, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoNotBetween(String value1, String value2) {
			addCriterion("stock_pro_no not between", value1, value2, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoLike(String value) {
			addCriterion("stock_pro_no like", value, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNoNotLike(String value) {
			addCriterion("stock_pro_no not like", value, "stockProNo");
			return (Criteria) this;
		}
		public Criteria andStockProNameIsNull() {
			addCriterion("stock_pro_name is null");
			return (Criteria) this;
		}
		public Criteria andStockProNameIsNotNull(){
			addCriterion("stock_pro_name is not null");
			return (Criteria) this;
		}
		public Criteria andStockProNameEqualTo(String value) {
			addCriterion("stock_pro_name =", value, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameNotEqualTo(String value) {
			addCriterion("stock_pro_name <>", value, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameGreaterThan(String value) {
			addCriterion("stock_pro_name >", value, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameGreaterThanOrEqualTo(String value) {
			addCriterion("stock_pro_name >=", value, "StockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameLessThan(String value) {
			addCriterion("stock_pro_name <", value, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameLessThanOrEqualTo(String value) {
			addCriterion("stock_pro_name <=", value, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameIn(List<String> values) {
			addCriterion("stock_pro_name in", values, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameNotIn(List<String> values) {
			addCriterion("stock_pro_name not in", values, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameBetween(String value1, String value2) {
			addCriterion("stock_pro_name between", value1, value2, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameNotBetween(String value1, String value2) {
			addCriterion("stock_pro_name not between", value1, value2, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameLike(String value) {
			addCriterion("stock_pro_name like", value, "stockProName");
			return (Criteria) this;
		}
		public Criteria andStockProNameNotLike(String value) {
			addCriterion("stock_pro_name not like", value, "stockProName");
			return (Criteria) this;
		}
		public Criteria andCheckIntroIsNull() {
			addCriterion("check_intro is null");
			return (Criteria) this;
		}
		public Criteria andCheckIntroIsNotNull(){
			addCriterion("check_intro is not null");
			return (Criteria) this;
		}
		public Criteria andCheckIntroEqualTo(String value) {
			addCriterion("check_intro =", value, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroNotEqualTo(String value) {
			addCriterion("check_intro <>", value, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroGreaterThan(String value) {
			addCriterion("check_intro >", value, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroGreaterThanOrEqualTo(String value) {
			addCriterion("check_intro >=", value, "CheckIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroLessThan(String value) {
			addCriterion("check_intro <", value, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroLessThanOrEqualTo(String value) {
			addCriterion("check_intro <=", value, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroIn(List<String> values) {
			addCriterion("check_intro in", values, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroNotIn(List<String> values) {
			addCriterion("check_intro not in", values, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroBetween(String value1, String value2) {
			addCriterion("check_intro between", value1, value2, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroNotBetween(String value1, String value2) {
			addCriterion("check_intro not between", value1, value2, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroLike(String value) {
			addCriterion("check_intro like", value, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckIntroNotLike(String value) {
			addCriterion("check_intro not like", value, "checkIntro");
			return (Criteria) this;
		}
		public Criteria andCheckFileIsNull() {
			addCriterion("check_file is null");
			return (Criteria) this;
		}
		public Criteria andCheckFileIsNotNull(){
			addCriterion("check_file is not null");
			return (Criteria) this;
		}
		public Criteria andCheckFileEqualTo(String value) {
			addCriterion("check_file =", value, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileNotEqualTo(String value) {
			addCriterion("check_file <>", value, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileGreaterThan(String value) {
			addCriterion("check_file >", value, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileGreaterThanOrEqualTo(String value) {
			addCriterion("check_file >=", value, "CheckFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileLessThan(String value) {
			addCriterion("check_file <", value, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileLessThanOrEqualTo(String value) {
			addCriterion("check_file <=", value, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileIn(List<String> values) {
			addCriterion("check_file in", values, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileNotIn(List<String> values) {
			addCriterion("check_file not in", values, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileBetween(String value1, String value2) {
			addCriterion("check_file between", value1, value2, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileNotBetween(String value1, String value2) {
			addCriterion("check_file not between", value1, value2, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileLike(String value) {
			addCriterion("check_file like", value, "checkFile");
			return (Criteria) this;
		}
		public Criteria andCheckFileNotLike(String value) {
			addCriterion("check_file not like", value, "checkFile");
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
		public Criteria andInStatusIsNull() {
			addCriterion("in_status is null");
			return (Criteria) this;
		}
		public Criteria andInStatusIsNotNull(){
			addCriterion("in_status is not null");
			return (Criteria) this;
		}
		public Criteria andInStatusEqualTo(Integer value) {
			addCriterion("in_status =", value, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusNotEqualTo(Integer value) {
			addCriterion("in_status <>", value, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusGreaterThan(Integer value) {
			addCriterion("in_status >", value, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("in_status >=", value, "InStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusLessThan(Integer value) {
			addCriterion("in_status <", value, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusLessThanOrEqualTo(Integer value) {
			addCriterion("in_status <=", value, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusIn(List<Integer> values) {
			addCriterion("in_status in", values, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusNotIn(List<Integer> values) {
			addCriterion("in_status not in", values, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusBetween(Integer value1, Integer value2) {
			addCriterion("in_status between", value1, value2, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("in_status not between", value1, value2, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusLike(Integer value) {
			addCriterion("in_status like", value, "inStatus");
			return (Criteria) this;
		}
		public Criteria andInStatusNotLike(Integer value) {
			addCriterion("in_status not like", value, "inStatus");
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
