package com.xworkz.med;

import com.xworkz.MedicalShopes;

public class MedicalShopesUtil {

	public static void main(String[] args) {
	
		
		
		MedicalShopes medical=new MedicalShopes();
		medical.name="Tm";
		medical.address="RajajiNagar";
		medical.noOfShopes=68;
		medical.toGiveMedicine();
		medical.toGiveMedicine("hello");
		System.out.println(medical.name);
		System.out.println(medical.address);
		System.out.println(medical.noOfShopes);
		}
		}



	


