package com.example.demo.order;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

	public Order findByOid(int oid);
	
	
	
	public List<Order> findAll();
	
	public List<Order> findByUserid(int userid);
	
//	@Query("SELECT new com.example.demo.order.Order(O.oid,O.email) "+"FROM `order` O INNER JOIN  O.oid ") //T ON O.oid=T.oid  INNER JOIN  `productdetails` P ON T.product=P.id INNER JOIN `seller` S ON P.sellerid=S.sellerid")
//	@Query("SELECT new com.example.demo.order.Order(O.oid,O.email)"+"FROM order O INNER JOIN O.orderitems P")
//	public List<Order> getInnerJoin();
	
//	@Autowired
//	public Order updateOrder(Order order);
	
}
//public class OrderDaoImpl implements Cruddao<Order>{
//
//	@Autowired
//	@Qualifier("jdbcTemplate")
//	JdbcTemplate jdbcTemplate;
//	
//	@Override
//	public Integer insert(Order o) {
//		//Order o = new Order();
//		String sql="insert into `order` (oid,email,userid) values(?,?,?)";
//		System.out.println(o.getUserid());
//		return jdbcTemplate.update(sql,new Object[] {o.getOid(),o.getEmail(),o.getUserid()});
//	}
//
//	
//	
//	
//	public Integer insert2(OrderItems o) {
//		Order o1=new Order();
//		
//		String sql=" insert into `orderitems` (orderitems_id,cis,image,name,price,productid,qty) values(?,?,?,?,?,?,?)";
//		
//		//o.setOrderitems();
//		return jdbcTemplate.update(sql,new Object[] {o.getOrderitemsid(),o.getCis(),o.getImage(),o.getName(),o.getPrice(),o.getProductid(),o.getQty()});
//	}
//}
