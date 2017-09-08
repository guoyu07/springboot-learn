package com.shimh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shimh.domain.Resource;
@Mapper
public interface ResourceMapper {
	
	Resource findByName(String name);
	
	List<Resource> findAll();
	
	void save(Resource r);
}
