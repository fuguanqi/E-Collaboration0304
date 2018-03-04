package com.ec.mapper;

import com.ec.entity.Participate;
import com.ec.entity.ParticipateExample;
import com.ec.entity.ParticipateKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParticipateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int countByExample(ParticipateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int deleteByExample(ParticipateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int deleteByPrimaryKey(ParticipateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int insert(Participate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int insertSelective(Participate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    List<Participate> selectByExample(ParticipateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    Participate selectByPrimaryKey(ParticipateKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Participate record, @Param("example") ParticipateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByExample(@Param("record") Participate record, @Param("example") ParticipateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(Participate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table participate
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByPrimaryKey(Participate record);
}