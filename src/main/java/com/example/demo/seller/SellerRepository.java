package com.example.demo.seller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository

public interface SellerRepository extends JpaRepository<Seller,Integer> {

//	@Query("select sellerid,address,email,gstno,mobileno,name,panno,password,pincode,isseller from seller where email= :email")
	public Seller findByEmail( String email );
	public Seller findByPassword(String password);
	public  Seller findBySellerid(int sellerid);
	
}
