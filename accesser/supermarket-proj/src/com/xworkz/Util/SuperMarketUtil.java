package com.xworkz.Util;

import com.xworkz.supermarket.SuperMarket;

public class SuperMarketUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMarket smark= new SuperMarket();
		smark.setName("More");
		smark.setAddress("RR nagar");
		smark.setNoOfShopes(25);
		smark.setFounder("Om");
		System.out.println(smark.getName()+" "+ smark.getFounder()+" "+smark.getAddress()+" "+smark.getNoOfShopes()+" ");
		
	}

}
