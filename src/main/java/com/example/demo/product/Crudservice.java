package com.example.demo.product;

import java.util.List;
import java.util.Map;

import com.example.demo.seller.Seller;



//import org.apache.catalina.connector.Response;

public interface Crudservice<T> {

	public Response insert(Product p);
	
	public Response updated(int id,Product p);
	
	public Response delete(int id);
	
	public List<ProductSeller> select();
	
	public List<Product> selectById(int id);
	
	public List<Product> selectByCatagory(String cat);
	
	public Response insert2(Product2 p,String name);
	
//	public List<Product2> select2(String name);
	
	public List<Product2> select2(int sellerid);
	
	public List<Product> select(int sellerid);
	
    public Response insert(Reveiws r,int id);
    
    public Response insertr(Reveiws2 r);
	
	public List<Reveiws2> selectr(int id);
	
	public List<Seller> select3();
	
	public List<Try> tryit1(int id);
	
	public List<Try> tryit(int tid);
}

