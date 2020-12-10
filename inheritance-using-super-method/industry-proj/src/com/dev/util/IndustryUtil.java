package com.dev.util;

import com.dev.devapp.industry.SteelIndustry;

public class IndustryUtil {
	public static void main(String[] args) {
		SteelIndustry industry=new SteelIndustry("manufacturing",25,"whitefield");
		//industry.area="Ballpet";
	//	industry.noOfWorkers=43;
	//	industry.type="production";
	//	System.out.println(industry.area+ " "+industry.noOfWorkers + " " + industry.type);
		System.out.println(industry.type+" "+ industry.noOfWorkers+" "+industry.area+" ");
	}

}
