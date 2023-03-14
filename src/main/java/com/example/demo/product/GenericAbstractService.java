package com.example.demo.product;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.seller.Seller;





public abstract class GenericAbstractService<T> implements  Crudservice<T> {

	private Integer noofRow;
	private String msg;
//	private List<Response> res1;
	private Response res;
	private long  id;
	
	private List<Product> select;

	private String name;

	private String image;
	
	private String description;
	
	private String rating;
	
	private float price;
	
	private int cis;
	
	private String reveiws;
	
	private Date createdAt;// = new Date(System.currentTimeMillis());
	
	private String gst;

	private String discount;

	private String catagory;

	Cruddao<T> c;
	{
		noofRow=0;
		msg="";
		//res1 = (List<Response>) new Response();
		res=new Response();
	}
	
	public GenericAbstractService() {
		// TODO Auto-generated constructor stub
	}
	protected GenericAbstractService(Cruddao<T> c) {
		this.c=c;
	}
	
	@SuppressWarnings("unchecked")
	public Response insert(Product p) {
		noofRow= c.insert(p);
		msg="Inserted Successfully";
		
//		id=p.getId();
//		name=p.getName();
//		image=p.getImage();
//		description=p.getDescription();
//		rating=p.getRating();
//		price=p.getPrice();
//		cis=p.getCis();
//		reveiws=p.getReveiws();
//		createdAt=p.getCreatedAt();
//		gst=p.getGst();
//		discount=p.getDiscount();
//        catagory=p.getDiscount();
//         
//		
//		
//		
//        res.setId(id);
//        res.setName(name);
//        res.setImage(image);
//        res.setDescription(description);
//        res.setRating(rating);
//        res.setPrice(price);
//        res.setCis(cis);
//        res.setReveiws(reveiws);
//        res.setCreatedAt(createdAt);
//        res.setGst(gst);
//        res.setDiscount(discount);
//        res.setCatagory(catagory);
		res.setStatus(noofRow>0);
		res.setMsg(msg);
	 res.setData(noofRow);
		
		return  res;
//		p.getId();
//		p.getName();
//		p.getImage();
//		p.getDescription();
//		p.getRating();
//		p.getPrice();
//		p.getCis();
//		p.getReveiws();
//		p.getCreatedAt();
//		p.getGst();
//		p.getDiscount();
//        p.getDiscount();
//        
//        return  p;
	}
	
	
	public Response insert2(Product2 p,String name) {
		noofRow= c.insert2(p,name);
		msg="Inserted Successfully";
		
//		id=p.getId();
//		name=p.getName();
//		image=p.getImage();
//		description=p.getDescription();
//		rating=p.getRating();
//		price=p.getPrice();
//		cis=p.getCis();
//		reveiws=p.getReveiws();
//		createdAt=p.getCreatedAt();
//		gst=p.getGst();
//		discount=p.getDiscount();
//        catagory=p.getDiscount();
//         
//		
//		
//		
//        res.setId(id);
//        res.setName(name);
//        res.setImage(image);
//        res.setDescription(description);
//        res.setRating(rating);
//        res.setPrice(price);
//        res.setCis(cis);
//        res.setReveiws(reveiws);
//        res.setCreatedAt(createdAt);
//        res.setGst(gst);
//        res.setDiscount(discount);
//        res.setCatagory(catagory);
		res.setStatus(noofRow>0);
		res.setMsg(msg);
	 res.setData(noofRow);
		
		return  res;
//		p.getId();
//		p.getName();
//		p.getImage();
//		p.getDescription();
//		p.getRating();
//		p.getPrice();
//		p.getCis();
//		p.getReveiws();
//		p.getCreatedAt();
//		p.getGst();
//		p.getDiscount();
//        p.getDiscount();
//        
//        return  p;
	}
	
	
	public List<Product2> select2(int sellerid) {


		String sql = "select id,name,image,description,rating,price,cis,created_at,gst,discount,catagory from productdetails2 where sellerid = '"+sellerid+"'";
//		String sql = "select * from product";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(Product2.class));
	}
	
	public Response insertr(Reveiws2 r) {
	
		noofRow= c.insertr(r);
		msg="Inserted Successfully";
		
		res.setMsg(msg);
		res.setStatus(noofRow>0);
		res.setData(noofRow);
		return res;
	}
	
