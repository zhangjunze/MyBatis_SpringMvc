package com.oims.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.oims.entity.User;
import com.oims.service.UserService;

@Controller
@RequestMapping("/userController")
public class UserController {
	Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	public UserService userService;
	
	@RequestMapping("/user.htm")
	private String getUser(Integer id,HttpServletRequest request){
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		logger.debug(JSON.toJSON(u));
		return "showUser";
	}
	
	@RequestMapping("/user1.htm")
	private String getUser1(HttpServletRequest request){
		request.setAttribute("user11","111111111111111111");
		return "index";
	}
}
