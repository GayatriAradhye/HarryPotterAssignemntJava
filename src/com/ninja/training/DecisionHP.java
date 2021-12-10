package com.ninja.training;
import java.util.Scanner;
public class DecisionHP {

 public static void main(String[] args) {
		System.out.println("Enter the Movie Number ");
	Scanner input = new Scanner(System.in);
	int movieNumber = input.nextInt();
	input.close();
	if (movieNumber==1)
	System.out.println("First Movie");
	else if (movieNumber==8) 
System.out.println("Not First or Last Movie");
	else 
		System.out.println("Not First or Last Movie");
	}

}
