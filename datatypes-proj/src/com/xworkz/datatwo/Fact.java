package com.xworkz.datatwo;

public class Fact {

	public static void main(String a[])
	{
	myFact(89);
	}
	static void myFact(int num)
	{
	double fact=1;
	for(int i=1; i<=num ;i++)
	{
	fact=fact*i;
	}
	System.out.println(fact);
	}
	}


