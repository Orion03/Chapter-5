package practice;

import java.util.Scanner;

public class doorGame {

	public static void main(String[] args) {
		
		int doorChoice;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three");
		
		doorChoice = input.nextInt();
		
		if (doorChoice == 1) 
		{
			result = "Pile of gold.";
		}
		
		else if(doorChoice == 2) 
		{
			result = "Pile of gold and a singular chicken nugget.";
		}
		
		else if(doorChoice == 3) 
		{
			result = "Death.";
		}
		
		else
			result = "Nothing, you insolent fool.";
	}
	
	public static void displayMessage(String result) {
		System.out.println("You won: " + result);
	}

}
