package practice;

import java.util.Scanner;

public class ageGame {

	public static void main(String[] args) 
	{
		
		int usersAge;
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your age to be insulted.");
		usersAge = input.nextInt();
		
		if (usersAge <= 12)
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
			result = "Shouldn't you be a parent by now?";
		}
		
		else if (usersAge >= 41 && usersAge <= 60)
		{
			result = "Say hello to grandkids!";
		}
		
		else if (usersAge >= 61 && usersAge <= 90)
		{
			result = "Say hello to GREAT grandkids!";
		}
		
		else if (usersAge >= 91 && usersAge <= 100)
		{
			result = "Shouldn't you have died already?";
		}
		
		else if (usersAge >= 101 && usersAge <= 200)
		{
			result = "Why are you still alive";
		}
		
		else if (usersAge >= 201 && usersAge <= 300)
		{
			result = "Perish.";
		}
		
		else if (usersAge >= 301 && usersAge <= 400)
		{
			result = "Your are unholy.";
		}
		
		else if (usersAge >= 401 && usersAge <=1000)
		{
			result = "Legendary being.";
		}
		
		else if (usersAge >1001)
		{
			result = "                             I͒ͭ͐̓ͣ͆ͯ̄̾̈̄̃̾̇̓͏̸̧̱̣͎̦̖̟̜̭͇̻̳͙͎͓̼m̜̣̥̩̞̠͉̲̈̽̄͛ͭͦ͆̄ͫ̑ͬ͜͜͠mo̶̢̺̣̫̪͕͇̖͓͉̞̠͎̝̘̯̥̦̫̬̍͌͑̈́́͢ŗ̶̘̪̥̹̞̘͙͍͍͔͗̾̋́̚t̷̡̘̻͖̗͙̺̫͇̲͊̇̽͆̐ͮ̍͌ͨ̅̇͆̚͘͝ͅą̧̩̬̥̣̳̜̹̩̳͓̟͓̤̙̹̺̰ͯ͌͗ͤ̀̓̍̂͑̇ͯ̽͗͞ḽ̵̥̟̫͕̖̹̜̙̯͚̟̝̰͓̩̬̙̗̌̎́͑͒͜͝";
		}
		
		displayMessage(result);
		
	}
	
	public static void displayMessage(String result)
	{
		System.out.println(result);
	}

}
