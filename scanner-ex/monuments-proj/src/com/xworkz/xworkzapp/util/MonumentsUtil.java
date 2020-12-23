package com.xworkz.xworkzapp.util;

import java.util.Scanner;

import com.xworkz.xworkzapp.monuments.Monuments;

public class MonumentsUtil {
	public static void main(String[] args) {
		Monuments.toVisit("agra");
		//System.out.println(Monuments.toVisit);
		Monuments m=new Monuments();
		
		//m.toVisit("hii");
		//System.out.println(m.toVisit);
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.next();
		
		System.out.println("enter the place");
           String place=sc.next();
           
		System.out.println("enter the no");
		int noOfPlaces=sc.nextInt();
		
		System.out.println("enter the id");
		long id=sc.nextLong();
		
		System.out.println("enter the id1");
		float id1=sc.nextFloat();
		
		System.out.println("enter the sections");
        // char sections=sc.nextChar();

		
		System.out.println(name+" "+place+" "+noOfPlaces+" "+id+" "+id1);
		sc.close();
		
		
		
	}

}
