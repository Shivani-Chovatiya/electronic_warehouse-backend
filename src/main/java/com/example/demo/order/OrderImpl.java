package com.example.demo.order;




import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.example.demo.Email.EmailSender;



@Service
public class OrderImpl implements Crudservice{
	
	@Autowired
	private EmailSender emailsender; 
	
	@Autowired
	private OrderRepository oRepo;
	
	@Autowired
	private OrderItemsRepository oiRepo;
	
	public Order saveOrder(Order order) {
		
	   order.getUserid();
	   order.getName();
	   order.getEmail();
//	  order.setUserid(id);
//	  order.setEmail(email);
	   
	  // List<OrderItems> orderitems= order.getOrderitems();
//	   List<OrderItems> orderitems = 
	   order.getOrderitems();
		//orderitems1=(OrderItems) orderitems;
				 //  orderitems.setOrder(order);
//		ShippingAddress shippingaddress =
	   order.getShippingaddress();
//		shippingaddress.setOrder(order);
		order.getPaymentmethod();
		order.getItemsprice();
		order.getShippingprice();
		order.getTaxprice();
		order.getTotalprice();
//		order.isPaid();
//		order.isDeliverd();
//		order.getCreatedAt();
//		order.getPaidAt();
//		order.getResult();
		
	   System.out.println(order.getUserid());
	   System.out.println(order.getEmail());
	   System.out.println(order.getName());
	   System.out.println(order.isPaid());
	   System.out.println(order.getOrderitems());
		order=oRepo.save(order);
		
//		OrderItems o=oRepo.findByorderitemsid(orderitemsid);
		
//		@EventListener(ApplicationReadyEvent.class)
//		public void sendMail() {
//			emailsender.sendEmail(order.getEmail(),"Subject",o.getName());
//		}
		return order;
	}
	
	public OrderItems get(int orderitemsid,String email) {
		OrderItems o=oiRepo.findByOrderitemsid(orderitemsid);
		
		emailsender.sendEmail(email,"Subject",o.getName(),o.getPrice(),o.getQty());
		return o;
	}
	
	
//	public List<Order> getinnerJoin(){
//		
//		return oRepo.getInnerJoin();
//	}
	
	
	public List<Order> getallOrder() {
		
		  return oRepo.findAll();
		}
	
	
	public Order findByOid(int oid){
		
		Order order = oRepo.findByOid(oid);
		System.out.println(order.getOid());
		
		return order;
	}
	