	public List<Reveiws2> selectr(int id){
		String sql="select reveiwsid,comment,rating,uname,userid from reveiws2 where id= "+id;
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(Reveiws2.class));
	}
	
	public List<Try> tryit1(int id){
		String sql="SELECT T.image,T.tid FROM `try` T INNER JOIN `productdetails` P ON T.id=P.id where P.id="+id;
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Try.class));
	}
	
	public List<Try> tryit(int tid){
		String sql="SELECT T.image,T.tid FROM `try` T INNER JOIN `productdetails` P ON T.id=P.id WHERE T.tid="+tid;
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Try.class));
	}
	
	
	
	public Response updated(int id,Product p) {
		noofRow= c.updated(id,p);
		msg="Updated Successfully";
		
		res.setStatus(noofRow>0);
		res.setMsg(msg);
		res.setData(noofRow);
		
		return res;
	}
	
	public Response insert(Reveiws r,int id) {
		noofRow=c.insert(r,id);
		msg="Review inserted successfully";
		
		res.setStatus(noofRow>0);
		res.setData(noofRow);
		res.setMsg(msg);
		
		return res;
	}
	
	public Response delete(int id) {
		noofRow= c.delete(id);
		msg="Deleted Successfully";
		
		res.setStatus(noofRow>0);
		res.setMsg(msg);
		res.setData(noofRow);
		
		return res;
	}
	
	
	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate;
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<ProductSeller> select() {


//		String sql = "select id,name,image,description,rating,price,cis,reveiws,created_at,gst,discount,catagory from productdetails ";
		String sql="select A.id,A.name,A.image,A.description,A.rating,A.price,A.cis,A.created_at,A.gst,A.discount,A.catagory,B.sellerid,B.sname from  `seller` B inner join `productdetails` A  on B.sellerid=A.sellerid";
//		String sql = "select * from product";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(ProductSeller.class));
	}
	
	public List<Seller> select3() {


//		String sql = "select id,name,image,description,rating,price,cis,reveiws,created_at,gst,discount,catagory from productdetails ";
//		String sql="select A.id,A.name,A.image,A.description,A.rating,A.price,A.cis,A.created_at,A.gst,A.discount,A.catagory,B.sellerid,B.sname from  `seller` B inner join `productdetails` A  on B.sellerid=A.sellerid";
//		String sql = "select * from product";
		String sql="select A.id,A.name,A.image,A.description,A.rating,A.price,A.cis,A.created_at,A.gst,A.discount,A.catagory,B.sellerid,B.sname from  `seller` B inner join productdetails A  on B.sellerid=A.sellerid";

		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(Seller.class));
	}
	
	public List<Product> select(int sellerid) {

//		SELECT * FROM  productdetails A JOIN seller B ON A.sellerid=B.sellerid WHERE B.sellerid=1;
		System.out.println(sellerid);
		String sql = "select id,name,image,description,rating,price,cis,created_at,gst,discount,catagory from `productdetails` A inner join `seller` B on B.sellerid=A.sellerid where A.sellerid= "+sellerid;
//		String sql = "select * from product";
		
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(Product.class));
	}
	
	
//	select A.id,A.name,A.image,A.description,A.rating,A.price,A.cis,A.reveiws,A.created_at,A.gst,A.discount,A.catagory,B.sname from `productdetails` A inner join `seller` B on B.sellerid=A.sellerid;
	public List<Product> selectById(int id) {


		String sql = "select id,name,image,description,rating,price,cis,created_at,gst,discount,catagory from productdetails where id =  "+id;
//		String sql = "select * from product";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(Product.class));
	}
	
	
	
	public List<Product> selectByCatagory(String cat) {
		
//		String sql = "select id,name,image,description,rating,price,cis,reveiws,created_at,gst,discount,catagory from productdetails where catagory =  '"+cat+"'";
		String sql="select A.id,A.name,A.image,A.description,A.rating,A.price,A.cis,A.created_at,A.gst,A.discount,A.catagory,B.sellerid,B.sname from `seller` B inner join `productdetails` A on B.sellerid=A.sellerid where A.catagory='"+cat+"'";
//		String sql = "select * from product";
		return jdbcTemplate.query(sql,new BeanPropertyRowMapper(Product.class));
	}
}
