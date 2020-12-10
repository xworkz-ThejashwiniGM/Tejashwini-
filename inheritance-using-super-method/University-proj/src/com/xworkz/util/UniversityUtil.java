package com.xworkz.util;

import com.xworkz.university.KuvempuUniversity;

public class UniversityUtil {
	public static void main(String[] args) {
		KuvempuUniversity kevempu=new KuvempuUniversity("Bellary",30,40);
		System.out.println(kevempu.getAddress() + " "+ kevempu.getNoOfBranches() + " "+ kevempu.getNoOfFaculties());
	}

}
