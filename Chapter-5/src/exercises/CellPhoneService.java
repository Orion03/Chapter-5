package exercises;

import java.util.Scanner;

public class CellPhoneService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int talkMinutesUsed;
		int textMessagesSent;
		int gigabytesUsed;
		
		String result = null;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of talk minutes used monthly >> ");
		talkMinutesUsed = input.nextInt();
		
		System.out.println("Enter amount of text messages sent monthly >> ");
		textMessagesSent = input.nextInt();
		
		System.out.println("Enter amount of GB used monthly >> ");
		gigabytesUsed = input.nextInt();
		
		if(talkMinutesUsed <= 500 && textMessagesSent == 0 && gigabytesUsed == 0)
		{
			result = "Plan A - $49 per month";
		}
		
		else if(talkMinutesUsed <= 500 && textMessagesSent >= 0 && gigabytesUsed == 0)
		{
			result = "Plan B - $55";
		}
		
		else if(talkMinutesUsed >= 500 && textMessagesSent == 0 && gigabytesUsed == 0)
		{
			result = "Plan C - $61 per month (up to 100 text messages) \nPlan D - $70 per month (100 or more text messages)";
		}
		
		else if(talkMinutesUsed == 0 && textMessagesSent == 0 && gigabytesUsed <= 200)
		{
			result = "Plan E - $79 per month (up to 2GB)";
		}
		
		else if(talkMinutesUsed == 0 && textMessagesSent == 0 && gigabytesUsed >= 200)
		{
			result = "Plan F - $87 (2GB or more)";
		}
		
		displayMessage(result);

	}
	
	public static void displayMessage(String result) {
		
		System.out.println(result);
		
	}

}
