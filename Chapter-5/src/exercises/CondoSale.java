package exercises;

import java.util.Scanner;

public class CondoSale {

	public static void main(String[] args) {
		
		int userPick;
		int userPick2;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which condo would you like to view? \n1 for park view \n2 for golf course view \n3 for lake view");
		userPick = input.nextInt();
		
		if(userPick == 1)
		{
			System.out.println("Would you like garage? \n1 - yes \n2- no");
			userPick2 = input.nextInt();
			
			if(userPick2 == 1)
			{
				result = "$155,000";
			}
			
			else if(userPick2 == 2)
			{
				result = "150,000";
			}
			
		}
		
		else if(userPick == 2)
		{
			System.out.println("Would you like a garage?");
			userPick2 = input.nextInt();
			
			if(userPick2 == 1)
			{
				result = "$175,000";
			}
			
			else if(userPick2 == 2)
			{
				result = "$170,000";
			}
		}
		
		else if (userPick == 3)
		{
			System.out.println("Would you like a garage?");
			userPick2 = input.nextInt();
			
			if(userPick2 == 1)
			{
				result = "$215,000";
			}
			
			else if(userPick2 == 2)
			{
				result = "$210,000";
			}
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
