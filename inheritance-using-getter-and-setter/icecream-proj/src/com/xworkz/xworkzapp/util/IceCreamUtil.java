package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.icecream.ButterScotch;
import com.xworkz.xworkzapp.icecream.Chocolate;

public class IceCreamUtil {
	public static void main(String[] args) {
		ButterScotch butterscotch=new ButterScotch();{
			butterscotch.setCost(45.00);
			//butterscotch.setFlavour(args);
			butterscotch.setType("cone");
			System.out.println(butterscotch.getCost()+ " "+ butterscotch.getType());
				//for(String string:args)
					//System.out.println(string);
			
			Chocolate chocolate=new Chocolate();
			chocolate.setCost(50.00);
			chocolate.setType("cup");
			System.out.println(chocolate.getCost()+ " "+chocolate.getType());
			

		}

		}

}
