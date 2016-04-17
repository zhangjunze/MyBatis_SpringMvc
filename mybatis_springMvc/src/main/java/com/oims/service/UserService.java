package com.oims.service;


import org.springframework.stereotype.Service;

import com.oims.entity.User;
public interface UserService {
	public User getUserById(Integer id);
}
