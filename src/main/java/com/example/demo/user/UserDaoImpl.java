package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements Cruddao<User>{

	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer insert(User u) {
		String sql="insert into user (id,name,email,password,mobileno,gender) values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {u.getId(),u.getName(),u.getEmail(),u.getPassword(),u.getMobileno(),u.getGender()});
	}
	
	
	
	@Override
	public List<User> insert2(String email,String password){
		return null;
//		String sql ="select id, name,email,password,mobileno,gender from user where email = '"+email+"' and password = '"+password+"'";
////		String sql ="insert into user (id,name,email,password,mobileno,gender) values(?,?,?,?,?,?) where email = '"+"?"+"' and password = '"+"?"+"'"; 
//		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class) );
	}
	
	public List<User>  email(String email){
		return null;
	}
	
	
	public Integer delete(int id) {
		String sql = "delete from  user where id = "+id;
		return jdbcTemplate.update(sql);
	}
	
	@Override
	public List<User> select1(int id){
		return null;
	}
	
	@Override
	public Integer update(User u)
	{
		String sql="update  user set id = ?,name = ?,email = ?,password = ?,mobileno = ?,gender = ? where id = ?";
		return jdbcTemplate.update(sql,new Object[] {u.getId(),u.getName(),u.getEmail(),u.getPassword(),u.getMobileno(),u.getGender(),u.getId()});
	}
	
	@Override
	public List<User> select(){
		return null;
	}
}