	public List<Order> findOrderByUserid(int userid) {
		return oRepo.findByUserid(userid);
		
	}
	
	
//	public Order updateOrder(int oid,Order order) {
//		Order oDB=oRepo.findByOid(oid);
//		
//		
//		
//		if(Objects.nonNull(order.getName()) && !"".equalsIgnoreCase(
//				
//				order.getName())){
//			oDB.setName(order.getName());
//			
//		}
//		
//if(Objects.nonNull(order.getEmail()) && !"".equalsIgnoreCase(
//				
//				order.getEmail())){
//			oDB.setEmail(order.getEmail());
//			
//		}
//
//
//if(Objects.nonNull(order.getUserid())){// && !"".equalsIgnoreCase(order.getShippingaddress())
//	oDB.setUserid(order.getUserid());
//}
//
//
//if(Objects.nonNull(order.getOrderitems())){   //  && !"".equalsIgnoreCase (order.getOrderitems())
//	oDB.setOrderitems(order.getOrderitems());
//	
//}
//
//if(Objects.nonNull(order.getShippingaddress())){// && !"".equalsIgnoreCase(order.getShippingaddress())
//	oDB.setShippingaddress(order.getShippingaddress());
//	
//}
//
//if(Objects.nonNull(order.getPaymentmethod()) && !"".equalsIgnoreCase(
//		
//		order.getPaymentmethod())){
//	oDB.setName(order.getPaymentmethod());
//	
//}
//
//if(Objects.nonNull(order.getItemsprice())){// && !"".equalsIgnoreCase(order.getItemsprice())
//	oDB.setItemsprice(order.getItemsprice());
//	
//}
//
//if(Objects.nonNull(order.getShippingprice())){
//	oDB.setShippingprice(order.getShippingprice());// && !"".equalsIgnoreCase(order.getPaymentmethod())
//	
//}
//
//if(Objects.nonNull(order.getTaxprice())){
//	oDB.setTaxprice(order.getTaxprice());// && !"".equalsIgnoreCase(order.getPaymentmethod())
//	
//}
//
//if(Objects.nonNull(order.getTotalprice())){// && !"".equalsIgnoreCase(order.getItemsprice())
//	oDB.setTotalprice(order.getTotalprice());
//	
//}
//
//if(Objects.nonNull(order.isPaid())){// && !"".equalsIgnoreCase(order.isPaid())) {
//	oDB.setPaid(order.isPaid() );
//	//oDB.setPaid(true);
//	
//}
//
//if(Objects.nonNull(order.isDeliverd())){// && !"".equalsIgnoreCase(order.getItemsprice())
//	oDB.setDeliverd(order.isDeliverd());
//	//oDB.setDeliverd(true);
//}
//
//if(Objects.nonNull(order.getCreatedAt())){// && !"".equalsIgnoreCase(order.getItemsprice())
//	oDB.setCreatedAt(order.getCreatedAt());
//	
//}
//
//if(Objects.nonNull(order.getResult())){// && !"".equalsIgnoreCase(order.getItemsprice())
//	oDB.setResult(order.getResult());
//	
//}
//		return oRepo.save(oDB);
//	}
	
	
	public Order updateOrder(PaymentResult r,int oid) {
		//PaymentResult r=new PaymentResult();
		Order order=new Order();
		Order existingData=oRepo.findById(oid).get();
//		PaymentResult result =oRepo.findByOid(oid);
//		 existingData.setName(order.getName());
//		 existingData.setEmail(order.getEmail());
//		 existingData.setUserid(order.getUserid());
//		 existingData.setOrderitems(order.getOrderitems());
//		 existingData.setShippingaddress(order.getShippingaddress());
//		 existingData.setPaymentmethod(order.getPaymentmethod());
//		 existingData.setItemsprice(order.getItemsprice());
//		 existingData.setShippingprice(order.getShippingprice());
//		 existingData.setTaxprice(order.getTaxprice());
//		 existingData.setTotalprice(order.getTotalprice());
		 existingData.setPaid(true);
//		 existingData.setDeliverd(order.isDeliverd());
//		 existingData.setCreatedAt(order.getCreatedAt());
		 existingData.setPaidAt(order.getPaidAt());
		 
		 
		 r.setId(r.getId());
		 r.setStatus(r.getStatus());
		 r.setEmail_address(r.getEmail_address());
		 order.setResult(r);
		 
		 existingData.setResult(order.getResult());
		
		 System.out.println(r.getId());
		 System.out.println(r.getStatus());
		 System.out.println(r.getEmail_address());
		 System.out.println(order.getResult());
		 
		
		 return oRepo.save(existingData);
	}
	
	public Order updateOrder(int oid) {
		//PaymentResult r=new PaymentResult();
		Order order=new Order();
		Order existingData=oRepo.findById(oid).get();
//		PaymentResult result =oRepo.findByOid(oid);
//		 existingData.setName(order.getName());
//		 existingData.setEmail(order.getEmail());
//		 existingData.setUserid(order.getUserid());
//		 existingData.setOrderitems(order.getOrderitems());
//		 existingData.setShippingaddress(order.getShippingaddress());
//		 existingData.setPaymentmethod(order.getPaymentmethod());
//		 existingData.setItemsprice(order.getItemsprice());
//		 existingData.setShippingprice(order.getShippingprice());
//		 existingData.setTaxprice(order.getTaxprice());
//		 existingData.setTotalprice(order.getTotalprice());
//		 existingData.setPaid(true);
		 existingData.setDeliverd(true);
//		 existingData.setCreatedAt(order.getCreatedAt());
//		 existingData.setPaidAt(order.getPaidAt());
		 
		 
		
		
		 
		 
		
		 return oRepo.save(existingData);
	}
	
	
	
	
	
//	
//	public Order2 addOrder(Order2 o) {
//        o.getOid();
//		o.getEmail();
//		o.getUserid();
//		
//		o=oRepo.save(o);
//		
//		return o;
//	}
//}



//public class OrderImpl extends GenericabstractService<Order>{
//	
//	 
//	@Autowired
//	protected OrderImpl(OrderDaoImpl oDao) {
//		
//		super(oDao);
//	}
//
}
