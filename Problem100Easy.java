/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem100Easy.java
	7 September 2020
	
	This problem was asked by Google.

	You are in an infinite 2D grid where you can move in any of the 8 directions:
	
	 (x,y) to
	    (x+1, y),
	    (x - 1, y),
	    (x, y+1),
	    (x, y-1),
	    (x-1, y-1),
	    (x+1,y+1),
	    (x-1,y+1),
	    (x+1,y-1)
	You are given a sequence of points and the order in which you need to cover the points. Give the minimum number of steps in which you can achieve it. You start from the first point.
	
	Example:
	
	Input: [(0, 0), (1, 1), (1, 2)]
	Output: 2
	It takes 1 step to move from (0, 0) to (1, 1). It takes one more step to move from (1, 1) to (1, 2).
*/

import java.util.Scanner;
import java.util.ArrayList;
public class Problem100Easy {
	public static void main(String[] args) {
		/*	Initialize a Scanner, an int to track the number of points, and two ArrayLists 
			for the x and y coords */
		Scanner input = new Scanner(System.in);
		int numberOfPoints = 0;
		ArrayList<Integer> xCoordinates = new ArrayList<Integer>();
		ArrayList<Integer> yCoordinates = new ArrayList<Integer>();
		
		//	Prompt the user for the number of points they would like to cross
		System.out.println("PLEASE ENTER THE NUMBER OF POINTS THAT YOU WOULD LIKE TO CROSS:  ");
		numberOfPoints = input.nextInt();
		
		//	Get the x and y coordinates for each respective point and add them to the ArrayLists
		for(int i = 0; i < numberOfPoints; i++) {
			System.out.println("PLEASE ENTER THE X COORDINATE FOR POINT " + i);
			xCoordinates.add(input.nextInt());
			System.out.println("PLEASE ENTER THE Y COORDINATE FOR POINT " + i);
			yCoordinates.add(input.nextInt());
		}
		
		/*
		 * STEPS
		 * UP 0 +1
		 * DOWN 0 -1
		 * LEFT -1 0
		 * RIGHT +1 0
		 * UP RIGHT +1 +1
		 * DOWN RIGHT +1 -1
		 * UP LEFT -1 +1
		 * DOWN LEFT -1 -1
		 */
		
		//	Initialize ints for the starting positions and another to track the number of steps
		int xPos = xCoordinates.get(0);
		int yPos = yCoordinates.get(0);
		int steps = 0;
		
		/*	Start at the first point and loop through.  Add to the x and y positions until they 
			match the next point.  Count each step by incrementing the step variable every time 
			there is a move.	*/
		int i = 0;
		while(i < numberOfPoints) {
			//	x and y positions match the point, don't move and change point from lists.
			if((yPos == yCoordinates.get(i)) && xPos == xCoordinates.get(i)) {
					i++;
			} else {
				//	Up
				if((yPos < yCoordinates.get(i)) && xPos == xCoordinates.get(i)) {
					steps++;
					yPos++;
				}
				//	Down
				if((yPos > yCoordinates.get(i)) && xPos == xCoordinates.get(i)) {
					steps++;
					yPos--;
				}
				//	Left
				if((yPos == yCoordinates.get(i)) && xPos > xCoordinates.get(i)) {
					steps++;
					xPos--;
				}
				//	Right
				if((yPos == yCoordinates.get(i)) && xPos < xCoordinates.get(i)) {
					steps++;
					xPos++;
				}	
				//	Up Right
				if((yPos < yCoordinates.get(i)) && xPos < xCoordinates.get(i)) {
					steps++;
					yPos++;
					xPos++;
				}
				//	Down Right
				if((yPos > yCoordinates.get(i)) && xPos < xCoordinates.get(i)) {
					steps++;
					yPos--;
					xPos++;
				}
				//	Up Left
				if((yPos < yCoordinates.get(i)) && xPos > xCoordinates.get(i)) {
					steps++;
					yPos++;
					xPos--;
				}
				//	Down Left
				if((yPos > yCoordinates.get(i)) && xPos > xCoordinates.get(i)) {
					steps++;
					yPos--;
					xPos--;
				}				
			}		
		}
		
		for(int n = 0; n < numberOfPoints; n++) {
			System.out.println("Point " + n + ":  (" + xCoordinates.get(n) + ", " + yCoordinates.get(n) + ")");			
		}
		
		System.out.println("NUMBER OF STEPS:  " + steps);
		input.close();
	}
}
