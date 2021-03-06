package com.ec.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProjectfileExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public ProjectfileExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
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
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
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

        public Criteria andFileIdIsNull() {
            addCriterion("File_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("File_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(Integer value) {
            addCriterion("File_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(Integer value) {
            addCriterion("File_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(Integer value) {
            addCriterion("File_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("File_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(Integer value) {
            addCriterion("File_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(Integer value) {
            addCriterion("File_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<Integer> values) {
            addCriterion("File_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<Integer> values) {
            addCriterion("File_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(Integer value1, Integer value2) {
            addCriterion("File_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(Integer value1, Integer value2) {
            addCriterion("File_id not between", value1, value2, "fileId");
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

        public Criteria andFileTitleIsNull() {
            addCriterion("File_Title is null");
            return (Criteria) this;
        }

        public Criteria andFileTitleIsNotNull() {
            addCriterion("File_Title is not null");
            return (Criteria) this;
        }

        public Criteria andFileTitleEqualTo(String value) {
            addCriterion("File_Title =", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleNotEqualTo(String value) {
            addCriterion("File_Title <>", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleGreaterThan(String value) {
            addCriterion("File_Title >", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleGreaterThanOrEqualTo(String value) {
            addCriterion("File_Title >=", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleLessThan(String value) {
            addCriterion("File_Title <", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleLessThanOrEqualTo(String value) {
            addCriterion("File_Title <=", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleLike(String value) {
            addCriterion("File_Title like", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleNotLike(String value) {
            addCriterion("File_Title not like", value, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleIn(List<String> values) {
            addCriterion("File_Title in", values, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleNotIn(List<String> values) {
            addCriterion("File_Title not in", values, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleBetween(String value1, String value2) {
            addCriterion("File_Title between", value1, value2, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileTitleNotBetween(String value1, String value2) {
            addCriterion("File_Title not between", value1, value2, "fileTitle");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("File_URL is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("File_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("File_URL =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("File_URL <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("File_URL >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("File_URL >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("File_URL <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("File_URL <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("File_URL like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("File_URL not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("File_URL in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("File_URL not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("File_URL between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("File_URL not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andUploaderIdIsNull() {
            addCriterion("Uploader_id is null");
            return (Criteria) this;
        }

        public Criteria andUploaderIdIsNotNull() {
            addCriterion("Uploader_id is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderIdEqualTo(Integer value) {
            addCriterion("Uploader_id =", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdNotEqualTo(Integer value) {
            addCriterion("Uploader_id <>", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdGreaterThan(Integer value) {
            addCriterion("Uploader_id >", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Uploader_id >=", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdLessThan(Integer value) {
            addCriterion("Uploader_id <", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdLessThanOrEqualTo(Integer value) {
            addCriterion("Uploader_id <=", value, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdIn(List<Integer> values) {
            addCriterion("Uploader_id in", values, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdNotIn(List<Integer> values) {
            addCriterion("Uploader_id not in", values, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdBetween(Integer value1, Integer value2) {
            addCriterion("Uploader_id between", value1, value2, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Uploader_id not between", value1, value2, "uploaderId");
            return (Criteria) this;
        }

        public Criteria andUploaderNameIsNull() {
            addCriterion("Uploader_Name is null");
            return (Criteria) this;
        }

        public Criteria andUploaderNameIsNotNull() {
            addCriterion("Uploader_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUploaderNameEqualTo(String value) {
            addCriterion("Uploader_Name =", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotEqualTo(String value) {
            addCriterion("Uploader_Name <>", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameGreaterThan(String value) {
            addCriterion("Uploader_Name >", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameGreaterThanOrEqualTo(String value) {
            addCriterion("Uploader_Name >=", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameLessThan(String value) {
            addCriterion("Uploader_Name <", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameLessThanOrEqualTo(String value) {
            addCriterion("Uploader_Name <=", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameLike(String value) {
            addCriterion("Uploader_Name like", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotLike(String value) {
            addCriterion("Uploader_Name not like", value, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameIn(List<String> values) {
            addCriterion("Uploader_Name in", values, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotIn(List<String> values) {
            addCriterion("Uploader_Name not in", values, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameBetween(String value1, String value2) {
            addCriterion("Uploader_Name between", value1, value2, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploaderNameNotBetween(String value1, String value2) {
            addCriterion("Uploader_Name not between", value1, value2, "uploaderName");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("Upload_Time is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("Upload_Time is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(Date value) {
            addCriterion("Upload_Time =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(Date value) {
            addCriterion("Upload_Time <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(Date value) {
            addCriterion("Upload_Time >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Upload_Time >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(Date value) {
            addCriterion("Upload_Time <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(Date value) {
            addCriterion("Upload_Time <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<Date> values) {
            addCriterion("Upload_Time in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<Date> values) {
            addCriterion("Upload_Time not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(Date value1, Date value2) {
            addCriterion("Upload_Time between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(Date value1, Date value2) {
            addCriterion("Upload_Time not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table projectfile
     *
     * @mbggenerated do_not_delete_during_merge Mon Mar 05 17:00:05 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table projectfile
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
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