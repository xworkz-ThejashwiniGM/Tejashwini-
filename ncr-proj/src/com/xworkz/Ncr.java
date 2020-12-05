package com.xworkz;

public class Ncr {
	
	public static void main(String[] args) {
		
		int f=myFact(3);
		int g=myFact(2);
		int r= myFact(1);
		int finalOutput=f/(g*r);
		System.out.println(finalOutput);
		
	}
	
static int myFact(int num)
{
	int fact=1;
	for(int i=1; i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.println(fact);
	return fact;
}

}
