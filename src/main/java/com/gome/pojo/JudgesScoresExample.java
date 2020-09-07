package com.gome.pojo;

import java.util.ArrayList;
import java.util.List;

public class JudgesScoresExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JudgesScoresExample() {
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

        public Criteria andJudgesIdIsNull() {
            addCriterion("JUDGES_ID is null");
            return (Criteria) this;
        }

        public Criteria andJudgesIdIsNotNull() {
            addCriterion("JUDGES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andJudgesIdEqualTo(Integer value) {
            addCriterion("JUDGES_ID =", value, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdNotEqualTo(Integer value) {
            addCriterion("JUDGES_ID <>", value, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdGreaterThan(Integer value) {
            addCriterion("JUDGES_ID >", value, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("JUDGES_ID >=", value, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdLessThan(Integer value) {
            addCriterion("JUDGES_ID <", value, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdLessThanOrEqualTo(Integer value) {
            addCriterion("JUDGES_ID <=", value, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdIn(List<Integer> values) {
            addCriterion("JUDGES_ID in", values, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdNotIn(List<Integer> values) {
            addCriterion("JUDGES_ID not in", values, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdBetween(Integer value1, Integer value2) {
            addCriterion("JUDGES_ID between", value1, value2, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("JUDGES_ID not between", value1, value2, "judgesId");
            return (Criteria) this;
        }

        public Criteria andJudgesNameIsNull() {
            addCriterion("JUDGES_NAME is null");
            return (Criteria) this;
        }

        public Criteria andJudgesNameIsNotNull() {
            addCriterion("JUDGES_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andJudgesNameEqualTo(String value) {
            addCriterion("JUDGES_NAME =", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameNotEqualTo(String value) {
            addCriterion("JUDGES_NAME <>", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameGreaterThan(String value) {
            addCriterion("JUDGES_NAME >", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameGreaterThanOrEqualTo(String value) {
            addCriterion("JUDGES_NAME >=", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameLessThan(String value) {
            addCriterion("JUDGES_NAME <", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameLessThanOrEqualTo(String value) {
            addCriterion("JUDGES_NAME <=", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameLike(String value) {
            addCriterion("JUDGES_NAME like", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameNotLike(String value) {
            addCriterion("JUDGES_NAME not like", value, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameIn(List<String> values) {
            addCriterion("JUDGES_NAME in", values, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameNotIn(List<String> values) {
            addCriterion("JUDGES_NAME not in", values, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameBetween(String value1, String value2) {
            addCriterion("JUDGES_NAME between", value1, value2, "judgesName");
            return (Criteria) this;
        }

        public Criteria andJudgesNameNotBetween(String value1, String value2) {
            addCriterion("JUDGES_NAME not between", value1, value2, "judgesName");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("SCORE is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("SCORE =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("SCORE <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("SCORE >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("SCORE >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("SCORE <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("SCORE <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("SCORE in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("SCORE not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("SCORE between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("SCORE not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNull() {
            addCriterion("PLAYER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIsNotNull() {
            addCriterion("PLAYER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerIdEqualTo(Integer value) {
            addCriterion("PLAYER_ID =", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotEqualTo(Integer value) {
            addCriterion("PLAYER_ID <>", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThan(Integer value) {
            addCriterion("PLAYER_ID >", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_ID >=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThan(Integer value) {
            addCriterion("PLAYER_ID <", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdLessThanOrEqualTo(Integer value) {
            addCriterion("PLAYER_ID <=", value, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdIn(List<Integer> values) {
            addCriterion("PLAYER_ID in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotIn(List<Integer> values) {
            addCriterion("PLAYER_ID not in", values, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_ID between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PLAYER_ID not between", value1, value2, "playerId");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNull() {
            addCriterion("PLAYER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIsNotNull() {
            addCriterion("PLAYER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPlayerNameEqualTo(String value) {
            addCriterion("PLAYER_NAME =", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotEqualTo(String value) {
            addCriterion("PLAYER_NAME <>", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThan(String value) {
            addCriterion("PLAYER_NAME >", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameGreaterThanOrEqualTo(String value) {
            addCriterion("PLAYER_NAME >=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThan(String value) {
            addCriterion("PLAYER_NAME <", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLessThanOrEqualTo(String value) {
            addCriterion("PLAYER_NAME <=", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameLike(String value) {
            addCriterion("PLAYER_NAME like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotLike(String value) {
            addCriterion("PLAYER_NAME not like", value, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameIn(List<String> values) {
            addCriterion("PLAYER_NAME in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotIn(List<String> values) {
            addCriterion("PLAYER_NAME not in", values, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameBetween(String value1, String value2) {
            addCriterion("PLAYER_NAME between", value1, value2, "playerName");
            return (Criteria) this;
        }

        public Criteria andPlayerNameNotBetween(String value1, String value2) {
            addCriterion("PLAYER_NAME not between", value1, value2, "playerName");
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

        public Criteria andEvaluationIdIsNull() {
            addCriterion("EVALUATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIsNotNull() {
            addCriterion("EVALUATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdEqualTo(Integer value) {
            addCriterion("EVALUATION_ID =", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotEqualTo(Integer value) {
            addCriterion("EVALUATION_ID <>", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThan(Integer value) {
            addCriterion("EVALUATION_ID >", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EVALUATION_ID >=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThan(Integer value) {
            addCriterion("EVALUATION_ID <", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdLessThanOrEqualTo(Integer value) {
            addCriterion("EVALUATION_ID <=", value, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdIn(List<Integer> values) {
            addCriterion("EVALUATION_ID in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotIn(List<Integer> values) {
            addCriterion("EVALUATION_ID not in", values, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdBetween(Integer value1, Integer value2) {
            addCriterion("EVALUATION_ID between", value1, value2, "evaluationId");
            return (Criteria) this;
        }

        public Criteria andEvaluationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EVALUATION_ID not between", value1, value2, "evaluationId");
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