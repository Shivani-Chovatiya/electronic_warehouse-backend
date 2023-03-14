package com.example.demo.order;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.product.Product;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class GenericabstractService<T> implements ServiceCrud<T> {

	private Integer noofRow;
	private String msg;
	private Response res;
	 private long  oid;
	    
		private long userid;
		
		private String email;
		
		OrderItems orderitems;
		
	    private long  orderitemsid;
		
		Order order; 
		
		private String name;
		
	    private int  qty;
		
	    private String image;
		
	    private float price;
		
	    private long product;
		
	    private int cis;
	    
	    
	     DaoCrud<T> c;
	     {
	    	 noofRow=0;
	 		msg="";
	 		res=new Response();
	     }
	     
	     public GenericabstractService(DaoCrud<T> c) {
	    	 this.c=c;
	     }
	     
	     
	    
	     public GenericabstractService() {
			
			// TODO Auto-generated constructor stub
		}



//		public Response insert(Order o) {
//	    		noofRow=c.insert(o);
//	    		msg="order successfully created";
//	    		
//	    		//Order o=new Order();
//	    		oid=o.getOid();
//	    		userid = o.getUserid();
//	    		email = o.getEmail();
//	    		res.setOid(oid);
//	    		res.setUserid(userid);
//	    		res.setEmail(email);
//	    		res.setStatus(noofRow>0);
//	    		res.setMsg(msg);
//	    		res.setData(noofRow);
//	    		return res;
//	     }
//	     
//	    
//	     public Response insert2(OrderItems o) {
//	    	 
//	    	 orderitemsid=o.getOrderitemsid();
//	    	 name=o.getName();
//	    	 image=o.getImage();
//	    	 price=o.getPrice();
//	    	 cis=o.getCis();
//	    	 qty=o.getQty();
//	    	 product=o.getProduct();
//	    	 noofRow=c.insert2(o);
//	    	 msg="orderitems";
//	    	 
//	    	 res.setOrderitemsid(orderitemsid);
//	    	 res.setName(name);
//	    	 res.setImage(image);
//	    	 res.setCis(cis);
//	    	 res.setQty(qty);
//	    	 res.setProduct(product);
//	    	 res.setPrice(price);
//	    	 res.setStatus(noofRow>0);
//	    	 res.setData(noofRow);
//	    	 res.setMsg(msg);
//	    	 
//	    	 return res;
//	     }
//	     
	     @Autowired
	 	@Qualifier("jdbcTemplate")
	 	JdbcTemplate jdbcTemplate;
	     
	     public List<Order> selectjoin(int sellerid){

//SELECT O.oid,O.email,O.userid,O.totalprice,O.created_at  FROM `seller` S INNER JOIN `productdetails` P ON S.sellerid=P.sellerid     INNER JOIN `orderitems` T ON P.id=T.product  INNER JOIN `order` O   ON T.oid=O.oid WHERE S.sellerid=1
//	    	 SELECT O.oid,O.email,O.userid,O.totalprice,O.created_at  FROM `seller` S INNER JOIN `productdetails` P ON S.sellerid=P.sellerid INNER JOIN `orderitems` T ON P.id=T.product  INNER JOIN `order` O   ON T.oid=O.oid    
//	    	 SELECT O.oid,O.email,O.userid,O.totalprice,O.created_at  FROM `order` O INNER JOIN `orderitems` T ON T.oid=O.oid INNER JOIN `productdetails` P ON P.id=T.product INNER JOIN `seller` S ON S.sellerid=P.sellerid
//	    	 String sql="SELECT O.oid,O.email,O.userid,O.totalprice,O,createdAt FROM  `order` O INNER JOIN `orderitems` T  ON O.oid=T.oid  INNER JOIN  `productdetails` P ON T.product=P.id INNER JOIN `seller` S ON P.sellerid=S.sellerid";
	    	 String sql="SELECT O.oid,O.email,O.userid,O.totalprice,O.created_at,O.is_deliverd  FROM `seller` S INNER JOIN `productdetails` P ON S.sellerid=P.sellerid     INNER JOIN `orderitems` T ON P.id=T.product  INNER JOIN `order` O   ON T.oid=O.oid WHERE S.sellerid="+sellerid;
	    	 return jdbcTemplate.query(sql,new BeanPropertyRowMapper( Order.class));
	     }
}
