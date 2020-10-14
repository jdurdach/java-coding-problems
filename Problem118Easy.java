/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem118Easy.java
	14 October 2020
	
	Good morning! Here's your coding interview problem for today.
	
	This problem was asked by Google.
	
	Given a sorted list of integers, square the elements and give the output in sorted order.
	
	For example, given [-9, -2, 0, 2, 3], return [0, 4, 4, 9, 81].

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Problem118Easy {
	public static void main(String[] args) {
		//	Initialize ArrayLists to store the input and output values
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		
		//	Initialize a scanner and an int for input and verification
		Scanner input = new Scanner(System.in);
		int x;
		
		//	Initialize a boolean to control a while loop
		boolean takeInput = true;
		
		//	Prompt the user for the first value and add it to the ArrayList of inputs
		System.out.println("PLEASE ENTER AN INTEGER:  ");
		inputList.add(input.nextInt());
		
		//	While the user still wants to enter values, continue prompting and collecting
		while(takeInput) {
			System.out.println("PLEASE ENTER ANOTHER INTEGER, OR ENTER 0 TO STOP:  ");
			x = input.nextInt();
			if (x == 0) {
				//	If the user enters 0 as an input, break the loop and stop collecting input
				takeInput = false;
			} else {
				inputList.add(x);
			}
		}
		
		//	Loop through the list of input values, square them, and put them in the output list
		for(int i = 0; i < inputList.size(); i++) {
			outputList.add(inputList.get(i) * inputList.get(i));
		}
		
		//	Sort the list of output values
		Collections.sort(outputList);
		
		//	Loop through the output list and display results.
		System.out.println("INPUTTED VALUES SQUARED AND SORTED:  ");
		for(int i = 0; i < outputList.size(); i++) {
			System.out.println(outputList.get(i));
		}
	}
}
