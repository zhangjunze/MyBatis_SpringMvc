package com.oims.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oims.entity.User;
import com.oims.service.UserService;

public class TestUserService {
	@Test  
	 public void test1() {
	      ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:spring.xml","classpath:spring-mybatis.xml"} );  
	      UserService userService = (UserService) ctx.getBean("userServiceImpl");  
	      User user = userService.getUserById(1);
	      System.out.println(user.getUsername()+"====++===="+user.getPassword());
	 }  
}
