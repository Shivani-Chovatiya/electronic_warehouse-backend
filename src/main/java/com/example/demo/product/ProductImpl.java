package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductImpl extends GenericAbstractService<Product>{

	@Autowired
	protected ProductImpl(ProductDaoImpl pDao) {
		super(pDao);
	}
}
