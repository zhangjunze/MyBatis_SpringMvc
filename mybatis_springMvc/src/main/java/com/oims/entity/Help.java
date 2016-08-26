package com.oims.entity;

import java.util.List;

public class Help<T> {
	private List<T> list;
	private int total;
	public List<T> getList() {
		return list;
	}
	public void setList(List<T> list) {
		this.list = list;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
