package com.xworkz.datatwo;

public class AddingNumbers {
	public static void main(String a[])
	{
	int output=add();
	System.out.println(output);
	double ans=add(567,123);
	double an=add(567,123,98);
	System.out.println(ans);
	System.out.println(an);
	}
	static int add()
	{
	int a=567;
	int b=123;
	int c=a+b;
	return c;
	}
	static double add(double numOne,double numTwo)
	{
	double s= numOne+numTwo;
	return s;
	}
	static double add(double numOne,double numTwo,double numThree)
	{
	double d=numOne+numTwo+numThree;
	return d;
	}
	}


