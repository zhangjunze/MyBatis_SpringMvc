package com.oims.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.oims.entity.User;
import com.oims.service.UserService;


@Controller
@RequestMapping("/userController")
public class UserController {
	Logger logger = Logger.getLogger(UserController.class);
	@Autowired
	public UserService userService;
	
	@RequestMapping(path="/user.htm",method=RequestMethod.GET)
	private String getUser(Integer id,HttpServletRequest request){
		User u = userService.getUserById(id);
		request.setAttribute("user", u);
		logger.debug(JSON.toJSON(u));
		return "showUser";
	}
	
	@RequestMapping(path="/findUser.htm",method=RequestMethod.GET)
	private void findUser(HttpServletRequest request){
		List<User> list = userService.getAll();
		/*Help<User> u = new Help<User>();
		u.setList(list);
		u.setTotal(1);*/
		request.setAttribute("rows", list);
		request.setAttribute("total", 1);
		logger.debug(JSON.toJSON(list));
		
	}
	
	@RequestMapping(path="/findUserToJson.htm",method=RequestMethod.GET)
	private @ResponseBody List<User> findUserToJson(HttpServletRequest request){
		List<User> list = userService.getAll();
		/*Help<User> u = new Help<User>();
		u.setList(list);
		u.setTotal(1);*/
		request.setAttribute("rows", list);
		request.setAttribute("total", 1);
		logger.debug(JSON.toJSON(list));
		return list;
	}
	
	
	@RequestMapping("/user1.htm")
	private String getUser1(HttpServletRequest request){
		request.setAttribute("user11","111111111111111111");
		return "index";
	}
}
