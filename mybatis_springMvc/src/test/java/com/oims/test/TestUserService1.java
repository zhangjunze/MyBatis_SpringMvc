package com.oims.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.oims.entity.User;
import com.oims.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestUserService1 {
	@Autowired
	private UserService userService;
	
	
	@Test
	public void test(){
		User user = userService.getUserById(1);
		  System.out.println(user.getUsername()+"====++===="+user.getPassword());
		
	}
}
