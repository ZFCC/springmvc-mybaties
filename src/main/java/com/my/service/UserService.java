package com.my.service;

import java.util.List;

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
	
	/**
	 * 
	 * @param name
	 * @param password
	 * @return
	 */
	public User getUserByNameAndPassword(String name, String password);
	
	public User getUserByName(String name);
	
	public List<User> getAllUser();
}
