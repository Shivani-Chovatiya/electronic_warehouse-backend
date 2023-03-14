package com.example.demo.order;

import java.util.List;

public interface DaoCrud<T> {

	public List<Order>  selectjoin(int sellerid);
}
