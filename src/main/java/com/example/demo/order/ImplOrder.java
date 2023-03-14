package com.example.demo.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplOrder extends GenericabstractService<Order> {

	@Autowired
	protected ImplOrder(DaoOrderImpl oDao) {
		super(oDao);
	}
}
