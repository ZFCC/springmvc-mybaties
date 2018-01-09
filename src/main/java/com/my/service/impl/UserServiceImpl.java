package com.my.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.dao.UserMapper;
import com.my.domain.User;
import com.my.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userdao;
	
	public User getUserById(int id) {
		
		User user = userdao.selectByPrimaryKey(id);
		
		return user;
	}

	public int insert(User user) {
		// TODO Auto-generated method stub
		return userdao.insert(user);
	}

	public int insertSelective(User user) {
		// TODO Auto-generated method stub
		return userdao.insertSelective(user);
	}

	public int updateByPrimaryKey(User user) {
		// TODO Auto-generated method stub
		return userdao.updateByPrimaryKey(user);
	}

}
