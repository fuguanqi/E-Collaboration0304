package com.ec.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhaseExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public PhaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
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
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
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

        public Criteria andPhaseIdIsNull() {
            addCriterion("Phase_id is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIdIsNotNull() {
            addCriterion("Phase_id is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseIdEqualTo(Integer value) {
            addCriterion("Phase_id =", value, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdNotEqualTo(Integer value) {
            addCriterion("Phase_id <>", value, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdGreaterThan(Integer value) {
            addCriterion("Phase_id >", value, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Phase_id >=", value, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdLessThan(Integer value) {
            addCriterion("Phase_id <", value, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdLessThanOrEqualTo(Integer value) {
            addCriterion("Phase_id <=", value, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdIn(List<Integer> values) {
            addCriterion("Phase_id in", values, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdNotIn(List<Integer> values) {
            addCriterion("Phase_id not in", values, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdBetween(Integer value1, Integer value2) {
            addCriterion("Phase_id between", value1, value2, "phaseId");
            return (Criteria) this;
        }

        public Criteria andPhaseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Phase_id not between", value1, value2, "phaseId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("Project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("Project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("Project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("Project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("Project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("Project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("Project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("Project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("Project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("Project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeIsNull() {
            addCriterion("Ph_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeIsNotNull() {
            addCriterion("Ph_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeEqualTo(Date value) {
            addCriterion("Ph_begin_time =", value, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeNotEqualTo(Date value) {
            addCriterion("Ph_begin_time <>", value, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeGreaterThan(Date value) {
            addCriterion("Ph_begin_time >", value, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Ph_begin_time >=", value, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeLessThan(Date value) {
            addCriterion("Ph_begin_time <", value, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("Ph_begin_time <=", value, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeIn(List<Date> values) {
            addCriterion("Ph_begin_time in", values, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeNotIn(List<Date> values) {
            addCriterion("Ph_begin_time not in", values, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeBetween(Date value1, Date value2) {
            addCriterion("Ph_begin_time between", value1, value2, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("Ph_begin_time not between", value1, value2, "phBeginTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeIsNull() {
            addCriterion("Ph_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeIsNotNull() {
            addCriterion("Ph_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeEqualTo(Date value) {
            addCriterion("Ph_end_time =", value, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeNotEqualTo(Date value) {
            addCriterion("Ph_end_time <>", value, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeGreaterThan(Date value) {
            addCriterion("Ph_end_time >", value, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Ph_end_time >=", value, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeLessThan(Date value) {
            addCriterion("Ph_end_time <", value, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("Ph_end_time <=", value, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeIn(List<Date> values) {
            addCriterion("Ph_end_time in", values, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeNotIn(List<Date> values) {
            addCriterion("Ph_end_time not in", values, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeBetween(Date value1, Date value2) {
            addCriterion("Ph_end_time between", value1, value2, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("Ph_end_time not between", value1, value2, "phEndTime");
            return (Criteria) this;
        }

        public Criteria andPhTitleIsNull() {
            addCriterion("Ph_title is null");
            return (Criteria) this;
        }

        public Criteria andPhTitleIsNotNull() {
            addCriterion("Ph_title is not null");
            return (Criteria) this;
        }

        public Criteria andPhTitleEqualTo(String value) {
            addCriterion("Ph_title =", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleNotEqualTo(String value) {
            addCriterion("Ph_title <>", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleGreaterThan(String value) {
            addCriterion("Ph_title >", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Ph_title >=", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleLessThan(String value) {
            addCriterion("Ph_title <", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleLessThanOrEqualTo(String value) {
            addCriterion("Ph_title <=", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleLike(String value) {
            addCriterion("Ph_title like", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleNotLike(String value) {
            addCriterion("Ph_title not like", value, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleIn(List<String> values) {
            addCriterion("Ph_title in", values, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleNotIn(List<String> values) {
            addCriterion("Ph_title not in", values, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleBetween(String value1, String value2) {
            addCriterion("Ph_title between", value1, value2, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhTitleNotBetween(String value1, String value2) {
            addCriterion("Ph_title not between", value1, value2, "phTitle");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionIsNull() {
            addCriterion("Ph_description is null");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionIsNotNull() {
            addCriterion("Ph_description is not null");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionEqualTo(String value) {
            addCriterion("Ph_description =", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionNotEqualTo(String value) {
            addCriterion("Ph_description <>", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionGreaterThan(String value) {
            addCriterion("Ph_description >", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("Ph_description >=", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionLessThan(String value) {
            addCriterion("Ph_description <", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionLessThanOrEqualTo(String value) {
            addCriterion("Ph_description <=", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionLike(String value) {
            addCriterion("Ph_description like", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionNotLike(String value) {
            addCriterion("Ph_description not like", value, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionIn(List<String> values) {
            addCriterion("Ph_description in", values, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionNotIn(List<String> values) {
            addCriterion("Ph_description not in", values, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionBetween(String value1, String value2) {
            addCriterion("Ph_description between", value1, value2, "phDescription");
            return (Criteria) this;
        }

        public Criteria andPhDescriptionNotBetween(String value1, String value2) {
            addCriterion("Ph_description not between", value1, value2, "phDescription");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table phase
     *
     * @mbggenerated do_not_delete_during_merge Mon Mar 05 16:40:23 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table phase
     *
     * @mbggenerated Mon Mar 05 16:40:23 CST 2018
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