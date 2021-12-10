
//storeAll data into respective arrays
package com.ninja.training;
import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {
		String[] movieName = {"Harry Potter and the Philosopher's Stone"
				+ "Harry Potter and the Chamber of Secrets\r\n"
				+ "Harry Potter and the Prisoner of Azkaban\r\n"
				+ "Harry Potter and the Goblet of Fire\r\n"
				+ "Harry Potter and the Order of the Phoenix\r\n"
				+ "Harry Potter and the Half-Blood Prince\r\n"
				+ "Harry Potter and the Deathly Hallows – Part 1\r\n"
				+ "Harry Potter and the Deathly Hallows – Part 2"};
		int[] movieNumber = {1,2,3,4,5,6,7,8};
		int[]movieYear = {2001,2002,2004,2005,2007,2009,2010,2011};
		for(String indMovieName:movieName) {
		System.out.println("The Movie name is: " +indMovieName);
	}
for(int indMovieNumber:movieNumber) {
	System.out.println("Movie Number is: "+indMovieNumber);
}
for(int indMovieYear:movieYear) {
	System.out.println("Movie Release year is: "+indMovieYear);
}
}
}