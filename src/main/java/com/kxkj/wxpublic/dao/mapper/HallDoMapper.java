package com.kxkj.wxpublic.dao.mapper;

import com.kxkj.wxpublic.dao.model.HallDo;
import com.kxkj.wxpublic.dao.model.HallDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HallDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int countByExample(HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int deleteByExample(HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int insert(HallDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int insertSelective(HallDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    List<HallDo> selectByExample(HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    HallDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") HallDo record, @Param("example") HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByExample(@Param("record") HallDo record, @Param("example") HallDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByPrimaryKeySelective(HallDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_hall
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByPrimaryKey(HallDo record);
}