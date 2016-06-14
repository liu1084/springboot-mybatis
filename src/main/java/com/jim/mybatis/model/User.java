package com.jim.mybatis.model;

import java.util.Date;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.username
     *
     * @mbggenerated
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.password
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.roleId
     *
     * @mbggenerated
     */
    private Integer roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.nickname
     *
     * @mbggenerated
     */
    private String nickname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.isLocked
     *
     * @mbggenerated
     */
    private Boolean islocked;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.create_at
     *
     * @mbggenerated
     */
    private Date createAt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.update_at
     *
     * @mbggenerated
     */
    private Date updateAt;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.id
     *
     * @param id the value for users.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.username
     *
     * @return the value of users.username
     *
     * @mbggenerated
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.username
     *
     * @param username the value for users.username
     *
     * @mbggenerated
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.password
     *
     * @return the value of users.password
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.password
     *
     * @param password the value for users.password
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.roleId
     *
     * @return the value of users.roleId
     *
     * @mbggenerated
     */
    public Integer getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.roleId
     *
     * @param roleid the value for users.roleId
     *
     * @mbggenerated
     */
    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.nickname
     *
     * @return the value of users.nickname
     *
     * @mbggenerated
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.nickname
     *
     * @param nickname the value for users.nickname
     *
     * @mbggenerated
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.isLocked
     *
     * @return the value of users.isLocked
     *
     * @mbggenerated
     */
    public Boolean getIslocked() {
        return islocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.isLocked
     *
     * @param islocked the value for users.isLocked
     *
     * @mbggenerated
     */
    public void setIslocked(Boolean islocked) {
        this.islocked = islocked;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.create_at
     *
     * @return the value of users.create_at
     *
     * @mbggenerated
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.create_at
     *
     * @param createAt the value for users.create_at
     *
     * @mbggenerated
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.update_at
     *
     * @return the value of users.update_at
     *
     * @mbggenerated
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.update_at
     *
     * @param updateAt the value for users.update_at
     *
     * @mbggenerated
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}