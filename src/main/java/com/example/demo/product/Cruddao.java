package com.example.demo.product;

import java.util.List;
import java.util.Map;

import com.example.demo.seller.Seller;

	interface Cruddao<T> {

		public Integer insert(Product p);
		
		public Integer updated(int id,Product p);
		
		public Integer delete(int id);
		
		public List<ProductSeller> select();
		
		public List<Product> selectById(int id);
		
		public List<Product> selectByCatagory(String cat);
		
		public Integer insert2(Product2 p,String name );
		
//		public List<Product2> select2(String name);
		
		public List<Product2> select2(int sellerid);
		
		public List<Product> select(int sellerid);
		
//		SELECT * FROM seller B JOIN productdetails A ON B.sellerid=A.sellerid WHERE B.sellerid=1;
		
		public Integer insert(Reveiws r,int id);
		
		public Integer insertr(Reveiws2 r);
		
		public List<Reveiws2> selectr(int id);
		
		public List<Seller> select3();
		
		public List<Try> tryit1(int id);
		
		public List<Try> tryit(int tid);
}
