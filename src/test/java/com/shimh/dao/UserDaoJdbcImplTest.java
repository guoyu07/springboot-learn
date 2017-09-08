package com.shimh.dao;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shimh.domain.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoJdbcImplTest {
	@Autowired
	private UserDao userDao;
	
	@Test
	public void test() {
		
		User user = new User();
		user.setId(UUID.randomUUID().toString());
		user.setName("史明辉");
		user.setAddress("泰安");
		
		userDao.addUser(user);
		
		System.out.println(userDao.listUsers());
	}
}
