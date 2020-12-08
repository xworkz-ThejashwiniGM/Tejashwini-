package com.xworkz.util;

import com.xworkz.church.Church;

public class ChurchUtil {
	public static void main(String[] args) {
		Church church=new  Church("kerala","st mary's church",45);//constructor intialisation
		//church.setName("st.JOseph's church");
		//church.setAddress("Goa");
		//church.setnoOfFathersAndSisters(1);
		System.out.println(church.getName() + "  "+ church.getAddress() + " "+ church.getNoOfFathersAndSisters());
		
		
	}

}
