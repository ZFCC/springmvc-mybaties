package com.my.service;

import com.my.domain.User;

public interface UserService {

	/**
	 * 根据id查询
	 */
	public User getUserById(int id);
	
	/*
	 * 全插入
	 */
	public int insert(User user);
	
	/**
	 * 可以省略的插入
	 * @param user
	 * @return
	 */
	public int insertSelective(User user);
	
	public int updateByPrimaryKey(User user);
}
