package com.shimh.dao;

import java.util.List;

import com.shimh.domain.User;

public interface UserDao {
	void addUser(User user);
	User getUserById(String id);
	void removeUser(String id);
	List<User> listUsers();
}
