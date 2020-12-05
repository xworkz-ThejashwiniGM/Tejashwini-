package com.xworkz.pg;

import com.xworkz.PayingGuest;

public class payingGuestUtil {

	public static void main(String[] args) {
		PayingGuest pg=new PayingGuest();
		pg.name="Ok";
		pg.address="Khb colony";
		pg.toStay();
		pg.toStay("hello");
		System.out.println(pg.name);
		System.out.println(pg.address);
		}
		}

	


