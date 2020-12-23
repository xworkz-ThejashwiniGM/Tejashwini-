package com.xworkz.xworkzapp.watch;

import java.util.Date;

public class Watch {
	public String design;
	public double price;
	
	public Watch()
	{
		System.out.println("watch object is created");//for overriding
	}
	
	public void displayTime()
	{
		Date date=new Date();
		System.out.println(date);
	}

}
