package com.example.demo.user;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;





public abstract class GenericAbstractServices<T> implements Crudservice<T> {

	private Integer noofRow;
	private String msg;
	private Response res;
	private Response abc;
private long  id;
	
	private List<User> select;
	private String name;
	

	private String email;
	
	
	private String password;
	
	
	private long mobileno;
	
	
	private String gender;
	
	
	private Date createdAt ;
	
	Cruddao<T> c;
	
	{
		noofRow=0;
		msg="";
		res=new Response();
		abc =new Response();
	}

	public GenericAbstractServices() {
		
		// TODO Auto-generated constructor stub
	}
	
	protected GenericAbstractServices(Cruddao<T> c) {
		this.c=c;
	}
	
//	public Response insert(T t) {
//		noofRow= c.insert(t);
//		msg="Inserted Successfully";
//		
//		res.setStatus(noofRow>0);
//		res.setMsg(msg);
//		res.setData(noofRow);
//		
//		return res;
//	}
	
	public Response insert(User u) {
		
		//User u = new User();
		id=u.getId();
		name=u.getName();
		email=u.getEmail();
		password=u.getPassword();
		mobileno=u.getMobileno();
		gender=u.getGender();
		createdAt=u.getCreatedAt();
		noofRow=c.insert(u);
		msg="register successfully";
		
		res.setId(id);
		res.setName(name);
		res.setEmail(email);
		res.setPassword(password);
		res.setMobileno(mobileno);
		res.setGender(gender);
		res.setCreatedAt(createdAt);
		res.setStatus(noofRow>0);
		res.setMsg(msg);
		res.setData(noofRow);
		
		return res;
	}
	
	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate;
	
//	public List<User> insert2(String email,String password){
//		String sql ="select id,name,email,password,mobileno,gender from user where email = '"+email+"' and password = '"+password+"'";
//			return jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));
//		
//		
//
//	}
	
	public boolean email(String em){
		String sql ="select id,name,email,password,mobileno,gender from user where email = '"+em+"'";
		
		//System.out.println((jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class))).isEmpty());
		//return jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));
		
		
	
		if((jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class))).isEmpty())
		{
			return true;
		}
		else {
			return false;
		}
	}

	
public List<User> insert2(String em,String pa) {
		
	String sql ="select id, name,email,password,mobileno,gender from user where email = '"+em+"' and password = '"+pa+"'";
//	String sql ="insert into user (id,name,email,password,mobileno,gender) values(?,?,?,?,?,?) where email = '"+"?"+"' and password = '"+"?"+"'"; 
	return  jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class) );
	
//		User u = new User();
//		id=u.getId();
//		name=u.getName();
//		email=u.getEmail();
//		password=u.getPassword();
//		mobileno=u.getMobileno();
//		gender=u.getGender();
//		
//		select=c.insert2(em,pa);
//		
//		msg="Login successfully";
//		
//		res.setSelect(select);
//		res.setId(id);
//		res.setName(name);
//		res.setEmail(email);
//		res.setPassword(password);
//		res.setMobileno(mobileno);
//		res.setGender(gender);
		
//		res.setStatus(!select.isEmpty());
//		
//		res.setMsg(msg);
		//res.setData(noofRow);
		
//		return res;
	} 
	
public Response delete(int id) {
	noofRow= c.delete(id);
	msg="Deleted Successfully";
	
	res.setStatus(noofRow>0);
	res.setMsg(msg);
	res.setData(noofRow);
	
	return res;
}
	
	
	
	public List<User> select1(int id)
	{
		String sql="select id,name,email,password,mobileno,gender,created_at from user where id = "+id;
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));
	}
	
	public List<User> select()
	{
		String sql="select id,name,email,password,mobileno,gender,created_at from user ";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));
	}
	
public Response update(User u) {
		
		//User u = new User();
		id=u.getId();
		name=u.getName();
		email=u.getEmail();
		password=u.getPassword();
		mobileno=u.getMobileno();
		gender=u.getGender();
		createdAt=u.getCreatedAt();
		noofRow=c.update(u);
		msg="updated successfully";
		
		res.setId(id);
		res.setName(name);
		res.setEmail(email);
		res.setPassword(password);
		res.setMobileno(mobileno);
		res.setGender(gender);
		res.setCreatedAt(createdAt);
		res.setStatus(noofRow>0);
		res.setMsg(msg);
		res.setData(noofRow);
		
		return res;
	}
}
