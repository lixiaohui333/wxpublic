package com.kxkj.wxpublic.dao.model;

import java.util.Date;

public class CategoryDo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_category.id
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_category.name
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_category.gmt_create
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_category.gmt_modified
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_category.creator
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_category.state
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_category.id
     *
     * @return the value of ml_category.id
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_category.id
     *
     * @param id the value for ml_category.id
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_category.name
     *
     * @return the value of ml_category.name
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_category.name
     *
     * @param name the value for ml_category.name
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_category.gmt_create
     *
     * @return the value of ml_category.gmt_create
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_category.gmt_create
     *
     * @param gmtCreate the value for ml_category.gmt_create
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_category.gmt_modified
     *
     * @return the value of ml_category.gmt_modified
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_category.gmt_modified
     *
     * @param gmtModified the value for ml_category.gmt_modified
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_category.creator
     *
     * @return the value of ml_category.creator
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_category.creator
     *
     * @param creator the value for ml_category.creator
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_category.state
     *
     * @return the value of ml_category.state
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_category.state
     *
     * @param state the value for ml_category.state
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}