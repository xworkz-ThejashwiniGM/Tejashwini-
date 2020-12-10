package com.xworkz.util;

import com.xworkz.country.India;
import com.xworkz.country.SriLanka;

public class CountryUtil {
public static void main(String[] args) {
	India india=new India(30,760,"Delhi");
	System.out.println(india.noOfStates + " " +india.noOfLanguages + " "+india.capital);
	SriLanka srilanka=new SriLanka(60,80,"coloumbia");
	System.out.println(srilanka.noOfStates + " " +srilanka.noOfLanguages + " "+srilanka.capital);
}
}
