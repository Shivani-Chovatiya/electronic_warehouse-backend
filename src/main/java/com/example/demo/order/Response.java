package com.example.demo.order;

import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

public class Response {

	
    private long  oid;
    
	private long userid;
	
	private String email;
	
	OrderItems orderitems;
	
    private long  orderitemsid;
	
	Order order; 
	
	private String name;
	
    private int  qty;
	
    private String image;
	
    private float price;
	
    private long product;
	
    private int cis;
    
    private boolean status;
	private String msg;
	private int data;

	public long getOid() {
		return oid;
	}

	public void setOid(long oid) {
		this.oid = oid;
	}

	public long getUserid() {
		return userid;
	}

	public void setUserid(long userid) {
		this.userid = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public OrderItems getOrderitems() {
		return orderitems;
	}

	public void setOrderitems(OrderItems orderitems) {
		this.orderitems = orderitems;
	}

	public long getOrderitemsid() {
		return orderitemsid;
	}

	public void setOrderitemsid(long orderitemsid) {
		this.orderitemsid = orderitemsid;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

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
