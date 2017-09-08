package com.shimh.dao;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.shimh.domain.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ResourceMapperTest {
	
	@javax.annotation.Resource
	private ResourceMapper resourceMapper;
	
	@Test
	public void save(){
		resourceMapper.save(new Resource("用户管理"));
		resourceMapper.save(new Resource("角色管理"));
	}
	
	@Test
	public void findAll(){
		System.out.println(resourceMapper.findAll());
	}
	
	@Test
	public void findOne(){
		System.out.println(resourceMapper.findByName("用户管理"));
	}
}
