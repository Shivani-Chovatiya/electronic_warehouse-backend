package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registration")
public class UserController {

	@Autowired
	UserImpl uImpl;
	
	@Autowired
	ServiceCrud uSer;
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@PostMapping("/")
//	public Response insert(@RequestBody User u) {
//		return uImpl.insert(u);
//	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/")
	public User saveuser(@RequestBody User user) {
		
		return uSer.saveuser(user);
		
	}
	
	 
	 @CrossOrigin(origins = "http://localhost:3000")
//	 @RequestMapping(value="/login/",method=RequestMethod.POST)
	 @PostMapping("/login/")
	 public List<User> insert2(@RequestBody User u)
	 {
		 
			 return uImpl.insert2(u.getEmail(),u.getPassword());
		//return uImpl.insert2(u);
	 }
	 
	 @CrossOrigin(origins = "http://localhost:3000")
	 @RequestMapping(value = "/{email}/",method = RequestMethod.GET)
	 public boolean email(@PathVariable String email)
	 {
		 return uImpl.email(email);
	 }
	 
	 
	 
	 @CrossOrigin(origins = "http://localhost:3000")
	 @RequestMapping(value="/{id}",method=RequestMethod.GET)
	 public List<User> select1(@PathVariable Integer id){
		 return uImpl.select1(id);
	 }
	 
	 @CrossOrigin(origins = "http://localhost:3000")
	 @PutMapping("/profile")
	 public Response update(@RequestBody User u) {
		 return uImpl.update(u);
	 }
	 
	 @CrossOrigin(origins = "http://localhost:3000")
	 @RequestMapping(value="/",method=RequestMethod.GET)
	 public List<User> select(){
		 return uImpl.select();
	 }
	 
	 
	 @CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/{id}/")
	 public Response delete(@PathVariable Integer id){
		 return uImpl.delete(id);
	 }
	 
}
