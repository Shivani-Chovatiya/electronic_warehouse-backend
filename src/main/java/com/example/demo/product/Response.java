package com.example.demo.product;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class Response {

	private boolean status;
	private String msg;
	private int data;
private long  id;

	private String name;

	private String image;
	
	private String description;
	
	private String rating;
	
	private float price;
	
	private int cis;
	
	private String reveiws;
	
	private Date createdAt;// = new Date(System.currentTimeMillis());
	
	private String gst;

	private String discount;

	private String catagory;
	
	private List<Product> select;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	public Response(boolean status, String msg, int data, long id, String name, String image, String description,
			String rating, float price, int cis, String reveiws, Date createdAt, String gst, String discount,
			String catagory, List<Product> select) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
		this.id = id;
		this.name = name;
		this.image = image;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.cis = cis;
		this.reveiws = reveiws;
		this.createdAt = createdAt;
		this.gst = gst;
		this.discount = discount;
		this.catagory = catagory;
		this.select = select;
	}





	public List<Product> getSelect() {
		return select;
	}





	public void setSelect(List<Product> select) {
		this.select = select;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCis() {
		return cis;
	}

	public void setCis(int cis) {
		this.cis = cis;
	}

	public String getReveiws() {
		return reveiws;
	}

	public void setReveiws(String reveiws) {
		this.reveiws = reveiws;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getGst() {
		return gst;
	}

	public void setGst(String gst) {
		this.gst = gst;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
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
	
	
//	public Response() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	public Response(String status, String msg, int data) {
//		super();
//		this.status = status;
//		this.msg = msg;
//		this.data = data;
//	}
//	public String getStatus() {
//		return status;
//	}
//	public void setStatus(String status) {
//		this.status = status;
//	}
//	public String getMsg() {
//		return msg;
//	}
//	public void setMsg(String msg) {
//		this.msg = msg;
//	}
//	public int getData() {
//		return data;
//	}
//	public void setData(int data) {
//		this.data = data;
//	}
//	
	
	
	
}
