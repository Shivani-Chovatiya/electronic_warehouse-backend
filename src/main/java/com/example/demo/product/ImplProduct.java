package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.seller.Seller;

@Service
public class ImplProduct implements ServicesCrud {

	@Autowired
	ProductRepository pRepo;
//	Seller sellerData = sRepo.findById(sellerid).get();
	public Product updateProduct(Product p,int id) {
		Product product=pRepo.findById(id).get();
		
//		product.setCatagory(p.getCatagory());
//		product.setCis(p.getCis());
//		product.setDescription(p.getDescription());
//		product.setDiscount(p.getDiscount());
//		product.setGst(p.getGst());
//		product.setImage(p.getImage());
//		product.setName(p.getName());
//		product.setPrice(p.getPrice());
		product.setRating(p.getRating());
		product.setReveiws(p.getReveiws());
		
		System.out.println(p.getReveiws());
		return pRepo.save(product);
	}
	
	public Product findById(int id) {
		return pRepo.findByid(id);
	}
}
