/*
	Mark J. Durdach
	DailyCodingProblems/src/Problem202Easy.java
	9 November 2020
	
	This problem was asked by Palantir.

	Write a program that checks whether an integer is a palindrome. 
	For example, 121 is a palindrome, as well as 888. 678 is not a palindrome. 
	Do not convert the integer into a string.
 */
public class Problem202Easy {
	public static void main(String[] args) {
		//	Initialize some integers to check
		int number1 = 34543;
		int number2 = 54647;
		
		System.out.println("PALINDROME CHECK:");
		System.out.println(number1 + ":  " + palindromeCheck(number1));
		System.out.println(number2 + ":  " + palindromeCheck(number2));
	}
	
	public static boolean palindromeCheck(int x) {		
		//	Initialize a variable equal to the input to record the original number
		int original = x;
		//	Initialize an integer to record the reverse of the input
		int reverse = 0;
		//	Initialize an integer to track the remainder through the loop
		int remainder = 0;
		
		while(x != 0) {
			//	Use modulo to get the last digit of the integer and store it as the remainder
			remainder = x % 10;
			//	Multiply the current reverse int by 10 and add the remainder
			reverse = reverse * 10 + remainder;
			//	Divide x by 10 to eliminate the now empty (0) place of the last digit
			x = x / 10;
		}
		
		//	Check the result
		if(reverse == original) {
			return true;
		} else {
			return false;
		}
	}
}
