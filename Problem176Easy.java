/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem176Easy.java
	21 October 2020
	
	This problem was asked by Bloomberg.
	
	Determine whether there exists a one-to-one character mapping from one string s1 to another s2.
	
	For example, given s1 = abc and s2 = bcd, return true since we can map a to b, b to c, and c 
	to d.
	
	Given s1 = foo and s2 = bar, return false since the o cannot map to two characters.	
 */

import java.util.Scanner;
public class Problem176Easy {
	public static void main(String[] args) {
		//	Initialize a Scanner and two variables to accept input
		Scanner input = new Scanner(System.in);
		String s1;
		String s2;
		
		//	Prompt the user for two Strings
		System.out.println("PLEASE ENTER A STRING:  ");
		s1 = input.nextLine();
		System.out.println("PLEASE ENTER ANOTHER STRING:  ");
		s2 = input.nextLine();
		
		//	Remove spaces from Strings and pass them to a boolean method to check them
		if (hasOneToOne(s1.replaceAll(" ", ""), s2.replaceAll(" ", ""))) {
			//	The Strings have a 1-1 char correspondence
			System.out.println("THE STRINGS HAVE A 1 TO 1 CHARACTER CORRESPONDENCE.");
		} else {
			///	The Strings do not have a 1-1 char correspondence
			System.out.println("THE STRINGS DO NOT HAVE A 1 TO 1 CHARACTER CORRESPONDENCE.");
		}	
	}
	
	public static boolean hasOneToOne(String x, String y) {
		//	Initialize a boolean to act as a check before returning		
		boolean check = true;
		
		if(x.equals(y)) {
			System.out.println("equals");
			return true;
		} else {
			//	Loop through the first string to select each character 
			for(int i = 0; i < x.length(); i++) {
				//	Initialize counter variables
				int xCount = 0;
				int yCount = 0;
				//	Loop through the first string again to get the count of that character
				for(int n = 0; n < x.length(); n++) {
					if(x.charAt(n) == x.charAt(i)) {
						xCount++;
					}
				}
				
				//	Loop through the second string to get the count of that character
				for(int m = 0; m < y.length(); m++) {
					if(y.charAt(m) == x.charAt(i)) {
						yCount++;
					}
				}
					
				/*	Compare the values of the counter variables.  If they do not match, the check
					boolean is set to false. */
				if(xCount != yCount) {
					check = false;
				}
			}
		}
			
		//	Validate the check boolean.  Return the result.				
		if(!check) {
			return false;
		} else {
			return true;
		}			
	}
}

