package com.example.demo.product;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.seller.Seller;



@Repository
public class ProductDaoImpl implements Cruddao<Product>{

	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	ProductRepository pRepo;
	
	@Override
	public Integer insert(Product p) {
//		Seller s=new Seller();
//		Product p1=s.getProductdetails();
//		System.out.println(p);
		String sql = "insert into productdetails (id,name,image,description,rating,price,cis,gst,discount,catagory) values(?,?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {p.getId(),p.getName(),p.getImage(),p.getDescription(),p.getRating(),p.getPrice(),p.getCis(),p.getGst(),p.getDiscount(),p.getCatagory()});
	}
	
	@Override
	public Integer insert2(Product2 p,String name) {
		
//		String sql1="select name from productdetails2";
//		List<Product2> data=jdbcTemplate.query(sql1,new BeanPropertyRowMapper(Product2.class) );
//		System.out.println(data);
//		System.out.println(name);
//		System.out.println(data.equals(name));
//		while(data != null) {
//			if(data.equals(name)==true) {
//				return null;
//			}
//			
//			else {
				String sql = "insert into productdetails2 (id,name,image,description,rating,price,cis,reveiws,gst,discount,catagory,sellerid) values(?,?,?,?,?,?,?,?,?,?,?,?)";
				return jdbcTemplate.update(sql,new Object[] {p.getId(),p.getName(),p.getImage(),p.getDescription(),p.getRating(),p.getPrice(),p.getCis(),p.getReveiws(),p.getGst(),p.getDiscount(),p.getCatagory(),p.getSellerid()});
//			}
//		}
//		return null;
//		Seller s=new Seller();
//		Product p1=s.getProductdetails();
//		Product2 p1=pRepo.findByName(name);
//		
//		System.out.println("name"+(p1.getName().equals(name)));
//		if((p1.getName().equals(name))==true) {
//			return null;
//		}
//		else {
//		String sql = "insert into productdetails2 (id,name,image,description,rating,price,cis,reveiws,gst,discount,catagory) values(?,?,?,?,?,?,?,?,?,?,?)";
//		int data = jdbcTemplate.update(sql,new Object[] {p.getId(),p.getName(),p.getImage(),p.getDescription(),p.getRating(),p.getPrice(),p.getCis(),p.getReveiws(),p.getGst(),p.getDiscount(),p.getCatagory()});
//		System.out.println(data);
//		return jdbcTemplate.update(sql,new Object[] {p.getId(),p.getName(),p.getImage(),p.getDescription(),p.getRating(),p.getPrice(),p.getCis(),p.getReveiws(),p.getGst(),p.getDiscount(),p.getCatagory()});
//		}
	}
	
	@Override
	public Integer insertr(Reveiws2 r) {
		
		String sql="insert into reveiws2 (reveiwsid,comment,rating,uname,userid,id) values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {r.getReveiwsid(),r.getComment(),r.getRating(),r.getUname(),r.getUserid(),r.getId()});
	}
	
	@Override
	public List<Reveiws2> selectr(int id) {
		return null;
	}
	
	
	@Override
	public List<Try> tryit(int tid){
		return null;
	}
	
	
	@Override
	public List<Try> tryit1(int id){
		return null;
	}
	
	@Override
	public Integer updated(int id,Product p) {
		String sql = "update  productdetails set  name = ?,image = ?,description = ?,rating = ?,price = ?,cis = ?,gst = ?,discount = ?,catagory = ? where id = ?";
		return jdbcTemplate.update(sql,new Object[] {p.getName(),p.getImage(),p.getDescription(),p.getRating(),p.getPrice(),p.getCis(),p.getGst(),p.getDiscount(),p.getCatagory(),id});
	}
	
	@Override
	public Integer insert(Reveiws r, int id) {
		String sql = "insert into reveiws (reveiwsid,comment,rating,uname,userid,id) values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {r.getReveiwsid(),r.getComment(),r.getRating(),r.getUname(),r.getUserid(),id});
	}
	
//	@Override
	public Integer delete(int id) {
		String sql = "delete from  productdetails where id = "+id;
		return jdbcTemplate.update(sql);
	}
	

	public List<ProductSeller> select() {

		return null;
	}
	
	public List<Seller> select3(){
		return null;
	}
	
	public List<Product> select(int sellerid) {

		return null;
	}
	
	public List<Product2> select2(int sellerid) {

		return null;
	}
	
	public List<Product> selectById(int id) {
		return null;
	}
	
	public List<Product> selectByCatagory(String cat) {
		return null;
	}
	
}
