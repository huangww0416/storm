package com.ggy.dao;

import com.ggy.pojo.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Mar 02 11:02:51 GMT+08:00 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Mar 02 11:02:51 GMT+08:00 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Mar 02 11:02:51 GMT+08:00 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Mar 02 11:02:51 GMT+08:00 2018
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Mar 02 11:02:51 GMT+08:00 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Fri Mar 02 11:02:51 GMT+08:00 2018
     */
    int updateByPrimaryKey(User record);
}