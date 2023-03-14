package com.example.demo.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Try {


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  tid;
	
	
	@Column(name="image",nullable = false)
	private String image;


	public Try() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Try(long tid, String image) {
		super();
		this.tid = tid;
		this.image = image;
	}


	public long getTid() {
		return tid;
	}


	public void setTid(long tid) {
		this.tid = tid;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}
	
	
}
