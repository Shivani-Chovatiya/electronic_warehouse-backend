package com.example.demo.user;

import java.util.List;

 interface  Cruddao<T> {

	 public Integer insert(User u);
	 
	 //public Integer  insert2(User u);
	 public List<User>  insert2(String email,String password);
	 
	 public List<User>  email(String email);
	 
	 public List<User> select1(int id);
	 
	 public Integer update(User u);
	 
	 public List<User> select();
	 
	 public Integer delete(int id); 
}



