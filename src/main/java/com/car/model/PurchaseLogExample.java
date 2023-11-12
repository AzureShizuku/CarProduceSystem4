package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class PurchaseLogExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public PurchaseLogExample() {
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
		public Criteria andSlIsNull() {
			addCriterion("sl is null");
			return (Criteria) this;
		}
		public Criteria andSlIsNotNull(){
			addCriterion("sl is not null");
			return (Criteria) this;
		}
		public Criteria andSlEqualTo(Integer value) {
			addCriterion("sl =", value, "sl");
			return (Criteria) this;
		}
		public Criteria andSlNotEqualTo(Integer value) {
			addCriterion("sl <>", value, "sl");
			return (Criteria) this;
		}
		public Criteria andSlGreaterThan(Integer value) {
			addCriterion("sl >", value, "sl");
			return (Criteria) this;
		}
		public Criteria andSlGreaterThanOrEqualTo(Integer value) {
			addCriterion("sl >=", value, "Sl");
			return (Criteria) this;
		}
		public Criteria andSlLessThan(Integer value) {
			addCriterion("sl <", value, "sl");
			return (Criteria) this;
		}
		public Criteria andSlLessThanOrEqualTo(Integer value) {
			addCriterion("sl <=", value, "sl");
			return (Criteria) this;
		}
		public Criteria andSlIn(List<Integer> values) {
			addCriterion("sl in", values, "sl");
			return (Criteria) this;
		}
		public Criteria andSlNotIn(List<Integer> values) {
			addCriterion("sl not in", values, "sl");
			return (Criteria) this;
		}
		public Criteria andSlBetween(Integer value1, Integer value2) {
			addCriterion("sl between", value1, value2, "sl");
			return (Criteria) this;
		}
		public Criteria andSlNotBetween(Integer value1, Integer value2) {
			addCriterion("sl not between", value1, value2, "sl");
			return (Criteria) this;
		}
		public Criteria andSlLike(Integer value) {
			addCriterion("sl like", value, "sl");
			return (Criteria) this;
		}
		public Criteria andSlNotLike(Integer value) {
			addCriterion("sl not like", value, "sl");
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
		public Criteria andPurchaseStatusIsNull() {
			addCriterion("purchase_status is null");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusIsNotNull(){
			addCriterion("purchase_status is not null");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusEqualTo(Integer value) {
			addCriterion("purchase_status =", value, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusNotEqualTo(Integer value) {
			addCriterion("purchase_status <>", value, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusGreaterThan(Integer value) {
			addCriterion("purchase_status >", value, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("purchase_status >=", value, "PurchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusLessThan(Integer value) {
			addCriterion("purchase_status <", value, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusLessThanOrEqualTo(Integer value) {
			addCriterion("purchase_status <=", value, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusIn(List<Integer> values) {
			addCriterion("purchase_status in", values, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusNotIn(List<Integer> values) {
			addCriterion("purchase_status not in", values, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusBetween(Integer value1, Integer value2) {
			addCriterion("purchase_status between", value1, value2, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("purchase_status not between", value1, value2, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusLike(Integer value) {
			addCriterion("purchase_status like", value, "purchaseStatus");
			return (Criteria) this;
		}
		public Criteria andPurchaseStatusNotLike(Integer value) {
			addCriterion("purchase_status not like", value, "purchaseStatus");
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
