package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplUser implements ServiceCrud {
	
	@Autowired
	UserRepository uRepo;
	
	public User saveuser(User u) {
		u.getName();
		u.getEmail();
		u.getPassword();
		u.getMobileno();
		u.getGender();
		
		u=uRepo.save(u);
		return u;
	}

}
