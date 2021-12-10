//[EASY] How many years elapsed between first and last movie of Harry Potter? 
//[AVERAGE] Calculate using formula and print answer in years and months.
	//Approx years for a movie release = (Last movie Release Year – 	
//First Movie Release year) / Total Number of Movies

package com.ninja.training;
import java.util.Scanner;
public class HomeWork {

	public static void main(String[] args) {
		int firstMovie = 2001;
		int lastMovie = 2011;
		int avgInYear = (lastMovie-firstMovie)/8;
		int avgInRemainder = (lastMovie-firstMovie)%8;
		int monthInYear=12;
		int avgInMonths = (avgInYear*monthInYear)+ avgInRemainder;
		
	//year gap
System.out.println("---YEARS BETWEEN FIRST AND LAST MOVIE---");
System.out.println("\nThere are total 8 Harry Potter Movies");
System.out.println("\nFirst movie was released in 2001");
System.out.println("\nThe last Movie was released in 2011");
System.out.println("\nThe time elapsed between first movie "
	+ "and last movie is " +(lastMovie-firstMovie) + " years");;
	//approximate period between each release in years and months
	System.out.println("\n--AVERAGE YEARS OF RELEASE IN YEARS AND MONTHS--");
	System.out.println("\nAverage gap between two movies "
			+ "is " +avgInYear+ " years and " +avgInRemainder+ " months");
	System.out.println("\nAverage gap in Months is "+avgInMonths);
	/*printing year in decimal value 
	double yearInDecimal = avgInYear + (avgInRemainder/12);
	System.out.println("Years in decimal is " +yearInDecimal );
		//float test = 2/12;
	//System.out.println(+test);*/// the datatype of avgRemainder
	//and avgInMonths should be changed to float or double fot yearInDecimal
	}

}
