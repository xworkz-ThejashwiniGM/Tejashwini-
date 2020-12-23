package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.earphone.EarPhone;

public class EarPhoneUtil {
	public static void main(String[] args) {
		
		EarPhone earphone=new EarPhone(2000.00,9);
		System.out.println(earphone.isConnected());
	}
}
