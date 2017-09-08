package com.shimh.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shimh.service.UserService;
import com.shimh.domain.User;

/**
 * *****************************************************************
 * Created on 2017年9月1日 上午10:08:55
 * @author shimh 
 * 	
 * 	测试 SpringMVC实现 Restful 服务
 *	
 *    
 * 
 * Update: ------ empty log ------
 ******************************************************************
 */
@RestController
@RequestMapping(value="/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/",method = RequestMethod.GET)
	public List<User> listUsers(){
		return userService.listUsers();
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public User addUser(@PathVariable String id){
		return userService.getUserById(id);
	}
	
	@RequestMapping(value = "/",method = RequestMethod.POST)
	public void addUser(User user){
		userService.addUser(user);
	}
	
	@RequestMapping(value = "/",method = RequestMethod.PUT)
	public void updateUser(User user){
		userService.updateUser(user);
	}
	
	@RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable String id){
		userService.removeUser(id);
	}
	
	@RequestMapping(value = "/test",method = RequestMethod.GET)
	public void test(User user,String id,String type){
		if("add".equals(type)){
			userService.addUser(user);
		}else if("delete".equals(type)){
			userService.removeUser(id);
		}
	}
}
