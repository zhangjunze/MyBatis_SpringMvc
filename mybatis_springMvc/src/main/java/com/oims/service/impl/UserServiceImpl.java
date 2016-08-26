package com.oims.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oims.dao.UserMapper;
import com.oims.entity.User;
import com.oims.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	public List<User> getAll() {
		return userMapper.getAll();
	}

}
