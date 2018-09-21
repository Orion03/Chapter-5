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
			result = "Price: $150,000";
		}
		
		else if(userPick == 2)
		{
			result = "Price: $170,000";
		}
		
		else if (userPick == 3)
		{
			result = "Price: $210,000";
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
