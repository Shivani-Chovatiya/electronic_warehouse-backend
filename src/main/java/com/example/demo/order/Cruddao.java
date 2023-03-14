package com.example.demo.order;

import java.util.List;

public interface Cruddao<T> {
    
	//public Integer insert(String email,long userid);
	public Integer insert(Order o);
	
	public Integer insert2(OrderItems o);
	

}
