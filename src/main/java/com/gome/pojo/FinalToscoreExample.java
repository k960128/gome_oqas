package com.gome.pojo;

import java.util.ArrayList;
import java.util.List;

public class FinalToscoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FinalToscoreExample() {
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

        public Criteria andFirstScoreIsNull() {
            addCriterion("FIRST_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFirstScoreIsNotNull() {
            addCriterion("FIRST_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstScoreEqualTo(Double value) {
            addCriterion("FIRST_SCORE =", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreNotEqualTo(Double value) {
            addCriterion("FIRST_SCORE <>", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreGreaterThan(Double value) {
            addCriterion("FIRST_SCORE >", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("FIRST_SCORE >=", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreLessThan(Double value) {
            addCriterion("FIRST_SCORE <", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreLessThanOrEqualTo(Double value) {
            addCriterion("FIRST_SCORE <=", value, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreIn(List<Double> values) {
            addCriterion("FIRST_SCORE in", values, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreNotIn(List<Double> values) {
            addCriterion("FIRST_SCORE not in", values, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreBetween(Double value1, Double value2) {
            addCriterion("FIRST_SCORE between", value1, value2, "firstScore");
            return (Criteria) this;
        }

        public Criteria andFirstScoreNotBetween(Double value1, Double value2) {
            addCriterion("FIRST_SCORE not between", value1, value2, "firstScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreIsNull() {
            addCriterion("SECOND_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andSecondScoreIsNotNull() {
            addCriterion("SECOND_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andSecondScoreEqualTo(Double value) {
            addCriterion("SECOND_SCORE =", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreNotEqualTo(Double value) {
            addCriterion("SECOND_SCORE <>", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreGreaterThan(Double value) {
            addCriterion("SECOND_SCORE >", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("SECOND_SCORE >=", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreLessThan(Double value) {
            addCriterion("SECOND_SCORE <", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreLessThanOrEqualTo(Double value) {
            addCriterion("SECOND_SCORE <=", value, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreIn(List<Double> values) {
            addCriterion("SECOND_SCORE in", values, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreNotIn(List<Double> values) {
            addCriterion("SECOND_SCORE not in", values, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreBetween(Double value1, Double value2) {
            addCriterion("SECOND_SCORE between", value1, value2, "secondScore");
            return (Criteria) this;
        }

        public Criteria andSecondScoreNotBetween(Double value1, Double value2) {
            addCriterion("SECOND_SCORE not between", value1, value2, "secondScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreIsNull() {
            addCriterion("THREE_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andThreeScoreIsNotNull() {
            addCriterion("THREE_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andThreeScoreEqualTo(Double value) {
            addCriterion("THREE_SCORE =", value, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreNotEqualTo(Double value) {
            addCriterion("THREE_SCORE <>", value, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreGreaterThan(Double value) {
            addCriterion("THREE_SCORE >", value, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("THREE_SCORE >=", value, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreLessThan(Double value) {
            addCriterion("THREE_SCORE <", value, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreLessThanOrEqualTo(Double value) {
            addCriterion("THREE_SCORE <=", value, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreIn(List<Double> values) {
            addCriterion("THREE_SCORE in", values, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreNotIn(List<Double> values) {
            addCriterion("THREE_SCORE not in", values, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreBetween(Double value1, Double value2) {
            addCriterion("THREE_SCORE between", value1, value2, "threeScore");
            return (Criteria) this;
        }

        public Criteria andThreeScoreNotBetween(Double value1, Double value2) {
            addCriterion("THREE_SCORE not between", value1, value2, "threeScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreIsNull() {
            addCriterion("FOUR_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFourScoreIsNotNull() {
            addCriterion("FOUR_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFourScoreEqualTo(Double value) {
            addCriterion("FOUR_SCORE =", value, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreNotEqualTo(Double value) {
            addCriterion("FOUR_SCORE <>", value, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreGreaterThan(Double value) {
            addCriterion("FOUR_SCORE >", value, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("FOUR_SCORE >=", value, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreLessThan(Double value) {
            addCriterion("FOUR_SCORE <", value, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreLessThanOrEqualTo(Double value) {
            addCriterion("FOUR_SCORE <=", value, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreIn(List<Double> values) {
            addCriterion("FOUR_SCORE in", values, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreNotIn(List<Double> values) {
            addCriterion("FOUR_SCORE not in", values, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreBetween(Double value1, Double value2) {
            addCriterion("FOUR_SCORE between", value1, value2, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFourScoreNotBetween(Double value1, Double value2) {
            addCriterion("FOUR_SCORE not between", value1, value2, "fourScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreIsNull() {
            addCriterion("FIVE_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andFiveScoreIsNotNull() {
            addCriterion("FIVE_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andFiveScoreEqualTo(Double value) {
            addCriterion("FIVE_SCORE =", value, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreNotEqualTo(Double value) {
            addCriterion("FIVE_SCORE <>", value, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreGreaterThan(Double value) {
            addCriterion("FIVE_SCORE >", value, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("FIVE_SCORE >=", value, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreLessThan(Double value) {
            addCriterion("FIVE_SCORE <", value, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreLessThanOrEqualTo(Double value) {
            addCriterion("FIVE_SCORE <=", value, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreIn(List<Double> values) {
            addCriterion("FIVE_SCORE in", values, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreNotIn(List<Double> values) {
            addCriterion("FIVE_SCORE not in", values, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreBetween(Double value1, Double value2) {
            addCriterion("FIVE_SCORE between", value1, value2, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andFiveScoreNotBetween(Double value1, Double value2) {
            addCriterion("FIVE_SCORE not between", value1, value2, "fiveScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreIsNull() {
            addCriterion("OTHER_SCORE is null");
            return (Criteria) this;
        }

        public Criteria andOtherScoreIsNotNull() {
            addCriterion("OTHER_SCORE is not null");
            return (Criteria) this;
        }

        public Criteria andOtherScoreEqualTo(Double value) {
            addCriterion("OTHER_SCORE =", value, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreNotEqualTo(Double value) {
            addCriterion("OTHER_SCORE <>", value, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreGreaterThan(Double value) {
            addCriterion("OTHER_SCORE >", value, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("OTHER_SCORE >=", value, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreLessThan(Double value) {
            addCriterion("OTHER_SCORE <", value, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreLessThanOrEqualTo(Double value) {
            addCriterion("OTHER_SCORE <=", value, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreIn(List<Double> values) {
            addCriterion("OTHER_SCORE in", values, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreNotIn(List<Double> values) {
            addCriterion("OTHER_SCORE not in", values, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreBetween(Double value1, Double value2) {
            addCriterion("OTHER_SCORE between", value1, value2, "otherScore");
            return (Criteria) this;
        }

        public Criteria andOtherScoreNotBetween(Double value1, Double value2) {
            addCriterion("OTHER_SCORE not between", value1, value2, "otherScore");
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

        public Criteria andCompetitionOrderIsNull() {
            addCriterion("COMPETITION_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderIsNotNull() {
            addCriterion("COMPETITION_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderEqualTo(Integer value) {
            addCriterion("COMPETITION_ORDER =", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderNotEqualTo(Integer value) {
            addCriterion("COMPETITION_ORDER <>", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderGreaterThan(Integer value) {
            addCriterion("COMPETITION_ORDER >", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMPETITION_ORDER >=", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderLessThan(Integer value) {
            addCriterion("COMPETITION_ORDER <", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderLessThanOrEqualTo(Integer value) {
            addCriterion("COMPETITION_ORDER <=", value, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderIn(List<Integer> values) {
            addCriterion("COMPETITION_ORDER in", values, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderNotIn(List<Integer> values) {
            addCriterion("COMPETITION_ORDER not in", values, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderBetween(Integer value1, Integer value2) {
            addCriterion("COMPETITION_ORDER between", value1, value2, "competitionOrder");
            return (Criteria) this;
        }

        public Criteria andCompetitionOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("COMPETITION_ORDER not between", value1, value2, "competitionOrder");
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