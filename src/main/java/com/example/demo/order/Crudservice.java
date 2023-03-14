package com.example.demo.order;

import java.util.List;

public interface Crudservice {

	//public Response insert(String email,long userid);
	//public Response insert(Order o);
	
	public Order saveOrder(Order order);
	
	public OrderItems get(int orderitemsid,String email);
	
	//public Order2 addOrder(Order2 o);
	
	//public Response insert2(OrderItems o);
	
	public Order findByOid(int oid);
	
//	public Order updateOrder(Order order,int oid); 
	//public Order updateOrder(Order order); 
	public Order updateOrder(PaymentResult r,int oid);
	
	public Order updateOrder(int oid);
	
	public List<Order> findOrderByUserid(int userid);
	
	public List<Order> getallOrder();
	
//	public List<Order> getinnerJoin();
}
