package com.my.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.my.domain.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User getUserByNameAndPassword(@Param("userName")String userName, @Param("password")String password);
    
    User getUserByName(String userName);
    
    List<User> getAllUser();
}