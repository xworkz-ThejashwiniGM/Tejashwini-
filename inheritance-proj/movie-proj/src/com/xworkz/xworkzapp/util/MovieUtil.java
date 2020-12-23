package com.xworkz.xworkzapp.util;

import java.util.Date;

import com.xworkz.xworkzapp.movie.Kgf;
import com.xworkz.xworkzapp.movie.Movie;

public class MovieUtil {
	public static void main(String[] args) {
		
		Kgf kgf=new Kgf();
		kgf.dirctor="hfg";
		kgf.producer="fhg";
		System.out.println(kgf.dirctor+" "+kgf.producer);
		Movie m=new Movie();
		m.dirctor="hfhf";
		m.producer="gjgjhf";
		System.out.println(m.dirctor);
		
		
////		System.out.println(kgf.dirctor+" "+kgf.Producer+ " "+kgf.relaseDate);
////		kgf.enjoy("name");
//		Movie m=new Movie("teju","pranshanth nil",new Date());
//		System.out.println(m.dirctor+" "+m.Producer+ " "+m.relaseDate);
//		
		
	}

}
