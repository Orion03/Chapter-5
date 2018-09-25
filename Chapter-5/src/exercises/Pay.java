package exercises;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hoursWorked;
		int skillLevel;
		
		int skillLevel1Pay = 17;
		int skillLevel2Pay = 20;
		int skillLevel3Pay = 22;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter your skill level >> ");
		skillLevel = input.nextInt();
		
		System.out.println("Enter the amount of hours you have worked >> ");
		hoursWorked = input.nextInt();
		
		int overtimeHours = hoursWorked - 40;
		double overtimePay = (overtimeHours * skillLevel) * 1.5;
		
		int userPick;
		
		if(skillLevel == 2)
		{
			System.out.println("Would you like to add an insurance plan?");
			System.out.println("1 - Medical Insurance ($35) \n2 - Dental insurance ($20) \n3 - Long-term disability insurance ($10" +
					"\n4 - No insurance plan.");
			userPick = input.nextInt();
			
			if(userPick == 4)
			{
				if(hoursWorked <= 40)
				System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
						"\nOvertime hours worked: 0" + "\nTotal income: " + skillLevel2Pay);
				
				if(hoursWorked >= 40)
				System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
						"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + skillLevel2Pay);
			}
		}
	}

}
