package com.kxkj.wxpublic.dao.model;

import java.util.Date;

public class ImgDo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_img.id
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_img.type
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_img.url
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private String url;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_img.gmt_create
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_img.gmt_modified
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private Date gmtModified;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_img.creator
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private String creator;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ml_img.state
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    private String state;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_img.id
     *
     * @return the value of ml_img.id
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_img.id
     *
     * @param id the value for ml_img.id
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_img.type
     *
     * @return the value of ml_img.type
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_img.type
     *
     * @param type the value for ml_img.type
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_img.url
     *
     * @return the value of ml_img.url
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_img.url
     *
     * @param url the value for ml_img.url
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_img.gmt_create
     *
     * @return the value of ml_img.gmt_create
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_img.gmt_create
     *
     * @param gmtCreate the value for ml_img.gmt_create
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_img.gmt_modified
     *
     * @return the value of ml_img.gmt_modified
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_img.gmt_modified
     *
     * @param gmtModified the value for ml_img.gmt_modified
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_img.creator
     *
     * @return the value of ml_img.creator
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_img.creator
     *
     * @param creator the value for ml_img.creator
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ml_img.state
     *
     * @return the value of ml_img.state
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ml_img.state
     *
     * @param state the value for ml_img.state
     *
     * @mbggenerated Wed Mar 20 11:58:31 CST 2019
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}