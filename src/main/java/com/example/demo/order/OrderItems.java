package com.example.demo.order;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="`orderitems`")
public class OrderItems {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="orderitems_id")
	private long  orderitemsid;
	
//	 @OneToOne(cascade = CascadeType.ALL)//,mappedBy = "orderitems")
	// @JoinColumn(name="oid")
    //* @JsonBackReference
	//@OneToMany(cascade = CascadeType.ALL)//,mappedBy = "orderitems")
	//@JsonManagedReference
//	@ManyToOne(fetch = FetchType.LAZY)
//	private Order order; 
	
	@Column(name="name", nullable = false,table="orderitems")
	private String name;
	
	@Column(name="qty", nullable = false,table="orderitems")
    private int  qty;
	
	@Column(name="image", nullable = false,table="orderitems")
    private String image;
	
	@Column(name="price", nullable = false,table="orderitems")
    private float price;
	
	@Column(name="product", nullable = false,table="orderitems")
    private long product;
	
	@Column(name="cis", nullable = false,table="orderitems")
    private int cis;

	public long getOrderitemsid() {
		return orderitemsid;
	}

	public void setOrderitemsid(long orderitemsid) {
		this.orderitemsid = orderitemsid;
	}

	

//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	public long getProduct() {
		return product;
	}

	public void setProduct(long product) {
		this.product = product;
	}

	public int getCis() {
		return cis;
	}

	public void setCis(int cis) {
		this.cis = cis;
	}

	public OrderItems() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItems(long orderitemsid,String name, int qty, String image, float price,
			long product, int cis) {
		super();
		this.orderitemsid = orderitemsid;
		//this.order = order;
		this.name = name;
		this.qty = qty;
		this.image = image;
		this.price = price;
		this.product = product;
		this.cis = cis;
	}

	
	





	
	




}

