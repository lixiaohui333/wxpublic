package com.kxkj.wxpublic.dao.mapper;

import com.kxkj.wxpublic.dao.model.CategoryDo;
import com.kxkj.wxpublic.dao.model.CategoryDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int countByExample(CategoryDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int deleteByExample(CategoryDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int insert(CategoryDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int insertSelective(CategoryDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    List<CategoryDo> selectByExample(CategoryDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    CategoryDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") CategoryDo record, @Param("example") CategoryDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByExample(@Param("record") CategoryDo record, @Param("example") CategoryDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByPrimaryKeySelective(CategoryDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_category
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByPrimaryKey(CategoryDo record);
}