package com.oims.service;


import java.util.List;

import com.oims.entity.User;

public interface UserService {
	public User getUserById(Integer id);
	public List<User> getAll();
}
