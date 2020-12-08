package com.xworkz.Util;

import com.xworkz.clothes.Clothes;

public class ClothesUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes cloth = new Clothes();
		cloth.setName("Anarkali");
		cloth.setColor("white");
		cloth.setNoOfCloth(5);
		cloth.setAdress("RR nagar");
		System.out.println(cloth.getName()+" "+ cloth.getColor()+" "+cloth.getNoOfCloth()+" "+cloth.getAdress()+" ");
		
	}

}
