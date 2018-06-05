package com.jfb.kafka.domain;

import java.util.List;

public class Seller {
	
	private String id;
	private String name;
	private List<Vegetables> veg;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Vegetables> getVeg() {
		return veg;
	}
	public void setVeg(List<Vegetables> veg) {
		this.veg = veg;
	}
	

}
