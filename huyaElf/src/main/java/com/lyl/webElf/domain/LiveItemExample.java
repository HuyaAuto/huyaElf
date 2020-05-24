package com.lyl.webElf.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class LiveItemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public LiveItemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(String value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(String value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(String value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(String value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(String value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(String value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLike(String value) {
            addCriterion("num like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotLike(String value) {
            addCriterion("num not like", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<String> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<String> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(String value1, String value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(String value1, String value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
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
            addCriterion("title >=", value, "title");
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

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
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

        public Criteria andIsontvIsNull() {
            addCriterion("isOnTv is null");
            return (Criteria) this;
        }

        public Criteria andIsontvIsNotNull() {
            addCriterion("isOnTv is not null");
            return (Criteria) this;
        }

        public Criteria andIsontvEqualTo(String value) {
            addCriterion("isOnTv =", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvNotEqualTo(String value) {
            addCriterion("isOnTv <>", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvGreaterThan(String value) {
            addCriterion("isOnTv >", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvGreaterThanOrEqualTo(String value) {
            addCriterion("isOnTv >=", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvLessThan(String value) {
            addCriterion("isOnTv <", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvLessThanOrEqualTo(String value) {
            addCriterion("isOnTv <=", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvLike(String value) {
            addCriterion("isOnTv like", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvNotLike(String value) {
            addCriterion("isOnTv not like", value, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvIn(List<String> values) {
            addCriterion("isOnTv in", values, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvNotIn(List<String> values) {
            addCriterion("isOnTv not in", values, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvBetween(String value1, String value2) {
            addCriterion("isOnTv between", value1, value2, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsontvNotBetween(String value1, String value2) {
            addCriterion("isOnTv not between", value1, value2, "isontv");
            return (Criteria) this;
        }

        public Criteria andIsguessIsNull() {
            addCriterion("isGuess is null");
            return (Criteria) this;
        }

        public Criteria andIsguessIsNotNull() {
            addCriterion("isGuess is not null");
            return (Criteria) this;
        }

        public Criteria andIsguessEqualTo(String value) {
            addCriterion("isGuess =", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessNotEqualTo(String value) {
            addCriterion("isGuess <>", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessGreaterThan(String value) {
            addCriterion("isGuess >", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessGreaterThanOrEqualTo(String value) {
            addCriterion("isGuess >=", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessLessThan(String value) {
            addCriterion("isGuess <", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessLessThanOrEqualTo(String value) {
            addCriterion("isGuess <=", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessLike(String value) {
            addCriterion("isGuess like", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessNotLike(String value) {
            addCriterion("isGuess not like", value, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessIn(List<String> values) {
            addCriterion("isGuess in", values, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessNotIn(List<String> values) {
            addCriterion("isGuess not in", values, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessBetween(String value1, String value2) {
            addCriterion("isGuess between", value1, value2, "isguess");
            return (Criteria) this;
        }

        public Criteria andIsguessNotBetween(String value1, String value2) {
            addCriterion("isGuess not between", value1, value2, "isguess");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("hostName is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostName is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostName =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostName <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostName >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostName >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostName <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostName <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostName like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostName not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostName in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostName not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostName between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostName not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andPagenoIsNull() {
            addCriterion("pageNo is null");
            return (Criteria) this;
        }

        public Criteria andPagenoIsNotNull() {
            addCriterion("pageNo is not null");
            return (Criteria) this;
        }

        public Criteria andPagenoEqualTo(String value) {
            addCriterion("pageNo =", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoNotEqualTo(String value) {
            addCriterion("pageNo <>", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoGreaterThan(String value) {
            addCriterion("pageNo >", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoGreaterThanOrEqualTo(String value) {
            addCriterion("pageNo >=", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoLessThan(String value) {
            addCriterion("pageNo <", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoLessThanOrEqualTo(String value) {
            addCriterion("pageNo <=", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoLike(String value) {
            addCriterion("pageNo like", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoNotLike(String value) {
            addCriterion("pageNo not like", value, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoIn(List<String> values) {
            addCriterion("pageNo in", values, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoNotIn(List<String> values) {
            addCriterion("pageNo not in", values, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoBetween(String value1, String value2) {
            addCriterion("pageNo between", value1, value2, "pageno");
            return (Criteria) this;
        }

        public Criteria andPagenoNotBetween(String value1, String value2) {
            addCriterion("pageNo not between", value1, value2, "pageno");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataIsNull() {
            addCriterion("isRecordingGuessData is null");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataIsNotNull() {
            addCriterion("isRecordingGuessData is not null");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataEqualTo(String value) {
            addCriterion("isRecordingGuessData =", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataNotEqualTo(String value) {
            addCriterion("isRecordingGuessData <>", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataGreaterThan(String value) {
            addCriterion("isRecordingGuessData >", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataGreaterThanOrEqualTo(String value) {
            addCriterion("isRecordingGuessData >=", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataLessThan(String value) {
            addCriterion("isRecordingGuessData <", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataLessThanOrEqualTo(String value) {
            addCriterion("isRecordingGuessData <=", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataLike(String value) {
            addCriterion("isRecordingGuessData like", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataNotLike(String value) {
            addCriterion("isRecordingGuessData not like", value, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataIn(List<String> values) {
            addCriterion("isRecordingGuessData in", values, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataNotIn(List<String> values) {
            addCriterion("isRecordingGuessData not in", values, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataBetween(String value1, String value2) {
            addCriterion("isRecordingGuessData between", value1, value2, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andIsrecordingguessdataNotBetween(String value1, String value2) {
            addCriterion("isRecordingGuessData not between", value1, value2, "isrecordingguessdata");
            return (Criteria) this;
        }

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(String value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(String value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(String value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(String value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(String value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(String value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLike(String value) {
            addCriterion("enable like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotLike(String value) {
            addCriterion("enable not like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<String> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<String> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(String value1, String value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(String value1, String value2) {
            addCriterion("enable not between", value1, value2, "enable");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table live_item
     *
     * @mbg.generated do_not_delete_during_merge Sun May 24 17:26:49 CST 2020
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table live_item
     *
     * @mbg.generated Sun May 24 17:26:49 CST 2020
     */
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