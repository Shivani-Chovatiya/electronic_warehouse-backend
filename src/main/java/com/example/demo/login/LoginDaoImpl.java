package com.example.demo.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDaoImpl implements Cruddao<LoginUser> {

	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer insert(LoginUser l) {
		String sql="insert into login_user (id,email,password) values(?,?,?)";
		
		return jdbcTemplate.update(sql,new Object[] {l.getId(),l.getEmail(),l.getPassword()});
	}
//	public Integer insert(LoginUser l){
//		return null;
//	}
}
