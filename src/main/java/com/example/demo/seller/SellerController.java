package com.example.demo.seller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.product.Product;

@RestController
@RequestMapping("/sellers")
public class SellerController {

	@Autowired
	private Crudservice cSer;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/")
	public Seller saveSeller(@RequestBody Seller seller) {
		Seller sellerresponse=cSer.saveSeller(seller);
		
		return sellerresponse;
	}
	 
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/{sellerid}",method = RequestMethod.GET)
	public Seller getSeller(@PathVariable Integer sellerid) {
		Seller sellerresponse=cSer.getSeller(sellerid);
		
		return sellerresponse;
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/login2/")
	public Seller login(@RequestBody Seller seller) {
		Seller loginresponse=cSer.login(seller.getEmail(),seller.getPassword());
		
		return loginresponse;
	}
	
	 @CrossOrigin(origins = "http://localhost:3000")
	    @PutMapping("/{sellerid}/")
	    public Seller updateSeller(@RequestBody Seller seller,@PathVariable Integer sellerid) {
		 Seller sellerResponse = cSer.updateSeller(seller, sellerid);
		 return sellerResponse;
	 }
	 
	 @CrossOrigin(origins = "http://localhost:3000")
	    @PutMapping("/{sellerid}")
	    public Seller updateSellerDetail(@RequestBody Seller seller,@PathVariable Integer sellerid) {
		 Seller sellerResponse = cSer.updateSellerDetail(seller, sellerid);
		 return sellerResponse;
	 }
}
