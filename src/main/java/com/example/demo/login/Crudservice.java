package com.example.demo.login;

import java.util.List;

public interface Crudservice<T> {

	//public Response insert(T t);
	
	public List<LoginUser> insert(String email);
}
