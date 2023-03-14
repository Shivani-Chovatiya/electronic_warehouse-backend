package com.example.demo.seller;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="`product1`")
public class Product1 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id;
	
	@Column(name="name", nullable = false)
	private String name;
//	
//	@Column(name="sellerid", nullable = false)
//	private String sellerid;
	
//	@ManyToOne(fetch = FetchType.LAZY)
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="sellerid")
//	@JsonBackReference
//	private Seller seller;
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="sellerid")
//	@JsonBackReference
//	private Seller seller;
	
	@Column(name="image", nullable = false)
	private String image;
	
	@Column(name="description", nullable = false)
	private String description;
	
	@Column(name="rating", nullable = false)
	private String rating;
	
	@Column(name="price", nullable = false)
	private float price;
	
	@Column(name="cis", nullable = false)
	private int cis;
	
	@Column(name="reveiws", nullable = false)
	private String reveiws;
	
	@CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedAt", nullable = false)
	private Date createdAt = new Date(System.currentTimeMillis());
	
	 
//	 @CreationTimestamp
//	 @Temporal(TemporalType.TIMESTAMP)
//	@Column(name="UpdatedAt", nullable = false)
//	private Date updatedAt =new Date(System.currentTimeMillis());
//	
	@Column(name="gst", nullable = false)
	private String gst;
	
	@Column(name="discount", nullable = false)
	private String discount;
	
	@Column(name="catagory", nullable = false)
	private String catagory;



	
	
	
	
	
//	
//	public Seller getSeller() {
//		return seller;
//	}
//
//
//
//
//
//
//
//	public void setSeller(Seller seller) {
//		this.seller = seller;
//	}







	public Product1(long id, String name, String image, String description, String rating, float price,
			int cis, String reveiws, Date createdAt, String gst, String discount, String catagory) {
		super();
		this.id = id;
		this.name = name;
		//this.seller = seller;
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
	}







	public String getCatagory() {
		return catagory;
	}

	

	



	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public Product1() {
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

//	public String getSellerid() {
//		return sellerid;
//	}
//
//	public void setSellerid(String sellerid) {
//		this.sellerid = sellerid;
//	}

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

//	public Date getUpdatedAt() {
//		return updatedAt;
//	}
//
//	public void setUpdatedAt(Date updatedAt) {
//		this.updatedAt = updatedAt;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", name=" + name + ", sellerid=" + sellerid + ", image=" + image + ", description="
//				+ description + ", rating=" + rating + ", price=" + price + ", cis=" + cis + ", reveiws=" + reveiws
//				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + ", gst=" + gst + ", discount=" + discount
//				+ ", catagory=" + catagory + "]";
//	}

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
	
	
}
