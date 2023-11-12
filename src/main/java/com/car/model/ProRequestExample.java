package com.car.model;
import java.util.ArrayList;
import java.util.List;
public class ProRequestExample {
	protected String orderByClause;
	protected boolean distinct;
	protected int startRow;
	protected int pageRows;
	protected List<Criteria> oredCriteria;
	public ProRequestExample() {
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
		public Criteria andProNameIsNull() {
			addCriterion("pro_name is null");
			return (Criteria) this;
		}
		public Criteria andProNameIsNotNull(){
			addCriterion("pro_name is not null");
			return (Criteria) this;
		}
		public Criteria andProNameEqualTo(String value) {
			addCriterion("pro_name =", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotEqualTo(String value) {
			addCriterion("pro_name <>", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameGreaterThan(String value) {
			addCriterion("pro_name >", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameGreaterThanOrEqualTo(String value) {
			addCriterion("pro_name >=", value, "ProName");
			return (Criteria) this;
		}
		public Criteria andProNameLessThan(String value) {
			addCriterion("pro_name <", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameLessThanOrEqualTo(String value) {
			addCriterion("pro_name <=", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameIn(List<String> values) {
			addCriterion("pro_name in", values, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotIn(List<String> values) {
			addCriterion("pro_name not in", values, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameBetween(String value1, String value2) {
			addCriterion("pro_name between", value1, value2, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotBetween(String value1, String value2) {
			addCriterion("pro_name not between", value1, value2, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameLike(String value) {
			addCriterion("pro_name like", value, "proName");
			return (Criteria) this;
		}
		public Criteria andProNameNotLike(String value) {
			addCriterion("pro_name not like", value, "proName");
			return (Criteria) this;
		}
		public Criteria andNeedNumIsNull() {
			addCriterion("need_num is null");
			return (Criteria) this;
		}
		public Criteria andNeedNumIsNotNull(){
			addCriterion("need_num is not null");
			return (Criteria) this;
		}
		public Criteria andNeedNumEqualTo(Integer value) {
			addCriterion("need_num =", value, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumNotEqualTo(Integer value) {
			addCriterion("need_num <>", value, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumGreaterThan(Integer value) {
			addCriterion("need_num >", value, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumGreaterThanOrEqualTo(Integer value) {
			addCriterion("need_num >=", value, "NeedNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumLessThan(Integer value) {
			addCriterion("need_num <", value, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumLessThanOrEqualTo(Integer value) {
			addCriterion("need_num <=", value, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumIn(List<Integer> values) {
			addCriterion("need_num in", values, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumNotIn(List<Integer> values) {
			addCriterion("need_num not in", values, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumBetween(Integer value1, Integer value2) {
			addCriterion("need_num between", value1, value2, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumNotBetween(Integer value1, Integer value2) {
			addCriterion("need_num not between", value1, value2, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumLike(Integer value) {
			addCriterion("need_num like", value, "needNum");
			return (Criteria) this;
		}
		public Criteria andNeedNumNotLike(Integer value) {
			addCriterion("need_num not like", value, "needNum");
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
		public Criteria andRequestIntroIsNull() {
			addCriterion("request_intro is null");
			return (Criteria) this;
		}
		public Criteria andRequestIntroIsNotNull(){
			addCriterion("request_intro is not null");
			return (Criteria) this;
		}
		public Criteria andRequestIntroEqualTo(String value) {
			addCriterion("request_intro =", value, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroNotEqualTo(String value) {
			addCriterion("request_intro <>", value, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroGreaterThan(String value) {
			addCriterion("request_intro >", value, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroGreaterThanOrEqualTo(String value) {
			addCriterion("request_intro >=", value, "RequestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroLessThan(String value) {
			addCriterion("request_intro <", value, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroLessThanOrEqualTo(String value) {
			addCriterion("request_intro <=", value, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroIn(List<String> values) {
			addCriterion("request_intro in", values, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroNotIn(List<String> values) {
			addCriterion("request_intro not in", values, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroBetween(String value1, String value2) {
			addCriterion("request_intro between", value1, value2, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroNotBetween(String value1, String value2) {
			addCriterion("request_intro not between", value1, value2, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroLike(String value) {
			addCriterion("request_intro like", value, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestIntroNotLike(String value) {
			addCriterion("request_intro not like", value, "requestIntro");
			return (Criteria) this;
		}
		public Criteria andRequestFileIsNull() {
			addCriterion("request_file is null");
			return (Criteria) this;
		}
		public Criteria andRequestFileIsNotNull(){
			addCriterion("request_file is not null");
			return (Criteria) this;
		}
		public Criteria andRequestFileEqualTo(String value) {
			addCriterion("request_file =", value, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileNotEqualTo(String value) {
			addCriterion("request_file <>", value, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileGreaterThan(String value) {
			addCriterion("request_file >", value, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileGreaterThanOrEqualTo(String value) {
			addCriterion("request_file >=", value, "RequestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileLessThan(String value) {
			addCriterion("request_file <", value, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileLessThanOrEqualTo(String value) {
			addCriterion("request_file <=", value, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileIn(List<String> values) {
			addCriterion("request_file in", values, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileNotIn(List<String> values) {
			addCriterion("request_file not in", values, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileBetween(String value1, String value2) {
			addCriterion("request_file between", value1, value2, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileNotBetween(String value1, String value2) {
			addCriterion("request_file not between", value1, value2, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileLike(String value) {
			addCriterion("request_file like", value, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestFileNotLike(String value) {
			addCriterion("request_file not like", value, "requestFile");
			return (Criteria) this;
		}
		public Criteria andRequestStatusIsNull() {
			addCriterion("request_status is null");
			return (Criteria) this;
		}
		public Criteria andRequestStatusIsNotNull(){
			addCriterion("request_status is not null");
			return (Criteria) this;
		}
		public Criteria andRequestStatusEqualTo(Integer value) {
			addCriterion("request_status =", value, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusNotEqualTo(Integer value) {
			addCriterion("request_status <>", value, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusGreaterThan(Integer value) {
			addCriterion("request_status >", value, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusGreaterThanOrEqualTo(Integer value) {
			addCriterion("request_status >=", value, "RequestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusLessThan(Integer value) {
			addCriterion("request_status <", value, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusLessThanOrEqualTo(Integer value) {
			addCriterion("request_status <=", value, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusIn(List<Integer> values) {
			addCriterion("request_status in", values, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusNotIn(List<Integer> values) {
			addCriterion("request_status not in", values, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusBetween(Integer value1, Integer value2) {
			addCriterion("request_status between", value1, value2, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusNotBetween(Integer value1, Integer value2) {
			addCriterion("request_status not between", value1, value2, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusLike(Integer value) {
			addCriterion("request_status like", value, "requestStatus");
			return (Criteria) this;
		}
		public Criteria andRequestStatusNotLike(Integer value) {
			addCriterion("request_status not like", value, "requestStatus");
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
