package com.xworkz.util;

import com.xworkz.library.Library;

public class LibraryUtil {
	public static void main(String[] args) {

		int[] sectionByAuthors = {1,2,3,4};
		Library library = new Library("Gnanagangtri", sectionByAuthors, "private");
	
		for (int authotr : sectionByAuthors) {
			System.out.println(authotr);

		}
		
		System.out.println(library.name + " " + library.type);

	}

}
