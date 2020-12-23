package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.river.Ganga;
import com.xworkz.xworkzapp.river.Kaveri;
import com.xworkz.xworkzapp.river.Yamuna;

public class RiverUtil {
	public static void main(String[] args) {
		
		Ganga ganga=new Ganga();
		ganga.setBirthPlace("Gangotri");
		ganga.setRiverType("Long");
		ganga.setEndPlace("Bay of Bangal");
		System.out.println(ganga.getBirthPlace()+ " "+ ganga.getRiverType() +" "+ ganga.getEndPlace());
		
		
		Kaveri kavri=new Kaveri();
		kavri.setBirthPlace("Tala Kavri");
		kavri.setRiverType("Medium");
		kavri.setEndPlace("Bay of Bangal");
		System.out.println(kavri.getBirthPlace()+ " " +kavri.getRiverType()+ " " + kavri.getEndPlace());
		
		Yamuna yamuna=new Yamuna();
		yamuna.setBirthPlace("Himalaya");
		yamuna.setRiverType("Medium");
		yamuna.setEndPlace("Harapanahalli");
		System.out.println(yamuna.getBirthPlace()+ " "+ yamuna.getRiverType()+ " "+yamuna.getEndPlace());
		

	}

}
