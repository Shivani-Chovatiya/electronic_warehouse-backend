package com.example.demo.shipping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Shipping {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  id;
	
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

	public Shipping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shipping(long id, String mobileno, String address, String city,String  postalcode, String country) {
		super();
		this.id = id;
		this.mobileno = mobileno;
		this.address = address;
		this.city = city;
		this.postalcode = postalcode;
		this.country = country;
	}

	public long getId() {
		return id;
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
