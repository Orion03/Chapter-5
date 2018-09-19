package exercises;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		int x;
		int y;
		
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number >> ");
		x = input.nextInt();
		
		y = x % 2;
		
		if(y == 0)
		{
			result = "The number is even.";
		}
		
		else
		{
			result = "The number is odd.";
		}
		
		displayResult(result);
		
	}
	
	public static void displayResult (String result) {
		
		System.out.println(result);
	}

}
