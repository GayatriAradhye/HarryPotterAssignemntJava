//[EASY] Store all the data into respective arrays.
package com.ninja.training;
import java.util.Arrays;
public class Array {

	public static void main(String[] args) {
	String[] movieNames = {"HP and the Philosophers Stone", 
			"HP and the Chember of Secrets",
			"HP and the Prisoner of Azkban",
			"HP and the Goblet of Fire",
			"HP and the Order of the Pheonix",
			"HP and the Halpf-Blood Prince",
			"HP and the Deathly Hollows 1",
			"HP and the Deathly HOllows 2"};
	int[] movieNumbers = {1,2,3,4,5,6,7,8};
	Arrays.sort(movieNames);
    int index = Arrays.binarySearch(movieNames, "HP and the Philosophers Stone");
	System.out.println("Index of the movie is:" +index);
	System.out.println(movieNames[index]);
	//int movieSecquence = movieNumbers[index];
	//System.out.println("Secquence of the movie is: " +movieSecquence);
	}

}
