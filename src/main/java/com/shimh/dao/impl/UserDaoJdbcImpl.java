package com.shimh.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.shimh.dao.UserDao;
import com.shimh.domain.User;
/**
 * *****************************************************************
 * Created on 2017年9月1日 下午4:52:29
 * @author shimh
 * 
 *	整合JDBC
 * 
 * 
 * Update: ------ empty log ------
 ******************************************************************
 */
@Repository
public class UserDaoJdbcImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void addUser(User user) {
		 jdbcTemplate.update("insert into user(id,name,address) values(?,?,?)",new Object[]{user.getId(),user.getName(),user.getAddress()});
	}

	@Override
	public User getUserById(String id) {
		
		return jdbcTemplate.queryForObject("select name from user where id = ?", new Object[]{id}, User.class);
	}

	@Override
	public void removeUser(String id) {
		jdbcTemplate.update("delete from user where id = ?", id);
		
	}

	@Override
	public List<User> listUsers() {
		
		return jdbcTemplate.query("select id,name,address from user",new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int arg1) throws SQLException {
				
				User user = new User();
				user.setId(rs.getString("id"));
				user.setName(rs.getString("name"));
				user.setAddress(rs.getString("address"));
				return user;
			}
			
		});
	}
	
}
