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
		double totalIncome = skillLevel + overtimePay;
		
		if(skillLevel == 2)
		{
			System.out.println("Would you like to add an insurance plan?");
			System.out.println("1 - Medical Insurance ($35) \n2 - Dental insurance ($20) \n3 - Long-term disability insurance ($10" +
					"\n4 - No insurance plan.");
			userPick = input.nextInt();
			
			if(userPick == 4)
			{
				if(hoursWorked <= 40)
				{
				    System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
						"\nOvertime hours worked: 0" + "\nTotal income: " + skillLevel2Pay);
				}
				
				else if(hoursWorked >= 40)
				{
				System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
						"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome);
				}
			}
			
			else if(userPick == 3)
			{
				if(hoursWorked <= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
							"\nOvertime hours worked: 0" + "\nTotal income: " + skillLevel2Pay + "\nTotal income after deductions: " + 
							(skillLevel2Pay - 10));
				}
				
				else if(hoursWorked >= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
							"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome + "\nTotal income after "
									+ "deductions: " + (totalIncome - 10));
				}
			}
			
			else if(userPick == 2)
			{
				if(hoursWorked <= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
							"\nOvertime hours worked: 0" + "\nTotal income: " + skillLevel2Pay + "\nTotal income after deductions: " + 
							(skillLevel2Pay - 20));
				}
				
				else if(hoursWorked >= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
							"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome + "\nTotal income after "
									+ "deductions: " + (totalIncome - 20));
				}
			}
			
			else if(userPick == 1)
			{
				if(hoursWorked <= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
							"\nOvertime hours worked: 0" + "\nTotal income: " + skillLevel2Pay + "\nTotal income after deductions: " + 
							(skillLevel2Pay - 17));
				}
			}
		}
	}

}
