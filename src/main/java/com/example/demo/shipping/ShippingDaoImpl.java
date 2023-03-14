package com.example.demo.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ShippingDaoImpl implements Cruddao<Shipping>{

	@Autowired
	@Qualifier("jdbcTemplate")
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Integer insert(Shipping s) {
		String sql="insert into shipping (id,mobileno,address,city,postalcode,country) values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {s.getId(),s.getMobileno(),s.getAddress(),s.getCity(),s.getPostalcode(),s.getCountry()});
	}
}
