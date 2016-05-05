package com.oims.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.oims.entity.User;
import com.oims.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class TestUserService1 {
	Logger logger = Logger.getLogger(TestUserService1.class);
	@Autowired
	private UserService userService;
	
	
	public void test(){
		User user = userService.getUserById(1);
		  System.out.println(user.getUsername()+"====++===="+user.getPassword());
		
	}
	@Test
	public void test2(){
		List<User> list = userService.getAll();
		logger.debug(JSON.toJSON(list));
	}
}
