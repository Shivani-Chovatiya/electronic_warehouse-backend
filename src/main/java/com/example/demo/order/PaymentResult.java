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
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="`paymentresult`")
public class PaymentResult {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="payment_id")
	private long payment_id;
	
	@Column(name="id",nullable = false)
	private String id;
	
	@Column(name="status",nullable = false)
	private String status;
	
	@Column(name="email_address")
	private String email_address;
	
	
//	@OneToOne(cascade = CascadeType.ALL)//,mappedBy = "shippingaddress")
//	@JoinColumn(name="oid")
//	@JsonBackReference
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "result")
	@JsonManagedReference
	private Order order;


	public PaymentResult() {
		super();
		// TODO Auto-generated constructor stub
	}


	public PaymentResult(long payment_id, String id, String status, String email_address, Order order) {
		super();
		this.payment_id = payment_id;
		this.id = id;
		this.status = status;
		this.email_address = email_address;
		this.order = order;
	}


	public long getPayment_id() {
		return payment_id;
	}


	public void setPayment_id(long payment_id) {
		this.payment_id = payment_id;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getEmail_address() {
		return email_address;
	}


	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


}
