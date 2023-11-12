package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class MpurchaseAppExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public MpurchaseAppExample() {
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
		public Criteria andNoIsNull() {
			addCriterion("no is null");
			return (Criteria) this;
		}
		public Criteria andNoIsNotNull(){
			addCriterion("no is not null");
			return (Criteria) this;
		}
		public Criteria andNoEqualTo(String value) {
			addCriterion("no =", value, "no");
			return (Criteria) this;
		}
		public Criteria andNoNotEqualTo(String value) {
			addCriterion("no <>", value, "no");
			return (Criteria) this;
		}
		public Criteria andNoGreaterThan(String value) {
			addCriterion("no >", value, "no");
			return (Criteria) this;
		}
		public Criteria andNoGreaterThanOrEqualTo(String value) {
			addCriterion("no >=", value, "No");
			return (Criteria) this;
		}
		public Criteria andNoLessThan(String value) {
			addCriterion("no <", value, "no");
			return (Criteria) this;
		}
		public Criteria andNoLessThanOrEqualTo(String value) {
			addCriterion("no <=", value, "no");
			return (Criteria) this;
		}
		public Criteria andNoIn(List<String> values) {
			addCriterion("no in", values, "no");
			return (Criteria) this;
		}
		public Criteria andNoNotIn(List<String> values) {
			addCriterion("no not in", values, "no");
			return (Criteria) this;
		}
		public Criteria andNoBetween(String value1, String value2) {
			addCriterion("no between", value1, value2, "no");
			return (Criteria) this;
		}
		public Criteria andNoNotBetween(String value1, String value2) {
			addCriterion("no not between", value1, value2, "no");
			return (Criteria) this;
		}
		public Criteria andNoLike(String value) {
			addCriterion("no like", value, "no");
			return (Criteria) this;
		}
		public Criteria andNoNotLike(String value) {
			addCriterion("no not like", value, "no");
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
		public Criteria andMtypeIsNull() {
			addCriterion("mtype is null");
			return (Criteria) this;
		}
		public Criteria andMtypeIsNotNull(){
			addCriterion("mtype is not null");
			return (Criteria) this;
		}
		public Criteria andMtypeEqualTo(String value) {
			addCriterion("mtype =", value, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeNotEqualTo(String value) {
			addCriterion("mtype <>", value, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeGreaterThan(String value) {
			addCriterion("mtype >", value, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeGreaterThanOrEqualTo(String value) {
			addCriterion("mtype >=", value, "Mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeLessThan(String value) {
			addCriterion("mtype <", value, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeLessThanOrEqualTo(String value) {
			addCriterion("mtype <=", value, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeIn(List<String> values) {
			addCriterion("mtype in", values, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeNotIn(List<String> values) {
			addCriterion("mtype not in", values, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeBetween(String value1, String value2) {
			addCriterion("mtype between", value1, value2, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeNotBetween(String value1, String value2) {
			addCriterion("mtype not between", value1, value2, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeLike(String value) {
			addCriterion("mtype like", value, "mtype");
			return (Criteria) this;
		}
		public Criteria andMtypeNotLike(String value) {
			addCriterion("mtype not like", value, "mtype");
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
		public Criteria andMstandardIsNull() {
			addCriterion("mstandard is null");
			return (Criteria) this;
		}
		public Criteria andMstandardIsNotNull(){
			addCriterion("mstandard is not null");
			return (Criteria) this;
		}
		public Criteria andMstandardEqualTo(String value) {
			addCriterion("mstandard =", value, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardNotEqualTo(String value) {
			addCriterion("mstandard <>", value, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardGreaterThan(String value) {
			addCriterion("mstandard >", value, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardGreaterThanOrEqualTo(String value) {
			addCriterion("mstandard >=", value, "Mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardLessThan(String value) {
			addCriterion("mstandard <", value, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardLessThanOrEqualTo(String value) {
			addCriterion("mstandard <=", value, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardIn(List<String> values) {
			addCriterion("mstandard in", values, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardNotIn(List<String> values) {
			addCriterion("mstandard not in", values, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardBetween(String value1, String value2) {
			addCriterion("mstandard between", value1, value2, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardNotBetween(String value1, String value2) {
			addCriterion("mstandard not between", value1, value2, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardLike(String value) {
			addCriterion("mstandard like", value, "mstandard");
			return (Criteria) this;
		}
		public Criteria andMstandardNotLike(String value) {
			addCriterion("mstandard not like", value, "mstandard");
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
		public Criteria andPlanPriceIsNull() {
			addCriterion("plan_price is null");
			return (Criteria) this;
		}
		public Criteria andPlanPriceIsNotNull(){
			addCriterion("plan_price is not null");
			return (Criteria) this;
		}
		public Criteria andPlanPriceEqualTo(Double value) {
			addCriterion("plan_price =", value, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceNotEqualTo(Double value) {
			addCriterion("plan_price <>", value, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceGreaterThan(Double value) {
			addCriterion("plan_price >", value, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceGreaterThanOrEqualTo(Double value) {
			addCriterion("plan_price >=", value, "PlanPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceLessThan(Double value) {
			addCriterion("plan_price <", value, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceLessThanOrEqualTo(Double value) {
			addCriterion("plan_price <=", value, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceIn(List<Double> values) {
			addCriterion("plan_price in", values, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceNotIn(List<Double> values) {
			addCriterion("plan_price not in", values, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceBetween(Double value1, Double value2) {
			addCriterion("plan_price between", value1, value2, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceNotBetween(Double value1, Double value2) {
			addCriterion("plan_price not between", value1, value2, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceLike(Double value) {
			addCriterion("plan_price like", value, "planPrice");
			return (Criteria) this;
		}
		public Criteria andPlanPriceNotLike(Double value) {
			addCriterion("plan_price not like", value, "planPrice");
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
		public Criteria andDhDateIsNull() {
			addCriterion("dh_date is null");
			return (Criteria) this;
		}
		public Criteria andDhDateIsNotNull(){
			addCriterion("dh_date is not null");
			return (Criteria) this;
		}
		public Criteria andDhDateEqualTo(String value) {
			addCriterion("dh_date =", value, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateNotEqualTo(String value) {
			addCriterion("dh_date <>", value, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateGreaterThan(String value) {
			addCriterion("dh_date >", value, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateGreaterThanOrEqualTo(String value) {
			addCriterion("dh_date >=", value, "DhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateLessThan(String value) {
			addCriterion("dh_date <", value, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateLessThanOrEqualTo(String value) {
			addCriterion("dh_date <=", value, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateIn(List<String> values) {
			addCriterion("dh_date in", values, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateNotIn(List<String> values) {
			addCriterion("dh_date not in", values, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateBetween(String value1, String value2) {
			addCriterion("dh_date between", value1, value2, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateNotBetween(String value1, String value2) {
			addCriterion("dh_date not between", value1, value2, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateLike(String value) {
			addCriterion("dh_date like", value, "dhDate");
			return (Criteria) this;
		}
		public Criteria andDhDateNotLike(String value) {
			addCriterion("dh_date not like", value, "dhDate");
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
		public Criteria andShbzIsNull() {
			addCriterion("shbz is null");
			return (Criteria) this;
		}
		public Criteria andShbzIsNotNull(){
			addCriterion("shbz is not null");
			return (Criteria) this;
		}
		public Criteria andShbzEqualTo(String value) {
			addCriterion("shbz =", value, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzNotEqualTo(String value) {
			addCriterion("shbz <>", value, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzGreaterThan(String value) {
			addCriterion("shbz >", value, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzGreaterThanOrEqualTo(String value) {
			addCriterion("shbz >=", value, "Shbz");
			return (Criteria) this;
		}
		public Criteria andShbzLessThan(String value) {
			addCriterion("shbz <", value, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzLessThanOrEqualTo(String value) {
			addCriterion("shbz <=", value, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzIn(List<String> values) {
			addCriterion("shbz in", values, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzNotIn(List<String> values) {
			addCriterion("shbz not in", values, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzBetween(String value1, String value2) {
			addCriterion("shbz between", value1, value2, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzNotBetween(String value1, String value2) {
			addCriterion("shbz not between", value1, value2, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzLike(String value) {
			addCriterion("shbz like", value, "shbz");
			return (Criteria) this;
		}
		public Criteria andShbzNotLike(String value) {
			addCriterion("shbz not like", value, "shbz");
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
