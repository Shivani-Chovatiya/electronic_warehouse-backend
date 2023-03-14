package com.example.demo.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.product.Product;

import jakarta.transaction.Transactional;

@Service
public class SellerImpl  implements Crudservice{

	@Autowired
	SellerRepository sRepo;
	
	public Seller saveSeller(Seller seller) {
		
		seller.getSname();
		seller.getEmail();
		seller.getPassword();
		seller.getMobileno();
		seller.getGstno();
		seller.getPanno();
		seller.getAddress();
		seller.getPincode();
		seller.setSeller(true);
		seller.isSeller();
		//seller.getProductdetails();
		
		seller=sRepo.save(seller);
		
		return seller;
	}
	
	
	@Transactional
	public Seller login(String email,String password) {
		
		Seller s=new Seller();
		Seller seller=sRepo.findByEmail(email);
//		Seller seller1=sRepo.findByPassword(password);
		System.out.println(seller.getEmail()  +email);
		System.out.println(seller.getPassword()+password);
		System.out.println(((sRepo.findByEmail(seller.getEmail())).equals(email)));
		
//		if(((sRepo.findByEmail(seller.getEmail())).equals(email))==true && ((sRepo.findByPassword(seller.getPassword())).equals(password))==true) {
//			
//				return seller;
//			 
//			
//		}
		
		if(((seller.getEmail()).equals(email))==true  && ((seller.getPassword()).equals(password))==true) {
			return seller;
		}
		return null;
		
	}
	
	public Seller getSeller(int sellerid) {
		Seller seller=sRepo.findBySellerid(sellerid);
		return seller;
	}
	
	
	public Seller updateSeller(Seller seller,int sellerid) {
		Seller sellerData = sRepo.findById(sellerid).get();
		Seller sellerData1 = sRepo.findBySellerid(sellerid);
		
       Seller s=new Seller();
//		sellerData.setSellerid(sellerid);
//		sellerData.setSname(seller.getSname());
//		sellerData.setEmail(seller.getEmail());
//		sellerData.setPassword(seller.getPassword());
//		sellerData.setMobileno(seller.getMobileno());
//		sellerData.setGstno(seller.getGstno());
//		sellerData.setPanno(seller.getPanno());
//		sellerData.setAddress(seller.getAddress());
//		sellerData.setPincode(seller.getPincode());
//		sellerData.setSeller(true);
		sellerData.setProductdetails(seller.getProductdetails());
		
		//System.out.println(sellerData);
		System.out.println(sellerid);
		System.out.println(seller.isSeller());
		System.out.println(sellerData.getSname());
		
		System.out.println(sellerData1.getSname());
//		
		
//		seller.setCatagory(seller.getCatagory());
//		seller.setCis(seller.getCis());
//		seller.setDescription(seller.getDescription());
//		seller.setDiscount(seller.getDiscount());
//		seller.setGst(seller.getGst());
//		seller.setImage(seller.getImage());
//		seller.setName(seller.getName());
//		seller.setPrice(seller.getPrice());
//		seller.setRating(seller.getRating());
//		seller.setReveiws(seller.getReveiws());
//		
//		
//		s.setProductdetails(seller);
//		
//		sellerData.setProductdetails(seller);
//		
		return sRepo.save(sellerData);
	}
	
	
	
	public Seller updateSellerDetail(Seller seller,int sellerid) {
		Seller sellerData = sRepo.findById(sellerid).get();
       Seller s=new Seller();
		sellerData.setSellerid(sellerid);
		sellerData.setSname(seller.getSname());
		sellerData.setEmail(seller.getEmail());
		sellerData.setPassword(seller.getPassword());
		sellerData.setMobileno(seller.getMobileno());
		sellerData.setGstno(seller.getGstno());
		sellerData.setPanno(seller.getPanno());
		sellerData.setAddress(seller.getAddress());
		sellerData.setPincode(seller.getPincode());
		sellerData.setSeller(true);
		
		
		//System.out.println(sellerData);
		System.out.println(sellerid);
		System.out.println(seller.isSeller());

	
		return sRepo.save(sellerData);
	}
	
	
}
