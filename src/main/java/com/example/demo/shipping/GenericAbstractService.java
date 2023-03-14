package com.example.demo.shipping;

public abstract class GenericAbstractService<T> implements Crudservice<T> {

	private Integer noofRow;
	private String msg;
    private long  id;
    private String mobileno;
    private String address;
    private String city;
	private String postalcode;
	private String country;
	private Response res;
	
	Cruddao<T> c;
	{
		noofRow=0;
		msg="";
		res=new Response();
	}
	public GenericAbstractService() {
		
		// TODO Auto-generated constructor stub
	}
	
	protected GenericAbstractService(Cruddao<T> c) {
		this.c=c;
	}
	
	
	public Response insert(Shipping s) {
		id=s.getId();
	    mobileno=s.getMobileno();
	    address=s.getAddress();
	    city=s.getCity();
	    postalcode=s.getPostalcode();
		country=s.getCountry();
		noofRow=c.insert(s);
		msg="address is confirmed";
		
		
		res.setId(id);
		res.setMobileno(mobileno);
		res.setAddress(address);
		res.setCity(city);
		res.setPostalcode(postalcode);
		res.setCountry(country);
		res.setStatus(noofRow>0);
		res.setMsg(msg);
		res.setData(noofRow);
		
		return res;
	}
}
