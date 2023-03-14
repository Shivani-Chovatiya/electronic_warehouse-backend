package com.example.demo.user;

import java.util.List;


import com.example.demo.user.*;


public interface Crudservice<T> {

	//public Response insert(T t);
 public Response insert(User u);
	
	public List<User> insert2(String email,String password);
	//public Response insert2(User u);
	
	
	public boolean  email(String email);
	
	public List<User> select1(int id);
	
	public Response update(T t);
	
	public List<User> select();
	
	public Response delete(int id);
}
