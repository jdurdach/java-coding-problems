/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem159Easy.java
	20 October 2020

	This problem was asked by Google.
	
	Given a string, return the first recurring character in it, or null if there is no recurring 
	character.
	
	For example, given the string "acbbac", return "b". Given the string "abcdef", return null.
 */

import java.util.Scanner;
public class Problem159Easy {
	public static void main(String[] args) {
		//	Initialize a Scanner and a string for taking input
		Scanner input = new Scanner(System.in);
		String x;
		/*	Initialize a char to store the recurring value and a boolean to verify there is a 
			recurring char */
		char recurring = 'a';
		boolean hasRecurring = false;
		
		//	Prompt the user for input and record entry
		System.out.println("PLEASE ENTER A STRING:  ");
		x = input.nextLine();
		
		//	Loop through the inputted string for the first repeating character.
		for(int i = 1; i < x.length(); i++) {
			/*	If the char at the current position matches the last char, and there has not 
				already been a recurring char identified, set the boolean to true and record the recurring char. */
			if((x.charAt(i) == x.charAt(i - 1)) && !hasRecurring) {
				hasRecurring = true;
				recurring = x.charAt(i - 1);
			}
		}
		
		/*	If the String has a recurring char, display it to the user, otherwise inform the user 
			that there is no recurring char.*/
		if(hasRecurring) {
			System.out.println("THE FIRST RECURRING CHARACTER IN THE STRING \"" + x + "\" IS:  " 
					+ "\"" + recurring + "\"");
		} else {
			System.out.println("THERE ARE NO RECURRING CHARACTERS IN THE STRING \"" + x + "\"");
		}
	}
}
