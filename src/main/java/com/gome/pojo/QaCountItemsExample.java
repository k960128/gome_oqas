package com.gome.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class QaCountItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QaCountItemsExample() {
        oredCriteria = new ArrayList<Criteria>();
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andThisNumberIsNull() {
            addCriterion("THIS_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andThisNumberIsNotNull() {
            addCriterion("THIS_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andThisNumberEqualTo(Integer value) {
            addCriterion("THIS_NUMBER =", value, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberNotEqualTo(Integer value) {
            addCriterion("THIS_NUMBER <>", value, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberGreaterThan(Integer value) {
            addCriterion("THIS_NUMBER >", value, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("THIS_NUMBER >=", value, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberLessThan(Integer value) {
            addCriterion("THIS_NUMBER <", value, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberLessThanOrEqualTo(Integer value) {
            addCriterion("THIS_NUMBER <=", value, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberIn(List<Integer> values) {
            addCriterion("THIS_NUMBER in", values, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberNotIn(List<Integer> values) {
            addCriterion("THIS_NUMBER not in", values, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberBetween(Integer value1, Integer value2) {
            addCriterion("THIS_NUMBER between", value1, value2, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andThisNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("THIS_NUMBER not between", value1, value2, "thisNumber");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNull() {
            addCriterion("IS_ENABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsEnableIsNotNull() {
            addCriterion("IS_ENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsEnableEqualTo(String value) {
            addCriterion("IS_ENABLE =", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotEqualTo(String value) {
            addCriterion("IS_ENABLE <>", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThan(String value) {
            addCriterion("IS_ENABLE >", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ENABLE >=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThan(String value) {
            addCriterion("IS_ENABLE <", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLessThanOrEqualTo(String value) {
            addCriterion("IS_ENABLE <=", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableLike(String value) {
            addCriterion("IS_ENABLE like", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotLike(String value) {
            addCriterion("IS_ENABLE not like", value, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableIn(List<String> values) {
            addCriterion("IS_ENABLE in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotIn(List<String> values) {
            addCriterion("IS_ENABLE not in", values, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableBetween(String value1, String value2) {
            addCriterion("IS_ENABLE between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andIsEnableNotBetween(String value1, String value2) {
            addCriterion("IS_ENABLE not between", value1, value2, "isEnable");
            return (Criteria) this;
        }

        public Criteria andRespondentIsNull() {
            addCriterion("RESPONDENT is null");
            return (Criteria) this;
        }

        public Criteria andRespondentIsNotNull() {
            addCriterion("RESPONDENT is not null");
            return (Criteria) this;
        }

        public Criteria andRespondentEqualTo(String value) {
            addCriterion("RESPONDENT =", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentNotEqualTo(String value) {
            addCriterion("RESPONDENT <>", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentGreaterThan(String value) {
            addCriterion("RESPONDENT >", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentGreaterThanOrEqualTo(String value) {
            addCriterion("RESPONDENT >=", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentLessThan(String value) {
            addCriterion("RESPONDENT <", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentLessThanOrEqualTo(String value) {
            addCriterion("RESPONDENT <=", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentLike(String value) {
            addCriterion("RESPONDENT like", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentNotLike(String value) {
            addCriterion("RESPONDENT not like", value, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentIn(List<String> values) {
            addCriterion("RESPONDENT in", values, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentNotIn(List<String> values) {
            addCriterion("RESPONDENT not in", values, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentBetween(String value1, String value2) {
            addCriterion("RESPONDENT between", value1, value2, "respondent");
            return (Criteria) this;
        }

        public Criteria andRespondentNotBetween(String value1, String value2) {
            addCriterion("RESPONDENT not between", value1, value2, "respondent");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("START_TIME not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andThisLinksIsNull() {
            addCriterion("THIS_LINKS is null");
            return (Criteria) this;
        }

        public Criteria andThisLinksIsNotNull() {
            addCriterion("THIS_LINKS is not null");
            return (Criteria) this;
        }

        public Criteria andThisLinksEqualTo(String value) {
            addCriterion("THIS_LINKS =", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksNotEqualTo(String value) {
            addCriterion("THIS_LINKS <>", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksGreaterThan(String value) {
            addCriterion("THIS_LINKS >", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksGreaterThanOrEqualTo(String value) {
            addCriterion("THIS_LINKS >=", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksLessThan(String value) {
            addCriterion("THIS_LINKS <", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksLessThanOrEqualTo(String value) {
            addCriterion("THIS_LINKS <=", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksLike(String value) {
            addCriterion("THIS_LINKS like", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksNotLike(String value) {
            addCriterion("THIS_LINKS not like", value, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksIn(List<String> values) {
            addCriterion("THIS_LINKS in", values, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksNotIn(List<String> values) {
            addCriterion("THIS_LINKS not in", values, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksBetween(String value1, String value2) {
            addCriterion("THIS_LINKS between", value1, value2, "thisLinks");
            return (Criteria) this;
        }

        public Criteria andThisLinksNotBetween(String value1, String value2) {
            addCriterion("THIS_LINKS not between", value1, value2, "thisLinks");
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