/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem81Easy.java
	25 August 2020
	
	This problem was asked by Yelp.

	Given a mapping of digits to letters (as in a phone number), and a digit string, return all 
	possible letters the number could represent. You can assume each valid number in the mapping
	is a single digit.

	For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …} then “23” should return 
	[“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].
 */

import java.util.Scanner;
import java.util.ArrayList;
public class Problem81Easy {
	public static void main(String[] args) {
		/*	Initialize a scanner, a string array to hold all the letter values, and an empty 
			string ArrayList for the result */
		Scanner input = new Scanner(System.in);
		String[][] map = { 	
							{},
							{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}, 
							{"j", "k", "l"}, {"m", "n", "o"}, {"p", "q", "r"}, 
							{"s", "t", "u"}, {"v", "w", "x"}, {"y", "z"}
						};
		ArrayList<String> result = new ArrayList<String>();
		
		//	Prompt the user for input
		System.out.println("PLEASE ENTER AN INTEGER BETWEEN 0 AND 999:  ");
		int x = input.nextInt();
		
		if(x >= 0 && x <= 999) {
			System.out.println(x);
			/*	If the input is an integer between 0 and 999, convert it to a string and then split 
				it up into an array */
			String[] y = (Integer.toString(x)).split("");
			//	Initialize an int equal to the length of the inputted string array
			int length = y.length;
			System.out.println(length);

				//	Loop through and make make any 0 values equal to 1 to prevent bounds errors
				for(int i = 0; i < length; i++) {
					if(Integer.parseInt(y[i]) == 0) {
						y[i] = "1";
					}
				}
			
			//	Print the results depending on the length of the input
			switch(length) {
				case 1 :
					for(int i = 0; i < map[Integer.parseInt(y[0])].length; i++) {					
						result.add(map[Integer.parseInt(y[0])][i]);
					}
				break;
				case 2 :
					for(int i = 0; i < map[Integer.parseInt(y[0])].length; i++) {
						for(int n = 0; n < map[Integer.parseInt(y[1])].length; n++) {
							result.add(map[Integer.parseInt(y[0])][i] + "" + map[Integer.parseInt(y[1])][n]);
						}
					}
				break;
				case 3 :
					for(int i = 0; i < map[Integer.parseInt(y[0])].length; i++) {
						for(int n = 0; n < map[Integer.parseInt(y[1])].length; n++) {
							for(int m = 0; m < map[Integer.parseInt(y[2])].length; m++) {
								result.add(map[Integer.parseInt(y[0])][i] + "" + map[Integer.parseInt(y[1])][n] + "" + map[Integer.parseInt(y[2])][m]);
							}
						}
					}
				break;
			}
			
			for(int i = 0; i < result.size(); i++) {
				System.out.println(result.get(i));
			}	
					
		} else {
			System.out.println("ERROR:  PLEASE ENTER AN INTEGER BETWEEN 0 AND 999");
		}
	}
}
