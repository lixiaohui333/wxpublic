package com.kxkj.wxpublic.dao.mapper;

import com.kxkj.wxpublic.dao.model.ShareHistDo;
import com.kxkj.wxpublic.dao.model.ShareHistDoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShareHistDoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int countByExample(ShareHistDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int deleteByExample(ShareHistDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int insert(ShareHistDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int insertSelective(ShareHistDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    List<ShareHistDo> selectByExample(ShareHistDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    ShareHistDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByExampleSelective(@Param("record") ShareHistDo record, @Param("example") ShareHistDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByExample(@Param("record") ShareHistDo record, @Param("example") ShareHistDoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByPrimaryKeySelective(ShareHistDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ml_share_hist
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    int updateByPrimaryKey(ShareHistDo record);
}