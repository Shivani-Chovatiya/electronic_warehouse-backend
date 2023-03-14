package com.example.demo.product;


import java.util.List;
import java.util.Map;

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

import com.example.demo.seller.Seller;



@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ServicesCrud pSer;

	@Autowired
	ProductImpl pImpl;
	
//	@Override
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/")
	public Response insert(@RequestBody Product p) {
		return pImpl.insert(p);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/addproduct/{name}")
	public Response insert2(@RequestBody Product2 p,@PathVariable String name) {
		return pImpl.insert2(p,name);
	}

	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/update/{id}")
	public Response updated(@PathVariable Integer id,@RequestBody Product p) {
		return pImpl.updated(id,p);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PutMapping("/{id}/reveiws/")
//	public Response insert(@RequestBody Reveiws r, @PathVariable Integer id) {
	public Product updateProduct(@RequestBody Product p, @PathVariable Integer id) {
		return pSer.updateProduct(p,id);
	}
	
	@CrossOrigin(origins = "http://localhost:3000")
	@DeleteMapping("/{id}")
	public Response delete(@PathVariable Integer id) {
		return pImpl.delete(id);
	}
	
    @CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/",method=RequestMethod.GET)
	public List<ProductSeller> select() {
		return pImpl.select();
	}
    
    @CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/sname/",method=RequestMethod.GET)
	public List<Seller> select3() {
		return pImpl.select3();
	}
    
    @CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/list/{sellerid}/",method=RequestMethod.GET)
	public List<Product> select(@PathVariable Integer sellerid) {
		return pImpl.select(sellerid);
	}
	
    
    @CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/select/{sellerid}",method=RequestMethod.GET)
	public List<Product2> select2(@PathVariable Integer sellerid) {
		return pImpl.select2(sellerid);
	}
	
//	@GetMapping("/{id}")
//	@RequestMapping(value="/",method=RequestMethod.GET)
//	public Response select(@RequestBody Product p) {
//		return pImpl.select(p);
//	}
    
    @CrossOrigin(origins = "http://localhost:3000")
   	@RequestMapping(value="/{id}",method=RequestMethod.GET)
//   	public List<Product> selectById(@PathVariable Integer id) {
    public Product findById(@PathVariable Integer id) {
   		//return pImpl.selectById(id);
    	return pSer.findById(id);
   	}
    
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/addreveiws/")
    public Response insertr(@RequestBody Reveiws2 r) {
    	return pImpl.insertr(r);
    }
    
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/select/{id}/",method=RequestMethod.GET)
    public List<Reveiws2> selectr(@PathVariable Integer id) {
    	return pImpl.selectr(id);
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/try/{tid}",method=RequestMethod.GET)
    public List<Try> tryit(@PathVariable Integer tid) {
    	return pImpl.tryit(tid);
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/try1/{id}",method=RequestMethod.GET)
    public List<Try> tryit1(@PathVariable Integer id) {
    	return pImpl.tryit1(id);
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
   	@RequestMapping(value="/{cat}/",method=RequestMethod.GET)
   	public List<Product> selectByCatagory(@PathVariable String cat) {
   		return pImpl.selectByCatagory(cat);
   	}
}
