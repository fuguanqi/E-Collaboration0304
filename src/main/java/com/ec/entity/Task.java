package com.ec.entity;

import java.util.Date;

public class Task {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.Task_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Integer taskId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.Student_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.Project_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Integer projectId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.Phase_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Integer phaseId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.Workload
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Integer workload;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.T_begin_time
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Date tBeginTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.T_end_time
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Date tEndTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.status
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.T_title
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private String tTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.T_description
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private String tDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column task.deadline
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    private Date deadline;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.Task_id
     *
     * @return the value of task.Task_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.Task_id
     *
     * @param taskId the value for task.Task_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.Student_id
     *
     * @return the value of task.Student_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.Student_id
     *
     * @param studentId the value for task.Student_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.Project_id
     *
     * @return the value of task.Project_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.Project_id
     *
     * @param projectId the value for task.Project_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.Phase_id
     *
     * @return the value of task.Phase_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Integer getPhaseId() {
        return phaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.Phase_id
     *
     * @param phaseId the value for task.Phase_id
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setPhaseId(Integer phaseId) {
        this.phaseId = phaseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.Workload
     *
     * @return the value of task.Workload
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Integer getWorkload() {
        return workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.Workload
     *
     * @param workload the value for task.Workload
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.T_begin_time
     *
     * @return the value of task.T_begin_time
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Date gettBeginTime() {
        return tBeginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.T_begin_time
     *
     * @param tBeginTime the value for task.T_begin_time
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void settBeginTime(Date tBeginTime) {
        this.tBeginTime = tBeginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.T_end_time
     *
     * @return the value of task.T_end_time
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Date gettEndTime() {
        return tEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.T_end_time
     *
     * @param tEndTime the value for task.T_end_time
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void settEndTime(Date tEndTime) {
        this.tEndTime = tEndTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.status
     *
     * @return the value of task.status
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.status
     *
     * @param status the value for task.status
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.T_title
     *
     * @return the value of task.T_title
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public String gettTitle() {
        return tTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.T_title
     *
     * @param tTitle the value for task.T_title
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void settTitle(String tTitle) {
        this.tTitle = tTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.T_description
     *
     * @return the value of task.T_description
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public String gettDescription() {
        return tDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.T_description
     *
     * @param tDescription the value for task.T_description
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void settDescription(String tDescription) {
        this.tDescription = tDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column task.deadline
     *
     * @return the value of task.deadline
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public Date getDeadline() {
        return deadline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column task.deadline
     *
     * @param deadline the value for task.deadline
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}