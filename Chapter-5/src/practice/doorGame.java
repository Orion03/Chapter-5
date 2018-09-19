package practice;

import java.util.Scanner;

public class doorGame {

	public static void main(String[] args) {
		
		int doorChoice;
		int chestChoice;
		int bookChoice;
		
		String result = null;
		
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
		
		else if(doorChoice == 10)
		{
			System.out.println("Congratulations, you managed to find a secret.");
			System.out.println("There are three books on a table, labeled with numbers. Which do you choose? 1, 2, or 3?");
			bookChoice = input.nextInt();
			if(bookChoice == 1)
			{
				result = "The book that kills you upon the second you gaze your eyes on it. You died.";
			}
			
			else if(bookChoice == 2)
			{
				result = "A cook book. Make something or suffer.";
			}
			
			else if(bookChoice == 3)
			{
				result = "It's a quantum physics book. And inside is a joke book. Inside the joke book is another quantum physics book. Inside"
						+ " \nthat book, however, is a joke book. And yet, another quantum physics book lays inside. You decide to close the book.";
			}
			
			else
			{
				result = "The invisible book. Legends say the text on it reads the greatest spaghetti recipe of all time. "
						+ "Good thing you can't see it.";
			}
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
