/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem70Easy.java
	24 August 2020
	
	This problem was asked by Microsoft.

	A number is considered perfect if its digits sum up to exactly 10.
	
	Given a positive integer n, return the n-th perfect number.
	
	For example, given 1, you should return 19. Given 2, you should return 28.
 */

import java.util.Scanner;
public class Problem70Easy {
	public static void main(String[] args) {
		//	Initialize a Scanner and a variable to hold the input
		Scanner input = new Scanner(System.in);
		int x;
		
		//	Prompt the user and collect input
		System.out.println("PLEASE ENTER A NUMBER FROM 1 1O 9");
		x = input.nextInt();
		
		if (x >= 1 && x <= 9) {
			//	If the number is between 1 and 9, calculate the perfect number and print result
			int y = 10 - x;
			System.out.println(x + "" + y);
		} else {
			//	If not, throw an error message
			System.out.println("ERROR:  PLEASE ENTER A NUMBER FROM 1 TO 9");
		}	
	}
}
