package com.example.demo.user;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;






public  class Response  {

	private boolean status;
	private String msg;
	private int data;
private long  id;
	
private List<User> select;

	public List<User> getSelect() {
	return select;
}

public void setSelect(List<User> select) {
	this.select = select;
}
	private String name;
	
	
	private String email;
	
	
	private String password;
	
	
	private long mobileno;
	
	
	private String gender;
	

	private Date createdAt; 
	
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileno() {
		return mobileno;
	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	

	public Response(boolean status, String msg, int data, long id,  String name, String email,
			String password, long mobileno, String gender, Date createdAt) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
		this.id = id;
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.gender = gender;
		this.createdAt = createdAt;
	}

	public boolean isStatus() {
		return status;
	}
//	public Response(boolean status, String msg, int data, long id, User select, String name, String email, String password,
//		long mobileno, String gender, Date createdAt) {
//	super();
//	this.status = status;
//	this.msg = msg;
//	this.data = data;
//	this.id = id;
//	this.select = select;
//	this.name = name;
//	this.email = email;
//	this.password = password;
//	this.mobileno = mobileno;
//	this.gender = gender;
//	this.createdAt = createdAt;
//}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}

	

	

	
	
	

	


	
	
	
}
