package com.example.demo.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.Controller;

@RestController
@RequestMapping("/registration/login2")
public class LoginController   {
	
	@Autowired
	LoginImpl lImpl;
	
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/")
	public List<LoginUser> insert(@RequestBody String email) {
		return lImpl.insert(email);
	}
	

}
