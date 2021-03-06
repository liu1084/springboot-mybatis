package com.jim.mybatis.model;

import java.util.Date;

public class Comment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.parentId
     *
     * @mbggenerated
     */
    private Long parentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.title
     *
     * @mbggenerated
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.userId
     *
     * @mbggenerated
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.articleId
     *
     * @mbggenerated
     */
    private Long articleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.create_at
     *
     * @mbggenerated
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.update_at
     *
     * @mbggenerated
     */
    private Date updateAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.isLocked
     *
     * @mbggenerated
     */
    private Boolean islocked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.content
     *
     * @mbggenerated
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.id
     *
     * @return the value of comments.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.id
     *
     * @param id the value for comments.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.parentId
     *
     * @return the value of comments.parentId
     *
     * @mbggenerated
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.parentId
     *
     * @param parentid the value for comments.parentId
     *
     * @mbggenerated
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.title
     *
     * @return the value of comments.title
     *
     * @mbggenerated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.title
     *
     * @param title the value for comments.title
     *
     * @mbggenerated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.userId
     *
     * @return the value of comments.userId
     *
     * @mbggenerated
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.userId
     *
     * @param userid the value for comments.userId
     *
     * @mbggenerated
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.articleId
     *
     * @return the value of comments.articleId
     *
     * @mbggenerated
     */
    public Long getArticleid() {
        return articleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.articleId
     *
     * @param articleid the value for comments.articleId
     *
     * @mbggenerated
     */
    public void setArticleid(Long articleid) {
        this.articleid = articleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.create_at
     *
     * @return the value of comments.create_at
     *
     * @mbggenerated
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.create_at
     *
     * @param createAt the value for comments.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.update_at
     *
     * @return the value of comments.update_at
     *
     * @mbggenerated
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.update_at
     *
     * @param updateAt the value for comments.update_at
     *
     * @mbggenerated
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.isLocked
     *
     * @return the value of comments.isLocked
     *
     * @mbggenerated
     */
    public Boolean getIslocked() {
        return islocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.isLocked
     *
     * @param islocked the value for comments.isLocked
     *
     * @mbggenerated
     */
    public void setIslocked(Boolean islocked) {
        this.islocked = islocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.content
     *
     * @return the value of comments.content
     *
     * @mbggenerated
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.content
     *
     * @param content the value for comments.content
     *
     * @mbggenerated
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}