package com.example.demo.product;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

public class ProductSeller {

	private long id;
	private String name;
	private String image;
	private String description;
	private String rating;
	private float price;
	private int cis;
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt = new Date(System.currentTimeMillis());
    private String gst;
	private String discount;
	private String catagory;
    private long  sellerid;
	private String sname;
	public ProductSeller() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductSeller(long id, String name, String image, String description, String rating, float price, int cis,
			Date createdAt, String gst, String discount, String catagory, long sellerid, String sname) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.description = description;
		this.rating = rating;
		this.price = price;
		this.cis = cis;
		this.createdAt = createdAt;
		this.gst = gst;
		this.discount = discount;
		this.catagory = catagory;
		this.sellerid = sellerid;
		this.sname = sname;
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
	public long getSellerid() {
		return sellerid;
	}
	public void setSellerid(long sellerid) {
		this.sellerid = sellerid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
}
