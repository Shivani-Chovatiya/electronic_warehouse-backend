package com.example.demo.login;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table
public class LoginUser {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id;
	
	@Column(name="Email",nullable=false)
	private String email;
	
	@Column(name="Password", nullable = false)
	private String password;
	
	@CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedAt", nullable = false)
	private Date createdAt = new Date(System.currentTimeMillis());

	public LoginUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Date getCreatedAt() {
		return createdAt;
	}



	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}



	public LoginUser(long id, String email, String password, Date createdAt) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.createdAt = createdAt;
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
	
	
	
	
}
