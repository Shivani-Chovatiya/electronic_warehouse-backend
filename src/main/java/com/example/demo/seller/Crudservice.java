package com.example.demo.seller;

import java.util.List;

import com.example.demo.product.Product;

public interface Crudservice {

	public Seller saveSeller(Seller seller);
	
	public Seller login(String email,String password);
	
	public Seller updateSeller(Seller seller,int sellerid);
	
	public Seller getSeller(int sellerid);
	
	public Seller updateSellerDetail(Seller seller,int sellerid);
}
