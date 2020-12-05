package com.xworkz.library;

public class Library {
	public String name;
	public int[] sectionByAuthors;
	public String type;

	public Library(String name, int[] sectionByAuthors, String type)

	{
		this.name = name;
		sectionByAuthors = sectionByAuthors;
		this.type = type;
		this.methoddd();
	}

	public void methoddd() {
		System.out.println("methodddd");
	}
}
