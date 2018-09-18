package practice;

import java.util.Scanner;

public class ageGame {

	public static void main(String[] args) 
	{
		
		int usersAge;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted.");
		usersAge = input.nextInt();
		
		if (usersAge >= 12)
		{
			result = "Your a child! Go away!";
		}
		
	}
	
	public static void displayMessage(int result)
	{
		System.out.println(result);
	}

}
