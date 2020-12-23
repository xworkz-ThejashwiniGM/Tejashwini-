package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.watch.Rolex;
import com.xworkz.xworkzapp.watch.Watch;

public class WatchUtil {
	public static void main(String[] args) {
		Watch watch=new Rolex();//this is upcasting refrence variable from parent class,object is created from child class
		// Rolex rolex=new Watch();//this called down casting is not possible directly in java,bt we can achieve downcaasting by creating 
		//first upcasting and again create a downcasting
		//Watch watch=new Rolex();first upcasting
		//Rolex rolex=(Rolex) watch();//achieve downcasting 
		watch.design="square";
		watch.price=1234.00;
		watch.displayTime();
		System.out.println(watch.design+" "+watch.price);
	}

}
