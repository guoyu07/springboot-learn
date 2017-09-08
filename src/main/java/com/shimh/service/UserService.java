package com.shimh.service;

import java.util.List;

import com.shimh.domain.User;

public interface UserService {

	List<User> listUsers();


	void addUser(User user);


	User getUserById(String id);


	void updateUser(User user);


	void removeUser(String id);


}
