package com.xworkz.util;

import com.xworkz.xworkzapp.park.Park;

public class ParkUtil {
	
	public static void main(String[] args) {
		
		Park p=new Park("RajkumarPark","RoayalCircle",12);
		//System.out.println(name+" "+area+" "+totalparks);
		System.out.println(p.name+" "+p.area+" "+p.totalparks);
		//System.out.println(this.name+" "+this.area+" "+this.totalparks);
	   Park p1=new Park();// this is used to print for zero parametrized in wch this() is used
		System.out.println(p1);
		
		 Park p2=new Park("hgh");// to print this method of one parameterised const
		 System.out.println(p2);
		
	}

}
