package com.example.demo.user;

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
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id;
	
	@Column(name="Name", nullable = false)
	private String name;
	
	@Column(name="Email", nullable = false)
	private String email;
	
	@Column(name="Password", nullable = false)
	private String password;
	
	@Column(name="Mobileno", nullable = false)
	private long mobileno;
	
	@Column(name="Gender", nullable = false)
	private String gender;
	
	@CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedAt", nullable = false)
	private Date createdAt = new Date(System.currentTimeMillis());
	
	

	public User(long id, String name, String email, String password, long mobileno, String gender, Date createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.gender = gender;
		this.createdAt = createdAt;
	}

	public User() {
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

	
	
	
	
}
