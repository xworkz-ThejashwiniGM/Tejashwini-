package com.xworkz.supermarket;

public class SuperMarket {
	private String name;
	private String address;
	private int noOfShopes;
	private String founder;
	public SuperMarket()
	{
		System.out.println("constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfShopes() {
		return noOfShopes;
	}
	public void setNoOfShopes(int noOfShopes) {
		this.noOfShopes = noOfShopes;
	}
	public String getFounder() {
		return founder;
	}
	public void setFounder(String founder) {
		this.founder = founder;
	}
	
}