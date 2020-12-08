package com.xworkz.cartoon;

public class Cartoon {

	public	long id;
	public	String name;
	public	String language;
	public Cartoon()//no parameter
	{
		this("sdfg");
	//System.out.println(this.name);
		// this(1234l,"kannada");//this() is called constructor chaining,used to communicate with one constructor to other constructor
		//System.out.println(this.id + " "+ this.language);
     }
	public Cartoon(String name)//one parameterised
	{	
		this(1234l,"hindi");
		System.out.println(this.id+" "+this.language);

		this.name=name;//naming conflict between local variable and instance variable
		
	}
	public Cartoon(long id,String language)//two parameterised
	{
		this.id=id;
		this.language=language;
	}
	public Cartoon(long id,String name,String language)
	{
		this.id=id;
		this.name=name;
		this.language=language;
	}
	public String toEntertain(String name)//we can use void also
	{
		this.name=name;
		System.out.println(this.name);
		return name;
	}
	
	
}