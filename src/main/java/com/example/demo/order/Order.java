package com.example.demo.order;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.ManyToAny;

import com.example.demo.order.OrderItems;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.SecondaryTable;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="`order`")

public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  oid;
	
	@Column(name="userid", nullable = false)
	private long userid;
	
	@Column(name="email", nullable = false)
	private String email;
	
	@Column(name="name",nullable = false)
	private String name;
	
	
	//@OneToOne(cascade = CascadeType.ALL,mappedBy = "order")
	//@JsonManagedReference
//	@JoinColumn(name="orderitemsid") 
//	@JsonBackReference
	@OneToMany(cascade = CascadeType.ALL)//,mappedBy = "order")
	@JoinColumn(name= "oid")
	private List<OrderItems> orderitems;

	@OneToOne(cascade = CascadeType.ALL,mappedBy = "order")
    @JsonManagedReference
//	@JoinColumn(name="id") 
//	@JsonBackReference
	private ShippingAddress shippingaddress;
	
	@Column(name="paymentmethod",nullable = false)
	private String paymentmethod; 
	
	@Column(name="itemsprice",nullable = false)
	private float itemsprice; 
	
	@Column(name="shippingprice",nullable = false)
	private float shippingprice; 
	
	@Column(name="taxprice",nullable = false)
	private float taxprice; 
	
	@Column(name="totalprice",nullable = false)
	private float totalprice; 
	
	@Column(name="isPaid",nullable = false)
	private boolean isPaid; 
	
	@Column(name="isDeliverd",nullable = false)
	private boolean isDeliverd; 
	
	@CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name="CreatedAt", nullable = false)
	private Date createdAt = new Date(System.currentTimeMillis());
	
	@CreationTimestamp
	 @Temporal(TemporalType.TIMESTAMP)
	@Column(name="paidAt", nullable = false)
	private Date paidAt = new Date(System.currentTimeMillis());
	
//	@Column(name="paymentstatus")
//	private String paymentstatus; 
	
	
//	@OneToOne(cascade = CascadeType.ALL,mappedBy = "order")
//    @JsonManagedReference
	//@Column(name="result",nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name="payment_id")
	private PaymentResult result; 
	
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPaymentmethod() {
		return paymentmethod;
	}


	public void setPaymentmethod(String paymentmethod) {
		this.paymentmethod = paymentmethod;
	}


	public float getItemsprice() {
		return itemsprice;
	}


	public void setItemsprice(float itemsprice) {
		this.itemsprice = itemsprice;
	}


	public float getShippingprice() {
		return shippingprice;
	}


	public void setShippingprice(float shippingprice) {
		this.shippingprice = shippingprice;
	}


	public float getTaxprice() {
		return taxprice;
	}


	

	public void setTaxprice(float taxprice) {
		this.taxprice = taxprice;
	}


	public float getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}


	


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


	





public ShippingAddress getShippingaddress() {
		return shippingaddress;
	}


	public void setShippingaddress(ShippingAddress shippingaddress) {
		this.shippingaddress = shippingaddress;
	}


	public boolean isPaid() {
		return isPaid;
	}


	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}


	public boolean isDeliverd() {
		return isDeliverd;
	}


	public void setDeliverd(boolean isDeliverd) {
		this.isDeliverd = isDeliverd;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getPaidAt() {
		return paidAt;
	}


	public void setPaidAt(Date paidAt) {
		this.paidAt = paidAt;
	}


//	public String getPaymentstatus() {
//		return paymentstatus;
//	}
//
//
//	public void setPaymentstatus(String paymentstatus) {
//		this.paymentstatus = paymentstatus;
//	}


	public PaymentResult getResult() {
		return result;
	}


	public void setResult(PaymentResult result) {
		this.result = result;
	}


public Order(long oid, long userid, String email, String name, List<OrderItems> orderitems,
			ShippingAddress shippingaddress, String paymentmethod, float itemsprice, float shippingprice,
			float taxprice, float totalprice, boolean isPaid, boolean isDeliverd, Date createdAt, Date paidAt, PaymentResult result) {
		super();
		this.oid = oid;
		this.userid = userid;
		this.email = email;
		this.name = name;
		this.orderitems = orderitems;
		this.shippingaddress = shippingaddress;
		this.paymentmethod = paymentmethod;
		this.itemsprice = itemsprice;
		this.shippingprice = shippingprice;
		this.taxprice = taxprice;
		this.totalprice = totalprice;
		this.isPaid = isPaid;
		this.isDeliverd = isDeliverd;
		this.createdAt = createdAt;
		this.paidAt = paidAt;
		//this.paymentstatus = paymentstatus;
		this.result = result;
	}


//	public Order(long oid, long userid, String email, OrderItems orderitems) {
//		super();
//		this.oid = oid;
//		this.userid = userid;
//		this.email = email;
//		this.orderitems = orderitems;
//	}


	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<OrderItems> getOrderitems() {
		return orderitems;
	}


	public void setOrderitems(List<OrderItems> orderitems) {
		this.orderitems = orderitems;
	}


	

//	public Order(long oid, long userid, String email, OrderItems orderitems, ShippingAddress shipping) {
//		super();
//		this.oid = oid;
//		this.userid = userid;
//		this.email = email;
//		this.orderitems = orderitems;
//		this.shipping = shipping;
//	}


	
	
//	@Id
////	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="order_id" ,table="orderitems")
//	private long  order_id;
//	
		
		
		
	
}


//@Embeddable

//	@Column(name="name", nullable = false,table="orderitems")
//	private String name;
//	
//	@Column(name="qty", nullable = false,table="orderitems")
//    private int  qty;
//	
//	@Column(name="image", nullable = false,table="orderitems")
//    private String image;
//	
//	@Column(name="price", nullable = false,table="orderitems")
//    private float price;
//	
//	@Column(name="productid", nullable = false,table="orderitems")
//    private long productid;
//	
//	@Column(name="cis", nullable = false,table="orderitems")
//    private int cis;
//
//	
//
//	public String getName() {
//		return name;
//	}
//
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//
//	public int getQty() {
//		return qty;
//	}
//
//
//	public void setQty(int qty) {
//		this.qty = qty;
//	}
//
//
//	public String getImage() {
//		return image;
//	}
//
//
//	public void setImage(String image) {
//		this.image = image;
//	}
//
//
//	public float getPrice() {
//		return price;
//	}
//
//
//	public void setPrice(float price) {
//		this.price = price;
//	}
//
//
//	public long getProductid() {
//		return productid;
//	}
//
//
//	public void setProductid(long productid) {
//		this.productid = productid;
//	}
//
//
//	public int getCis() {
//		return cis;
//	}
//
//
//	public void setCis(int cis) {
//		this.cis = cis;
//	}
//
//}
