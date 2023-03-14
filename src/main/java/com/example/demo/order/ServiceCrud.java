package com.example.demo.order;

import java.util.List;

public interface ServiceCrud<T> {

	public List<Order>  selectjoin(int sellerid);
}
