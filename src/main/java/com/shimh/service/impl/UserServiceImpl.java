package com.shimh.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.shimh.domain.User;

@Service
public class UserServiceImpl implements com.shimh.service.UserService {

	private Map<String,User> users = Collections.synchronizedMap(new HashMap<String, User>());
	
	@Override
	public List<User> listUsers() {
		System.out.println(users);
		return new ArrayList<User>( users.values());
	}

	@Override
	public void addUser(User user) {
		user.setId(UUID.randomUUID().toString());
		users.put(user.getId(), user);
		System.out.println(users);
	}

	@Override
	public User getUserById(String id) {
		System.out.println(users);
		return users.get(id);
	}

	@Override
	public void updateUser(User user) {
		User old = users.get(user.getId());
		old.setAddress(user.getAddress());
		old.setName(user.getName());
		System.out.println(users);
	}

	@Override
	public void removeUser(String id) {
		users.remove(id);
		System.out.println(users);
	}

}
