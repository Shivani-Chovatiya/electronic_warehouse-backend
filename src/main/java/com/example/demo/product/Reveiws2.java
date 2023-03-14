package com.example.demo.product;

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
@Table(name="`reveiws2`")
public class Reveiws2 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  reveiwsid;
	
	@Column(name="uname", nullable = false)
	private String uname;
	
	@Column(name="rating", nullable = false)
	private String rating;
	
	@Column(name="comment", nullable = false)
	private String comment;
	
	@Column(name="userid", nullable = false)
	private long userid;
	
	@Column(name="id", nullable = false)
	private long id;
	
	@CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedAt", nullable = false)
	private Date createdAt = new Date(System.currentTimeMillis());

	public Reveiws2() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Reveiws2(long reveiwsid, String uname, String rating, String comment, long userid, long id, Date createdAt) {
		super();
		this.reveiwsid = reveiwsid;
		this.uname = uname;
		this.rating = rating;
		this.comment = comment;
		this.userid = userid;
		this.id = id;
		this.createdAt = createdAt;
	}

	


	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public long getReveiwsid() {
		return reveiwsid;
	}

	public void setReveiwsid(long reveiwsid) {
		this.reveiwsid = reveiwsid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	
}
