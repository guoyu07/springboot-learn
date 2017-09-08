package com.shimh.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shimh.domain.Role;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {
	
	@Autowired
	private RoleRepository roleRepository;
	
	@Test
	public void save(){
		roleRepository.save(new Role("超级管理员"));
		roleRepository.save(new Role("系统管理员"));
	}
	
	@Test
	public void findAll(){
		System.out.println(roleRepository.findAll());
	}
	
	@Test
	public void listRolesByName(){
		System.out.println(roleRepository.findByNameLike("管理员"));
	}
	
	@Test
	public void deleteById(){
		roleRepository.delete(4L);;
	}
	
	@Test
	public void findOne(){
		roleRepository.findOne(1L);;
	}
}
