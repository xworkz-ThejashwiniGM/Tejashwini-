package com.xworkz.xworkzapp.util;

import com.xworkz.xworkzapp.speaker.Speaker;

public class SpeakerUtil {
public static void main(String[] args) {
	
	Speaker speaker=new Speaker(2000.00,9);
	System.out.println(speaker.isConnected());
	speaker.onOrOff();
	speaker.increaseVolume();
	speaker.increaseVolume();
	speaker.onOrOff();
	speaker.decreaseVolome();
}
}