package com.xworkz.xworkzapp.movie;

import java.util.Date;

public class Movie {

	public String producer;
	public String dirctor;
	//public Date relaseDate;//if u provide date u must import
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	{
		this.dirctor=dirctor;// wen v use init block create obj n thn it vl excute r else print default value
		this.producer=producer;
		//System.out.println(this.dirctor);
		
	}
//	public Movie(String Producer,String dirctor,Date relaseDate)
//	{
//		this.Producer=Producer;
//		this.dirctor=dirctor;
//		this.relaseDate=relaseDate;
//		
	//}
	public void toEnjoy()
{
		System.out.println("enjoying with friends");
		}
}
