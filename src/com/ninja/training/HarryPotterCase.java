//[AVERAGE] Keep getting input from user and print the name of the movie till the user enters an invalid input.

package com.ninja.training;
import java.util.Scanner;
public class HarryPotterCase {
public static void main(String[] args) {
	int maxAttempts = 4;
			int attemptCount=0;
			Scanner input = new Scanner(System.in);
			while (attemptCount<maxAttempts) {
				attemptCount++;
				System.out.println("\n***Enter the Movie NUmber***");
		int movieNumber = input.nextInt();
		switch (movieNumber) {
	case 1:
	System.out.println("Harry Potter and the Philosopher's Stone, 2001");
	break;
	case 2:
		System.out.println("Harry Potter and the Chamber of Secrets, 2002");
		break;
	case 3:
		System.out.println("Harry Potter and the Prisoner of Azkban, 2004");
		break;
	case 4:
		System.out.println("Harry Potter and the Goblet of Fire, 2005");
		break;
	case 5:
		System.out.println("Harry Potter and the Order of the Phoenix,2007");
		break;
	case 6:
		System.out.println("Harry Potter and the Half Blood Prince, 2009");
		break;
	case 7:
		System.out.println("Harry Potter and the Deathly Hollows -Part 1, 2010");
		break;
	case 8:
		System.out.println("Harry Potter and the Deathly Hollows - Part 2, 2011");
		break;
	default:
		System.out.println("Invalid Entry");
		
	}// end of switch
	
	}//end of while
			input.close();
			System.out.println("\n!!You have completed maximum attempts!!");

}
}