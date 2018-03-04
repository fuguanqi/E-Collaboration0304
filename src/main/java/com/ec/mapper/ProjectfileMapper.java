package com.ec.mapper;

import com.ec.entity.Projectfile;
import com.ec.entity.ProjectfileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectfileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int countByExample(ProjectfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int deleteByExample(ProjectfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int deleteByPrimaryKey(Integer fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int insert(Projectfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int insertSelective(Projectfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    List<Projectfile> selectByExample(ProjectfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    Projectfile selectByPrimaryKey(Integer fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByExampleSelective(@Param("record") Projectfile record, @Param("example") ProjectfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByExample(@Param("record") Projectfile record, @Param("example") ProjectfileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByPrimaryKeySelective(Projectfile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table projectfile
     *
     * @mbggenerated Sun Mar 04 21:46:52 CST 2018
     */
    int updateByPrimaryKey(Projectfile record);
}