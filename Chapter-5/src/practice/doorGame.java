package practice;

import java.util.Scanner;

public class doorGame {

	public static void main(String[] args) {
		
		int doorChoice;
		int chestChoice;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to the amazing door choice game!");
		System.out.println("Your host Steve Harvey");
		System.out.println("Pick a door any door. \n1- for door One\n2- for door Two\n3- for door Three");
		
		doorChoice = input.nextInt();
		
		if (doorChoice == 1) 
		{
			System.out.println("Door 1 good choice choose among the following chests.");
			System.out.println("1- For chest one\n2- For chest two");
			chestChoice = input.nextInt();
			if (chestChoice == 1) {
				result = "Pile of gold.";
			}
			
			else if (chestChoice == 2) {
				result = "... nothing. A fool you are, for thy has picked the chest of hollow reward.";
			}
			
			else
			{
				result = "You absolute madman.";
			}
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
		{
			result = "Nothing, you insolent fool.";
		}
		
		displayMessage(result);
	}
	
	public static void displayMessage(String result) {
		System.out.println("You won: " + result);
	}

}
