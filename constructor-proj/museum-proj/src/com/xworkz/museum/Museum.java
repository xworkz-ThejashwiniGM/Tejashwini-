package com.xworkz.museum;

public class Museum {
//instance variables
	public int id;
	public String name;
	public String address;
	public int noOfFloors;
	public String department;

	public Museum() {
		System.out.println("museum const with no created");
	}

	public Museum(int id, String name, String adress, int noOfFloors, String department) {
		System.out.println("museum const with arg created");
		this.id = id;
		this.name = name;
		this.address = address;
		this.noOfFloors = noOfFloors;
		this.department = department;

	}

}
