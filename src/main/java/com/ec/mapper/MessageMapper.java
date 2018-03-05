package com.ec.mapper;

import com.ec.entity.Message;
import com.ec.entity.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int countByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int deleteByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int deleteByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    List<Message> selectByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    Message selectByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated Mon Mar 05 17:00:05 CST 2018
     */
    int updateByPrimaryKey(Message record);
}