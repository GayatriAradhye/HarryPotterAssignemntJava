//Create a single for loop to print all the data in the format [Movie Number, Movie name, Year Of Release]

package com.ninja.training;
import java.util.Arrays;
public class HP_ForLoop {
public static void main(String[] args) {
	String[] movieName = {"Harry Potter and the Philosopher's Stone",
			"Harry Potter and the Chamber of Secrets",
			"Harry Potter and the Prisoner of Azkaban",
			"Harry Potter and the Goblet of Fire",
			"Harry Potter and the Order of the Phoenix",
			"Harry Potter and the Half-Blood Prince",
			"Harry Potter and the Deathly Hallows – Part 1",
			"Harry Potter and the Deathly Hallows – Part 2"};
	int[] movieNumber = {1,2,3,4,5,6,7,8};
	int[]movieYear = {2001,2002,2004,2005,2007,2009,2010,2011};
	int movieInd;
	
	for( movieInd=0; movieInd<movieName.length;movieInd++)
	{  
		System.out.println("Movie name is :"+movieName[movieInd]);
		System.out.println("Movie number is :"+movieNumber[movieInd]);
		System.out.println("Movie release year is :"+movieYear[movieInd]+ "\n");
		
	}

}}
