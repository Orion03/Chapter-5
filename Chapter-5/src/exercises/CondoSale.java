package exercises;

import java.util.Scanner;

public class CondoSale {

	public static void main(String[] args) {
		
		int userPick;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which condo would you like to view? \n1 for park view \n2 for golf course view \n3 for lake view");
		userPick = input.nextInt();
		
		if(userPick == 1)
		{
			System.out.println("Would you like garage?");
			
		}
		
		else if(userPick == 2)
		{
			System.out.println("Would you like a garage?");
		}
		
		else if (userPick == 3)
		{
			System.out.println("Would you like a garage?");
		}
		
		else
		{
			result = "Price: $0. Invalid number.";
		}
		
		displayMessage(result);
	}
	
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}

}
