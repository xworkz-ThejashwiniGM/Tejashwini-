package com.xworkz.boardex;

public class Board {
	
	public static void main(String a[])
	{
	int i=toWrite(100);
	System.out.println(i);
	String name=toWrite("marker");
	System.out.println(name);
	short sh=34;
	short shortValue=toWrite(sh);
	System.out.println(shortValue);
	long ln=toWrite(123457899l);
	System.out.println(ln);
	char cr = toWrite('q');
	System.out.println(cr);
	}
	static int toWrite(int nume)
	{
		 nume=10;

		return nume;
		
	}
	static String  toWrite(String name)
	{
		return name; 
	}
	//cast int to short
	static short toWrite(short sh)
	{
	return sh;
	}
	static long toWrite(long ln)
	{
	return ln;
	}
	static char toWrite(char ch)
	{
	return ch;
	}
	}






