package com.xworkz.util;

import com.xworkz.mall.Mall;

public class MallUtil {
	public static void main(String[] args) {
		Mall mall=new Mall();
		mall.setName("orion");
		mall.setAddress("Rajajinagar");
		mall.setNoOfShopes(2);
		System.out.println(mall.getName() + " " +mall.getAddress() + "  "+ mall.getNoOfShopes());
	}

}
