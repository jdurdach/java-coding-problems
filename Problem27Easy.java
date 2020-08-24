/*
Mark J. Durdach
DailyCodingProblems/src/Problem27Easy.java
15 April 2020

This problem was asked by Facebook.

Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.

 */

public class Problem27Easy {
	public static void main(String[] args) {
		System.out.println("DAILY CODING PROBLEM #27 (EASY) -- 15 APRIL 2020");
		
		//	Declare a string variable to hold the brackets
		String brackets = "((())[])";
		
		//	Initialize variables to count the number of open and closed brackets
		int roundOpen = 0, roundClosed = 0;
		int curlyOpen = 0, curlyClosed = 0;
		int squareOpen = 0, squareClosed = 0;
		
		//	Convert the brackets string into an array of strings
		String[] bracketsArray = brackets.split("");
		
		//	Loop through each string in the array
		for (int i = 0; i < bracketsArray.length; i++) {
			//	Check if each value is an open or closed bracket
			if (bracketsArray[i].equals("(")) {
				/*	If a value in the array is a bracket, add it to the count of each type of 
					bracket */
				roundOpen += 1;
			} else if (bracketsArray[i].equals(")")) {
				roundClosed += 1;
			} else if (bracketsArray[i].equals("{")) {
				curlyOpen += 1;
			} else if (bracketsArray[i].equals("}")) {
				curlyClosed += 1;
			} else if (bracketsArray[i].equals("[")) {
				squareOpen += 1;
			} else if (bracketsArray[i].equals("]")) {
				squareClosed += 1;
			}			
		}
		
		//	Print the original string
		System.out.println("BRACKETS:  " + brackets);
		
		/*	If the number of open brackets in each category matches the number of closed brackets 
			in each category, the brackets are balanced.  Else they aren't */
		if ((roundOpen == roundClosed) && (curlyOpen == curlyClosed) && 
				(squareOpen == squareClosed)) { 
			System.out.println("THE BRACKETS ARE BALANCED");
		} else {
			System.out.println("THE BRACKETS ARE NOT BALANCED");
		}
		
	}
}
