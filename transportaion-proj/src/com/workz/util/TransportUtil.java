package com.workz.util;

import com.workz.teju.Transportation;

public class TransportUtil {

	public static void main(String[] args) {
		
Transportation trans= new Transportation();
 trans.id="LN235syy";
		 trans.name="VRL Logistics"  ;
		 trans.noOfBranches=5;
		 trans.address[0]="Benglore";
		 trans.address[1]="Btm";       //Initialization
		 trans.address[2]="mejastic";
		 trans.address[3]="Hebbal";
		 trans.address[4]="rajajinagar";
		 trans.address[5]="Benglore";
          System.out.println(trans.id + "  "+ trans.name  +"  "+ trans.noOfBranches);
		 trans.importAndExport();
		 trans.transport();
		 for(int i=0;i<(trans.address).length;i++)
		 {
			 System.out.println(trans.address[i]);
		 }
		 for(String address:trans.address)
		 {
			 System.out.println(address);//this is another method for printing array type of strings
		 }
		 
	}
	

}
