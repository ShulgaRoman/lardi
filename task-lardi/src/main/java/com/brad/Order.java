package com.brad;

public class Order {

	private String where;
	private String from;
	private String type;
	
	public Order(){
	}
	
	public Order(String where, String from, String type) {
		super();
		this.where = where;
		this.from = from;
		this.type = type;
	}
	
	public String getWhere() {
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
