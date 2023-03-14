package com.example.demo.login;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.product.Product;

import jakarta.persistence.Column;

public abstract class GenericAbstractService<T> implements Crudservice<T> {

	private Integer noofRow;
	private String msg;
	private Response res;
	 private long  id;
	
	private String email;
	private Date createdAt=new Date(System.currentTimeMillis());
	private String password;
	
	Cruddao<T> c;
	{
		noofRow=0;
		msg="";
		res=new Response();
		
	}
	public GenericAbstractService() {
		
		// TODO Auto-generated constructor stub
	}
	
	protected GenericAbstractService(Cruddao<T> c) {
		this.c = c;
	}
	
//	public Response insert(T t) {
//		noofRow=c.insert(t);
//		msg="Login successfully";
//		
//		res.setStatus(noofRow>0);
//		res.setData(noofRow);
//		res.setMsg(msg);
//		return res;
//	}
	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate;
	

	public List<LoginUser> insert(String email){
		//String sql="insert into login_user (id,email,password) values(?,?,?)";
		String sql ="select (id,name,email,password,mobileno,gender) from user where email = '"+email+"'";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(LoginUser.class));
		//return jdbcTemplate.
//		id=l.getId();
//		email=l.getEmail();
//		password=l.getPassword();
//		createdAt=l.getCreatedAt();
//		noofRow=c.insert(l);
//		msg="Login sucessfully";
//		
//		res.setId(id);
//		res.setEmail(email);
//		res.setPassword(password);
//		res.setCreatedAt(createdAt);
//		res.setStatus(noofRow>0);
//		res.setMsg(msg);
//		res.setData(noofRow);
//		
//		return res;
	}
	
}
