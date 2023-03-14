package com.example.demo.seller;

import java.util.List;

import com.example.demo.product.Product;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="`seller`")
public class Seller {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long  sellerid;
	
	@Column(name="sname",nullable = false)
	private String sname;
	
	@Column(name="email",nullable = false)
	private String email;
	
	@Column(name="password",nullable = false)
	private String password;
	
	@Column(name="mobileno",nullable = false)
	private String mobileno;
	
	@Column(name="gstno",nullable = false)
	private String gstno;
	
	@Column(name="panno",nullable = false)
	private String panno;
	
	@Column(name="address",nullable = false)
	private String address;
	
	@Column(name="pincode",nullable = false)
	private String pincode;
	
	@Column(name="isseller",nullable = false)
	private boolean isSeller;
	
//	@Column(name="",nullable = false)
//	@OneToOne(cascade = CascadeType.ALL,mappedBy = "seller")
//    @JsonManagedReference
//	@OneToMany(cascade = CascadeType.ALL)//,mappedBy = "order")
//	@JoinColumn(name= "sellerid")
//	private List<Product1> product1 ;
	
	
//	@OneToMany(cascade = CascadeType.ALL)//,mappedBy = "order")
//	@JoinColumn(name= "sellerid")
//	@OneToOne(cascade = CascadeType.ALL,mappedBy = "seller")
//  @JsonManagedReference
//  @OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="id")
//	@JsonBackReference
	//@ManyToOne(cascade = CascadeType.ALL,optional = false)
//	  @JsonManagedReference
	//@JoinColumn(name="id")
	@OneToMany(cascade = CascadeType.ALL)//,mappedBy = "order")
	@JoinColumn(name= "sellerid")
	private List<Product> productdetails ;

	public Seller() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	

	public Seller(long sellerid, String sname, String email, String password, String mobileno, String gstno,
			String panno, String address, String pincode, boolean isSeller, List<Product> productdetails) {
		super();
		this.sellerid = sellerid;
		this.sname = sname;
		this.email = email;
		this.password = password;
		this.mobileno = mobileno;
		this.gstno = gstno;
		this.panno = panno;
		this.address = address;
		this.pincode = pincode;
		this.isSeller = isSeller;
		this.productdetails = productdetails;
	}






	public boolean isSeller() {
		return isSeller;
	}






	public void setSeller(boolean isSeller) {
		this.isSeller = isSeller;
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






	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getGstno() {
		return gstno;
	}

	public void setGstno(String gstno) {
		this.gstno = gstno;
	}

	public String getPanno() {
		return panno;
	}

	public void setPanno(String panno) {
		this.panno = panno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public List<Product> getProductdetails() {
		return productdetails;
	}

	public void setProductdetails(List<Product> productdetails) {
		this.productdetails = productdetails;
	}

//	public List<Product1> getProduct1() {
//		return product1;
//	}
//
//	public void setProduct1(List<Product1> product1) {
//		this.product1 = product1;
//	}
	
	
}
