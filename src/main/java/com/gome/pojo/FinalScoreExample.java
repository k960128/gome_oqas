package com.gome.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinalScoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinalScoreExample() {
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

        public Criteria andUserPersonsNameIsNull() {
            addCriterion("USER_PERSONS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameIsNotNull() {
            addCriterion("USER_PERSONS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameEqualTo(String value) {
            addCriterion("USER_PERSONS_NAME =", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameNotEqualTo(String value) {
            addCriterion("USER_PERSONS_NAME <>", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameGreaterThan(String value) {
            addCriterion("USER_PERSONS_NAME >", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PERSONS_NAME >=", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameLessThan(String value) {
            addCriterion("USER_PERSONS_NAME <", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameLessThanOrEqualTo(String value) {
            addCriterion("USER_PERSONS_NAME <=", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameLike(String value) {
            addCriterion("USER_PERSONS_NAME like", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameNotLike(String value) {
            addCriterion("USER_PERSONS_NAME not like", value, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameIn(List<String> values) {
            addCriterion("USER_PERSONS_NAME in", values, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameNotIn(List<String> values) {
            addCriterion("USER_PERSONS_NAME not in", values, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameBetween(String value1, String value2) {
            addCriterion("USER_PERSONS_NAME between", value1, value2, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserPersonsNameNotBetween(String value1, String value2) {
            addCriterion("USER_PERSONS_NAME not between", value1, value2, "userPersonsName");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderIsNull() {
            addCriterion("COMPETITION_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderIsNotNull() {
            addCriterion("COMPETITION_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderEqualTo(String value) {
            addCriterion("COMPETITION_ORDER =", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderNotEqualTo(String value) {
            addCriterion("COMPETITION_ORDER <>", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderGreaterThan(String value) {
            addCriterion("COMPETITION_ORDER >", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderGreaterThanOrEqualTo(String value) {
            addCriterion("COMPETITION_ORDER >=", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderLessThan(String value) {
            addCriterion("COMPETITION_ORDER <", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderLessThanOrEqualTo(String value) {
            addCriterion("COMPETITION_ORDER <=", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderLike(String value) {
            addCriterion("COMPETITION_ORDER like", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderNotLike(String value) {
            addCriterion("COMPETITION_ORDER not like", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderIn(List<String> values) {
            addCriterion("COMPETITION_ORDER in", values, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderNotIn(List<String> values) {
            addCriterion("COMPETITION_ORDER not in", values, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderBetween(String value1, String value2) {
            addCriterion("COMPETITION_ORDER between", value1, value2, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderNotBetween(String value1, String value2) {
            addCriterion("COMPETITION_ORDER not between", value1, value2, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIsNull() {
            addCriterion("FINAL_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIsNotNull() {
            addCriterion("FINAL_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreEqualTo(Double value) {
            addCriterion("FINAL_SCORE =", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotEqualTo(Double value) {
            addCriterion("FINAL_SCORE <>", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreGreaterThan(Double value) {
            addCriterion("FINAL_SCORE >", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("FINAL_SCORE >=", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLessThan(Double value) {
            addCriterion("FINAL_SCORE <", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLessThanOrEqualTo(Double value) {
            addCriterion("FINAL_SCORE <=", value, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreIn(List<Double> values) {
            addCriterion("FINAL_SCORE in", values, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotIn(List<Double> values) {
            addCriterion("FINAL_SCORE not in", values, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreBetween(Double value1, Double value2) {
            addCriterion("FINAL_SCORE between", value1, value2, "finalScore");
            return (Criteria) this;
        }

        public Criteria andFinalScoreNotBetween(Double value1, Double value2) {
            addCriterion("FINAL_SCORE not between", value1, value2, "finalScore");
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