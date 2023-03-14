package com.example.demo.shipping;

import jakarta.persistence.Column;

public class Response {

	private boolean status;
	private String msg;
	private int data;
    private long  id;
    private String mobileno;
    private String address;
    private String city;
	private String postalcode;
	private String country;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(boolean status, String msg, int data, long id, String mobileno, String address, String city,
			String postalcode, String country) {
		super();
		this.status = status;
		this.msg = msg;
		this.data = data;
		this.id = id;
		this.mobileno = mobileno;
		this.address = address;
		this.city = city;
		this.postalcode = postalcode;
		this.country = country;
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