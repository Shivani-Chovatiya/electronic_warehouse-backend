package com.example.demo.login;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Response {

	private boolean status;
	private String msg;
	private int data;
private long  id;
	
	
	private String email;
	
	
	private String password;
	
	
	private Date createdAt = new Date(System.currentTimeMillis());

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

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Response(boolean status, String msg, int data, long id, String email, String password, Date createdAt) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
		this.id = id;
		this.email = email;
		this.password = password;
		this.createdAt = createdAt;
	}

	public boolean isStatus() {
		return status;
	}
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
