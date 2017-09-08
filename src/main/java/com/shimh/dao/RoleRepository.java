package com.shimh.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.shimh.domain.Role;
import com.shimh.domain.User;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	//@Query("from Role where name = :name")
	List<Role> findByNameLike(@Param("name") String name);
}
