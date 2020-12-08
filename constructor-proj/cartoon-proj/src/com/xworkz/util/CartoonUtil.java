package com.xworkz.util;

import com.xworkz.cartoon.Cartoon;

public class CartoonUtil {
	public static void main(String[] args) {
		Cartoon c4=new Cartoon();
		System.out.println(c4.name);
		
	//	Cartoon c=new Cartoon("kannada");
		
	//	Cartoon c1=new Cartoon("tom and jerry");
	//	System.out.println(c1.name);
		
		Cartoon c2=new Cartoon(234l,"tom and jerry");
		System.out.println(c2.id+ " "+c2.name);
	
	//	Cartoon c3=new Cartoon(234l,"tom and jerry","hindi");
		//System.out.println(c3.id+ " " +c3.name +" "+c3.language);
		
		
		Cartoon c5=new Cartoon();
		c5.toEntertain("happy");
	}

}
