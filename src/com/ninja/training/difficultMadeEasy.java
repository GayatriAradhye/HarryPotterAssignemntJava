/*Keep getting input from user  for 5 times. Store all the inputs given by the user in an array. 
 * Loop through the array using For Each loop and print all the movie names entered by the user. 
 */

package com.ninja.training;
import java.util.Scanner;
import java.util.Arrays;
public class difficultMadeEasy {

	public static void main(String[] args) {
	//String[] movieName = new String[5];
	//int[] movieNumber = new int[5];
	//int[] movieYear = new int[5];
		int movieNum;
		int max=5;
		String[] movieN = new String[max];
		System.out.println("Enter the movie Name");
	for(movieNum= 0;movieNum<max;movieNum++) {
			Scanner input = new Scanner(System.in);
				String movieName =input.nextLine();
				//input.close(); //shall we not use input.close in for loop??
                movieN[movieNum]= movieName;
	}
	System.out.println("Movie Names are below");
	for(movieNum= 0;movieNum<max;movieNum++) {
		
System.out.println(movieN[movieNum]);
}

	}}
