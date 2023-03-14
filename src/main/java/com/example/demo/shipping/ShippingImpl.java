package com.example.demo.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingImpl extends GenericAbstractService<Shipping> {

	@Autowired
	protected ShippingImpl(ShippingDaoImpl sDao) {
		super(sDao);
	}
}
