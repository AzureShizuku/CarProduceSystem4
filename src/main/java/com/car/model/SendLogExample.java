package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class SendLogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public SendLogExample() {
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
		public Criteria andPsIntroIsNull() {
			addCriterion("ps_intro is null");
			return (Criteria) this;
		}
		public Criteria andPsIntroIsNotNull(){
			addCriterion("ps_intro is not null");
			return (Criteria) this;
		}
		public Criteria andPsIntroEqualTo(String value) {
			addCriterion("ps_intro =", value, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroNotEqualTo(String value) {
			addCriterion("ps_intro <>", value, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroGreaterThan(String value) {
			addCriterion("ps_intro >", value, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroGreaterThanOrEqualTo(String value) {
			addCriterion("ps_intro >=", value, "PsIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroLessThan(String value) {
			addCriterion("ps_intro <", value, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroLessThanOrEqualTo(String value) {
			addCriterion("ps_intro <=", value, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroIn(List<String> values) {
			addCriterion("ps_intro in", values, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroNotIn(List<String> values) {
			addCriterion("ps_intro not in", values, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroBetween(String value1, String value2) {
			addCriterion("ps_intro between", value1, value2, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroNotBetween(String value1, String value2) {
			addCriterion("ps_intro not between", value1, value2, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroLike(String value) {
			addCriterion("ps_intro like", value, "psIntro");
			return (Criteria) this;
		}
		public Criteria andPsIntroNotLike(String value) {
			addCriterion("ps_intro not like", value, "psIntro");
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
		public Criteria andContactCelIsNull() {
			addCriterion("contact_cel is null");
			return (Criteria) this;
		}
		public Criteria andContactCelIsNotNull(){
			addCriterion("contact_cel is not null");
			return (Criteria) this;
		}
		public Criteria andContactCelEqualTo(String value) {
			addCriterion("contact_cel =", value, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelNotEqualTo(String value) {
			addCriterion("contact_cel <>", value, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelGreaterThan(String value) {
			addCriterion("contact_cel >", value, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelGreaterThanOrEqualTo(String value) {
			addCriterion("contact_cel >=", value, "ContactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelLessThan(String value) {
			addCriterion("contact_cel <", value, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelLessThanOrEqualTo(String value) {
			addCriterion("contact_cel <=", value, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelIn(List<String> values) {
			addCriterion("contact_cel in", values, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelNotIn(List<String> values) {
			addCriterion("contact_cel not in", values, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelBetween(String value1, String value2) {
			addCriterion("contact_cel between", value1, value2, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelNotBetween(String value1, String value2) {
			addCriterion("contact_cel not between", value1, value2, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelLike(String value) {
			addCriterion("contact_cel like", value, "contactCel");
			return (Criteria) this;
		}
		public Criteria andContactCelNotLike(String value) {
			addCriterion("contact_cel not like", value, "contactCel");
			return (Criteria) this;
		}
		public Criteria andDriverNameIsNull() {
			addCriterion("driver_name is null");
			return (Criteria) this;
		}
		public Criteria andDriverNameIsNotNull(){
			addCriterion("driver_name is not null");
			return (Criteria) this;
		}
		public Criteria andDriverNameEqualTo(String value) {
			addCriterion("driver_name =", value, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameNotEqualTo(String value) {
			addCriterion("driver_name <>", value, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameGreaterThan(String value) {
			addCriterion("driver_name >", value, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
			addCriterion("driver_name >=", value, "DriverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameLessThan(String value) {
			addCriterion("driver_name <", value, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameLessThanOrEqualTo(String value) {
			addCriterion("driver_name <=", value, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameIn(List<String> values) {
			addCriterion("driver_name in", values, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameNotIn(List<String> values) {
			addCriterion("driver_name not in", values, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameBetween(String value1, String value2) {
			addCriterion("driver_name between", value1, value2, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameNotBetween(String value1, String value2) {
			addCriterion("driver_name not between", value1, value2, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameLike(String value) {
			addCriterion("driver_name like", value, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverNameNotLike(String value) {
			addCriterion("driver_name not like", value, "driverName");
			return (Criteria) this;
		}
		public Criteria andDriverCelIsNull() {
			addCriterion("driver_cel is null");
			return (Criteria) this;
		}
		public Criteria andDriverCelIsNotNull(){
			addCriterion("driver_cel is not null");
			return (Criteria) this;
		}
		public Criteria andDriverCelEqualTo(String value) {
			addCriterion("driver_cel =", value, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelNotEqualTo(String value) {
			addCriterion("driver_cel <>", value, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelGreaterThan(String value) {
			addCriterion("driver_cel >", value, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelGreaterThanOrEqualTo(String value) {
			addCriterion("driver_cel >=", value, "DriverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelLessThan(String value) {
			addCriterion("driver_cel <", value, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelLessThanOrEqualTo(String value) {
			addCriterion("driver_cel <=", value, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelIn(List<String> values) {
			addCriterion("driver_cel in", values, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelNotIn(List<String> values) {
			addCriterion("driver_cel not in", values, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelBetween(String value1, String value2) {
			addCriterion("driver_cel between", value1, value2, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelNotBetween(String value1, String value2) {
			addCriterion("driver_cel not between", value1, value2, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelLike(String value) {
			addCriterion("driver_cel like", value, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverCelNotLike(String value) {
			addCriterion("driver_cel not like", value, "driverCel");
			return (Criteria) this;
		}
		public Criteria andDriverName2IsNull() {
			addCriterion("driver_name2 is null");
			return (Criteria) this;
		}
		public Criteria andDriverName2IsNotNull(){
			addCriterion("driver_name2 is not null");
			return (Criteria) this;
		}
		public Criteria andDriverName2EqualTo(String value) {
			addCriterion("driver_name2 =", value, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2NotEqualTo(String value) {
			addCriterion("driver_name2 <>", value, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2GreaterThan(String value) {
			addCriterion("driver_name2 >", value, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2GreaterThanOrEqualTo(String value) {
			addCriterion("driver_name2 >=", value, "DriverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2LessThan(String value) {
			addCriterion("driver_name2 <", value, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2LessThanOrEqualTo(String value) {
			addCriterion("driver_name2 <=", value, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2In(List<String> values) {
			addCriterion("driver_name2 in", values, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2NotIn(List<String> values) {
			addCriterion("driver_name2 not in", values, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2Between(String value1, String value2) {
			addCriterion("driver_name2 between", value1, value2, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2NotBetween(String value1, String value2) {
			addCriterion("driver_name2 not between", value1, value2, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2Like(String value) {
			addCriterion("driver_name2 like", value, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverName2NotLike(String value) {
			addCriterion("driver_name2 not like", value, "driverName2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2IsNull() {
			addCriterion("driver_cel2 is null");
			return (Criteria) this;
		}
		public Criteria andDriverCel2IsNotNull(){
			addCriterion("driver_cel2 is not null");
			return (Criteria) this;
		}
		public Criteria andDriverCel2EqualTo(String value) {
			addCriterion("driver_cel2 =", value, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2NotEqualTo(String value) {
			addCriterion("driver_cel2 <>", value, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2GreaterThan(String value) {
			addCriterion("driver_cel2 >", value, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2GreaterThanOrEqualTo(String value) {
			addCriterion("driver_cel2 >=", value, "DriverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2LessThan(String value) {
			addCriterion("driver_cel2 <", value, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2LessThanOrEqualTo(String value) {
			addCriterion("driver_cel2 <=", value, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2In(List<String> values) {
			addCriterion("driver_cel2 in", values, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2NotIn(List<String> values) {
			addCriterion("driver_cel2 not in", values, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2Between(String value1, String value2) {
			addCriterion("driver_cel2 between", value1, value2, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2NotBetween(String value1, String value2) {
			addCriterion("driver_cel2 not between", value1, value2, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2Like(String value) {
			addCriterion("driver_cel2 like", value, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andDriverCel2NotLike(String value) {
			addCriterion("driver_cel2 not like", value, "driverCel2");
			return (Criteria) this;
		}
		public Criteria andPsDetailIsNull() {
			addCriterion("ps_detail is null");
			return (Criteria) this;
		}
		public Criteria andPsDetailIsNotNull(){
			addCriterion("ps_detail is not null");
			return (Criteria) this;
		}
		public Criteria andPsDetailEqualTo(String value) {
			addCriterion("ps_detail =", value, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailNotEqualTo(String value) {
			addCriterion("ps_detail <>", value, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailGreaterThan(String value) {
			addCriterion("ps_detail >", value, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailGreaterThanOrEqualTo(String value) {
			addCriterion("ps_detail >=", value, "PsDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailLessThan(String value) {
			addCriterion("ps_detail <", value, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailLessThanOrEqualTo(String value) {
			addCriterion("ps_detail <=", value, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailIn(List<String> values) {
			addCriterion("ps_detail in", values, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailNotIn(List<String> values) {
			addCriterion("ps_detail not in", values, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailBetween(String value1, String value2) {
			addCriterion("ps_detail between", value1, value2, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailNotBetween(String value1, String value2) {
			addCriterion("ps_detail not between", value1, value2, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailLike(String value) {
			addCriterion("ps_detail like", value, "psDetail");
			return (Criteria) this;
		}
		public Criteria andPsDetailNotLike(String value) {
			addCriterion("ps_detail not like", value, "psDetail");
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
		public Criteria andTotalAmountEqualTo(String value) {
			addCriterion("total_amount =", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotEqualTo(String value) {
			addCriterion("total_amount <>", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountGreaterThan(String value) {
			addCriterion("total_amount >", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountGreaterThanOrEqualTo(String value) {
			addCriterion("total_amount >=", value, "TotalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLessThan(String value) {
			addCriterion("total_amount <", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLessThanOrEqualTo(String value) {
			addCriterion("total_amount <=", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountIn(List<String> values) {
			addCriterion("total_amount in", values, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotIn(List<String> values) {
			addCriterion("total_amount not in", values, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountBetween(String value1, String value2) {
			addCriterion("total_amount between", value1, value2, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotBetween(String value1, String value2) {
			addCriterion("total_amount not between", value1, value2, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountLike(String value) {
			addCriterion("total_amount like", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andTotalAmountNotLike(String value) {
			addCriterion("total_amount not like", value, "totalAmount");
			return (Criteria) this;
		}
		public Criteria andPsDateIsNull() {
			addCriterion("ps_date is null");
			return (Criteria) this;
		}
		public Criteria andPsDateIsNotNull(){
			addCriterion("ps_date is not null");
			return (Criteria) this;
		}
		public Criteria andPsDateEqualTo(String value) {
			addCriterion("ps_date =", value, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateNotEqualTo(String value) {
			addCriterion("ps_date <>", value, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateGreaterThan(String value) {
			addCriterion("ps_date >", value, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateGreaterThanOrEqualTo(String value) {
			addCriterion("ps_date >=", value, "PsDate");
			return (Criteria) this;
		}
		public Criteria andPsDateLessThan(String value) {
			addCriterion("ps_date <", value, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateLessThanOrEqualTo(String value) {
			addCriterion("ps_date <=", value, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateIn(List<String> values) {
			addCriterion("ps_date in", values, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateNotIn(List<String> values) {
			addCriterion("ps_date not in", values, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateBetween(String value1, String value2) {
			addCriterion("ps_date between", value1, value2, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateNotBetween(String value1, String value2) {
			addCriterion("ps_date not between", value1, value2, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateLike(String value) {
			addCriterion("ps_date like", value, "psDate");
			return (Criteria) this;
		}
		public Criteria andPsDateNotLike(String value) {
			addCriterion("ps_date not like", value, "psDate");
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
