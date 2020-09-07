package com.gome.pojo;

import java.util.ArrayList;
import java.util.List;

public class GomeUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GomeUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
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

        public Criteria andUserPassIsNull() {
            addCriterion("USER_PASS is null");
            return (Criteria) this;
        }

        public Criteria andUserPassIsNotNull() {
            addCriterion("USER_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andUserPassEqualTo(String value) {
            addCriterion("USER_PASS =", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotEqualTo(String value) {
            addCriterion("USER_PASS <>", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThan(String value) {
            addCriterion("USER_PASS >", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassGreaterThanOrEqualTo(String value) {
            addCriterion("USER_PASS >=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThan(String value) {
            addCriterion("USER_PASS <", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLessThanOrEqualTo(String value) {
            addCriterion("USER_PASS <=", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassLike(String value) {
            addCriterion("USER_PASS like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotLike(String value) {
            addCriterion("USER_PASS not like", value, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassIn(List<String> values) {
            addCriterion("USER_PASS in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotIn(List<String> values) {
            addCriterion("USER_PASS not in", values, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassBetween(String value1, String value2) {
            addCriterion("USER_PASS between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserPassNotBetween(String value1, String value2) {
            addCriterion("USER_PASS not between", value1, value2, "userPass");
            return (Criteria) this;
        }

        public Criteria andUserStatuIsNull() {
            addCriterion("USER_STATU is null");
            return (Criteria) this;
        }

        public Criteria andUserStatuIsNotNull() {
            addCriterion("USER_STATU is not null");
            return (Criteria) this;
        }

        public Criteria andUserStatuEqualTo(String value) {
            addCriterion("USER_STATU =", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuNotEqualTo(String value) {
            addCriterion("USER_STATU <>", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuGreaterThan(String value) {
            addCriterion("USER_STATU >", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuGreaterThanOrEqualTo(String value) {
            addCriterion("USER_STATU >=", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuLessThan(String value) {
            addCriterion("USER_STATU <", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuLessThanOrEqualTo(String value) {
            addCriterion("USER_STATU <=", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuLike(String value) {
            addCriterion("USER_STATU like", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuNotLike(String value) {
            addCriterion("USER_STATU not like", value, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuIn(List<String> values) {
            addCriterion("USER_STATU in", values, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuNotIn(List<String> values) {
            addCriterion("USER_STATU not in", values, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuBetween(String value1, String value2) {
            addCriterion("USER_STATU between", value1, value2, "userStatu");
            return (Criteria) this;
        }

        public Criteria andUserStatuNotBetween(String value1, String value2) {
            addCriterion("USER_STATU not between", value1, value2, "userStatu");
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

        public Criteria andPhotoUrlIsNull() {
            addCriterion("PHOTO_URL is null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIsNotNull() {
            addCriterion("PHOTO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlEqualTo(String value) {
            addCriterion("PHOTO_URL =", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotEqualTo(String value) {
            addCriterion("PHOTO_URL <>", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThan(String value) {
            addCriterion("PHOTO_URL >", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO_URL >=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThan(String value) {
            addCriterion("PHOTO_URL <", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("PHOTO_URL <=", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlLike(String value) {
            addCriterion("PHOTO_URL like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotLike(String value) {
            addCriterion("PHOTO_URL not like", value, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlIn(List<String> values) {
            addCriterion("PHOTO_URL in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotIn(List<String> values) {
            addCriterion("PHOTO_URL not in", values, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlBetween(String value1, String value2) {
            addCriterion("PHOTO_URL between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("PHOTO_URL not between", value1, value2, "photoUrl");
            return (Criteria) this;
        }

        public Criteria andBranchIsNull() {
            addCriterion("BRANCH is null");
            return (Criteria) this;
        }

        public Criteria andBranchIsNotNull() {
            addCriterion("BRANCH is not null");
            return (Criteria) this;
        }

        public Criteria andBranchEqualTo(String value) {
            addCriterion("BRANCH =", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotEqualTo(String value) {
            addCriterion("BRANCH <>", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThan(String value) {
            addCriterion("BRANCH >", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH >=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThan(String value) {
            addCriterion("BRANCH <", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLessThanOrEqualTo(String value) {
            addCriterion("BRANCH <=", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchLike(String value) {
            addCriterion("BRANCH like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotLike(String value) {
            addCriterion("BRANCH not like", value, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchIn(List<String> values) {
            addCriterion("BRANCH in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotIn(List<String> values) {
            addCriterion("BRANCH not in", values, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchBetween(String value1, String value2) {
            addCriterion("BRANCH between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andBranchNotBetween(String value1, String value2) {
            addCriterion("BRANCH not between", value1, value2, "branch");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotIsNull() {
            addCriterion("IS_SUBMIT_ROBOT is null");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotIsNotNull() {
            addCriterion("IS_SUBMIT_ROBOT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotEqualTo(String value) {
            addCriterion("IS_SUBMIT_ROBOT =", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotNotEqualTo(String value) {
            addCriterion("IS_SUBMIT_ROBOT <>", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotGreaterThan(String value) {
            addCriterion("IS_SUBMIT_ROBOT >", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SUBMIT_ROBOT >=", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotLessThan(String value) {
            addCriterion("IS_SUBMIT_ROBOT <", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotLessThanOrEqualTo(String value) {
            addCriterion("IS_SUBMIT_ROBOT <=", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotLike(String value) {
            addCriterion("IS_SUBMIT_ROBOT like", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotNotLike(String value) {
            addCriterion("IS_SUBMIT_ROBOT not like", value, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotIn(List<String> values) {
            addCriterion("IS_SUBMIT_ROBOT in", values, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotNotIn(List<String> values) {
            addCriterion("IS_SUBMIT_ROBOT not in", values, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotBetween(String value1, String value2) {
            addCriterion("IS_SUBMIT_ROBOT between", value1, value2, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andIsSubmitRobotNotBetween(String value1, String value2) {
            addCriterion("IS_SUBMIT_ROBOT not between", value1, value2, "isSubmitRobot");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNull() {
            addCriterion("VIDEO_URL is null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIsNotNull() {
            addCriterion("VIDEO_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVideoUrlEqualTo(String value) {
            addCriterion("VIDEO_URL =", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotEqualTo(String value) {
            addCriterion("VIDEO_URL <>", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThan(String value) {
            addCriterion("VIDEO_URL >", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL >=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThan(String value) {
            addCriterion("VIDEO_URL <", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_URL <=", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlLike(String value) {
            addCriterion("VIDEO_URL like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotLike(String value) {
            addCriterion("VIDEO_URL not like", value, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlIn(List<String> values) {
            addCriterion("VIDEO_URL in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotIn(List<String> values) {
            addCriterion("VIDEO_URL not in", values, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlBetween(String value1, String value2) {
            addCriterion("VIDEO_URL between", value1, value2, "videoUrl");
            return (Criteria) this;
        }

        public Criteria andVideoUrlNotBetween(String value1, String value2) {
            addCriterion("VIDEO_URL not between", value1, value2, "videoUrl");
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