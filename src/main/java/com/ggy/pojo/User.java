package com.ggy.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.id
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.email
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.password
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.username
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.role
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    private String role;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.status
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.regTime
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.regIp
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    private String regip;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.id
     *
     * @return the value of user.id
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.id
     *
     * @param id the value for user.id
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.email
     *
     * @return the value of user.email
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.email
     *
     * @param email the value for user.email
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.password
     *
     * @return the value of user.password
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.password
     *
     * @param password the value for user.password
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.username
     *
     * @return the value of user.username
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.username
     *
     * @param username the value for user.username
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.role
     *
     * @return the value of user.role
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public String getRole() {
        return role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.role
     *
     * @param role the value for user.role
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.status
     *
     * @return the value of user.status
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.status
     *
     * @param status the value for user.status
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.regTime
     *
     * @return the value of user.regTime
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.regTime
     *
     * @param regtime the value for user.regTime
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.regIp
     *
     * @return the value of user.regIp
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public String getRegip() {
        return regip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.regIp
     *
     * @param regip the value for user.regIp
     *
     * @mbggenerated Mon Mar 05 14:56:59 GMT+08:00 2018
     */
    public void setRegip(String regip) {
        this.regip = regip;
    }
}