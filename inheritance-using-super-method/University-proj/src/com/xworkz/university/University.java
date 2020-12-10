package com.xworkz.university;

public class University {
	private String address;
	private int  noOfBranches;
	private int noOfFaculties;
	public University(String address,int noOfBranches,int noOfFaculties) {
		this.address=address;
		this.noOfBranches=noOfBranches;
		this.noOfFaculties=noOfFaculties;
		//System.out.println(this.address + " "+ this.noOfBranches+ " "+this.noOfFaculties);
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfBranches() {
		return noOfBranches;
	}
	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	public int getNoOfFaculties() {
		return noOfFaculties;
	}
	public void setNoOfFaculties(int noOfFaculties) {
		this.noOfFaculties = noOfFaculties;
	}
	

}
