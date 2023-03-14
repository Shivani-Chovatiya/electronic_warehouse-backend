package com.example.demo.order;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="`shippingaddress`")
public class ShippingAddress {

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="oid")
	@JsonBackReference
	private Order order;
	//@OneToMany(cascade = CascadeType.ALL)//,mappedBy = "shippingaddress")
	//@JsonManagedReference
	
	
	@Column(name="mobileno",nullable = false)
	private String mobileno;
	
	@Column(name="address",nullable = false)
    private String address;
	
	@Column(name="city",nullable = false)
    private String city;
	
	@Column(name="postalcode",nullable = false)
	private String postalcode;
	
	@Column(name="country",nullable = false)
	private String country;

	public ShippingAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public Shipping(long id, String mobileno, String address, String city,String  postalcode, String country) {
//		super();
//		this.id = id;
//		this.mobileno = mobileno;
//		this.address = address;
//		this.city = city;
//		this.postalcode = postalcode;
//		this.country = country;
//	}
	
	

	public long getId() {
		return id;
	}

	public ShippingAddress(long id, Order order, String mobileno, String address, String city, String postalcode,
		String country) {
	super();
	this.id = id;
	this.order = order;
	this.mobileno = mobileno;
	this.address = address;
	this.city = city;
	this.postalcode = postalcode;
	this.country = country;
}

	public void setId(long id) {
		this.id = id;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalcode() {
		return postalcode;
	}

	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
