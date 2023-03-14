package com.example.demo.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/order")
public class OrderController {

	
	@Autowired
	private Crudservice cSer;
	
	@Autowired
	ImplOrder oImpl;
	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@PostMapping("/")
//	public Response insert(@RequestBody Order o) {
//		
////		System.out.println(o.getEmail());
////		System.out.println(o.getUserid());
//		return oImpl.insert(o);
//	}
//	
//	
//	@CrossOrigin(origins = "http://localhost:3000")
//	@RequestMapping(value="/orderitems/",method=RequestMethod.POST)
//	public Response insert2(@RequestBody OrderItems o) {
//		
//		return oImpl.insert2(o);
//	}
//
    @CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/")
	public Order saveOrder(@RequestBody Order order){
		
		Order orderResponse = cSer.saveOrder(order);
   // return (Order)this.cSer.saveOrder(order);
		
		return orderResponse;
	}
    
    @CrossOrigin(origins = "http://localhost:3000")
   	@RequestMapping(value="/orderitems/{orderitemsid},{email}")
   	public OrderItems get(@PathVariable Integer orderitemsid,@PathVariable String email){
   		
   		OrderItems orderResponse = cSer.get(orderitemsid,email);
      // return (Order)this.cSer.saveOrder(order);
   		
   		return orderResponse;
   	}
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/myorders/{userid}",method=RequestMethod.GET)
    public List<Order> findOrderByUserid(@PathVariable Integer userid) {
    	return cSer.findOrderByUserid(userid);
    }
	
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/",method=RequestMethod.GET)
    public List<Order> getallOrder()
    {
    	return cSer.getallOrder();
    	
    	
     }
    
    
//    @CrossOrigin(origins = "http://localhost:3000")
//    @RequestMapping(value="/innerjoin",method=RequestMethod.GET)
//   public List<Order> getinnerJoin(){
//    	return cSer.getinnerJoin();
//    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/{oid}/",method=RequestMethod.GET)
    public Order getOrderDetails(@PathVariable int oid)
    {
    	Order  orderRes = cSer.findByOid(oid);
    	
    	return orderRes;
     }
    
    
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/{oid}/")
    public  Order updateOrder(@RequestBody PaymentResult r,@PathVariable Integer oid) {
    	Order updateres = cSer.updateOrder( r,oid);
    	return updateres;
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/getorder/{sellerid}/",method=RequestMethod.GET)
    public  List<Order> selectjoin(@PathVariable Integer sellerid) {
    	return oImpl.selectjoin( sellerid);
    	
    }
    
    
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/deliver/{oid}/")
    public  Order updateOrder(@PathVariable Integer oid) {
    	Order updateres = cSer.updateOrder(oid);
    	return updateres;
    }
    
//    @CrossOrigin(origins = "http://localhost:3000")
//    @PutMapping("/{order}/pay")
//    public  Order updateOrder(@PathVariable Order order) {
//    	Order updateres = cSer.updateOrder( order);
//    	return updateres;
//    }
//    
//    @CrossOrigin(origins = "http://localhost:3000")
//    @PostMapping("/add/")
//    public Order2 addOrder(@RequestBody Order2 o) {
//    	Order2 oResponse = cSer.addOrder(o);
//    	
//    	return oResponse;
//    }
}
