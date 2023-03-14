package com.example.demo.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shipping")
public class ShppingController {

	
	@Autowired
	ShippingImpl sImpl;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/")
	public Response insert(@RequestBody Shipping s) {
		return sImpl.insert(s);
	}
}

