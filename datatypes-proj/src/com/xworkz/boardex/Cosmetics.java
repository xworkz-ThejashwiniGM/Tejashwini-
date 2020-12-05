package com.xworkz.boardex;

public class Cosmetics {

	static  double price;
	 String name;
	 String color;
	 String brand;
	 int cosmeticid;
	 void makeOver()
	{
	System.out.println("party makeOver");
	}
	public static void main(String a[])
	{
		Cosmetics.price=6768.99;
		System.out.println(	Cosmetics.price);//if u mention class name always put static in class member

		Cosmetics cos=new Cosmetics();
		 cos.price=150.00;
		 cos.name="Garnier white";
		cos.color="White";
		cos.brand="Godreg";
		cos.cosmeticid=123;
		cos.makeOver();
		System.out.println(cos.price);
		System.out.println(cos.name);
		System.out.println(cos.color);
		System.out.println(cos.brand);
		System.out.println(cos.cosmeticid);
	}
	}




