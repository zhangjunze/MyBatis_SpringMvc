package com.oims.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oims.dao.UserMapper;
import com.oims.entity.User;
import com.oims.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	private UserMapper userMapper;
	
	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	public UserMapper getUserMapper() {
		return userMapper;
	}


	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

}
