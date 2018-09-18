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
		
		else if (usersAge >= 13 && usersAge <= 18)
		{
			result = "You are a snotty teen!";
		}
		
		else if (usersAge >= 19 && usersAge <= 25)
		{
			result = "Get a job!";
		}
		
		else if (usersAge >= 26 && usersAge <= 40)
		{
			result = ""
		}
		
	}
	
	public static void displayMessage(int result)
	{
		System.out.println(result);
	}

}
