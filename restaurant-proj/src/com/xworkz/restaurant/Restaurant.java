package com.xworkz.restaurant;

public class Restaurant {
	int id;
//instance block or non-static block or IIB(instance initialisation block)
    	 {
		id=2345;
		System.out.println(id);
		
	
		{
			int i=10;
			System.out.println(i);
			
		}
	}
//staic block or class block or SIB(static initialisation block)
	
	public	 void  toSurveFood()
		{
			 System.out.println("hello");
		}
	
	
}
