/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem124Easy.java
	19 October 2020
	
	This problem was asked by Microsoft.

	You have n fair coins and you flip them all at the same time. Any that come up tails you set 
	aside. The ones that come up heads you flip again. How many rounds do you expect to play before
	only one coin remains?
	
	Write a function that, given n, returns the number of rounds you'd expect to play until one 
	coin remains.
 */

import java.util.Scanner;
public class Problem124Easy {
	public static void main(String[] args) {
		//	Initialize a scanner to take input.
		Scanner input = new Scanner(System.in);
		/*	Initialize an integer to store the number of coins flipped and an integer to store the 
			number of flips. */
		int n;	
		int flips = 0;
		
		//	Prompt the user for input and store the value
		System.out.println("PLEASE ENTER THE NUMBER OF COINS YOU WOULD LIKE TO FLIP:  ");
		n = input.nextInt();
				
		//	Validate that the user entered a value greater than 0
		while(n <= 0) {
			System.out.println("ERROR - PLEASE ENTER AN INTEGER VALUE GREATER THAN 0:  ");
			n = input.nextInt();
		}
		
		//	While the number of coins remaining is greater than zero, continue flipping
		while(n > 0) {
			//	This is a new flip cycle, so increment the number of flips
			flips++;
			//	Flip every remaining coin at the same time
			for(int i = n; i > 0; i--) {
				if(Math.random() > 0.5) {
					//	Heads, do nothing
				} else {
					//	Tails, take this coin away.
					n--;
				}
			}
		}
		
		//	Print out the result
		System.out.println("THE COINS WERE ELIMINATED BY LANDING ON TAILS AFTER " + flips + " FLIPS.");
		
	}
}
