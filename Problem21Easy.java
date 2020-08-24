/*
Mark J. Durdach
DailyCodingProblems/src/Problem21Easy.java
14 April 2020

This problem was asked by Snapchat.

Given an array of time intervals (start, end) for classroom lectures (possibly overlapping), find 
the minimum number of rooms required.

For example, given [(30, 75), (0, 50), (60, 150)], you should return 2.
 */

public class Problem21Easy {
	public static void main(String[] args) {
		System.out.println("DAILY CODING PROBLEM #21 (EASY) -- 14 APRIL 2020");
		
		//	Initialize a 2 dimensional array of class times {start, stop}
		int timeIntervals[][] = {{0, 45}, {30, 75}, {60, 105}, {90, 135}, {180, 225}, {240, 285},
				{270, 315}};
		
		//	Declare a constant variable equal to the length of the array
		int NUM_OF_CLASSES = timeIntervals.length;
		
		//	Initialize an int to count the rooms.  There has to be at least one
		int rooms = 1;
		
		/*	Loop through the classes and check if the end time of a class is  greater than the 
			start time of the next class*/
		for (int i = 0; i < NUM_OF_CLASSES - 1; i++) {
			if (timeIntervals[i][1] > timeIntervals[i + 1][0]) {
				//	If the condition is true, increment the number of rooms
				rooms++;
			}
		}

		//	Display results
		System.out.println("There will have to be " + rooms + " rooms.");
						
	}
}
