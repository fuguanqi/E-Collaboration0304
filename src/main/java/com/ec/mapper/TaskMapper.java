package com.ec.mapper;

import com.ec.entity.Task;
import com.ec.entity.TaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int countByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int deleteByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int deleteByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int insert(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int insertSelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    List<Task> selectByExample(TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    Task selectByPrimaryKey(Integer taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByExample(@Param("record") Task record, @Param("example") TaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByPrimaryKeySelective(Task record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByPrimaryKey(Task record);
}