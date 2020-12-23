package com.xworkz.xworkzapp.earphone;

public class EarPhone {
	private double price;
	private String colour;
	private int batteryBackupForHours;
 

    private int maxVol = 6;
    private int minVol = 0;
    private boolean connected;
     private int currentVol;


public EarPhone(double price, int batteryBackupForHours) {
	System.out.println("Speaker object is created");
	System.out.println("arg 1 is  :" + this.price);
	System.out.println("arg 2is :" + this.batteryBackupForHours);
	this.price =price ;
	this.batteryBackupForHours = batteryBackupForHours;
	System.out.println("arg 1 is  :" + this.price);
	System.out.println("arg 2is :" + this.batteryBackupForHours);

}

public void onOrOff() {
	System.out.println("inside onOrOff");
	if (isConnected() == false) {
		this.connected = true;
	} else if (isConnected() == true) {
		this.connected = false;
	}
}

public void increaseVolume() {
	System.out.println("inside increase volume");
	if (connected == true) {
		if (this.currentVol < this.maxVol) {
			this.currentVol = this.currentVol + 1;
			System.out.println("current Vol is :" + this.currentVol);
		} else {
			System.out.println("max vol is reached");
		}
	} else {
		System.out.println("max vol is reached");

	}
}

public void decreaseVolome() {
	System.out.println("inside the decrease volume");
	if(connected==false)
	{
		if(this.currentVol>this.minVol)
		{
			this.currentVol=this.currentVol-1;
			System.out.println("current vol is:"+this.currentVol);
		}
		else System.out.println("min vol is low");
	}
	else {
		System.out.println("speaker is not connected");
		}
	}


public boolean isConnected() {
	return connected;
}

public void setConnected(boolean connected) {
	this.connected = connected;
}

public double getPrice() {
	return price;

}

public void setPrice(double price) {
	this.price = price;
}

public int getBatteryBackupForHours() {
	return batteryBackupForHours;
}

public void setBatteryBackupForHours(int batteryBackupForHours) {
	this.batteryBackupForHours = batteryBackupForHours;
}
}

