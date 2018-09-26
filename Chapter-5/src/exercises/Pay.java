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
		double overtimePay2 = (overtimeHours * skillLevel2Pay) * 1.5;
		double overtimePay3 = (overtimeHours * skillLevel3Pay) * 1.5;
		
		int userPick;
		int userPick2;
		
		double totalIncome2 = skillLevel2Pay + overtimePay2;
		double totalIncome3 = skillLevel3Pay + overtimePay3;
		
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
						"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome2);
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
							"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome2 + "\nTotal income after "
									+ "deductions: " + (totalIncome2 - 10));
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
							"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome2 + "\nTotal income after "
									+ "deductions: " + (totalIncome2 - 20));
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
				
				else if(hoursWorked >= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel2Pay + 
							"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome2 + "\nTotal income after "
									+ "deductions: " + (totalIncome2 - 17));
				}
			}
			
			else
			{
				System.out.println("ERROR: Insufficient pay.");
			}
		 }
		
		else if(skillLevel == 3)
		{
			System.out.println("Would you like to add an insurance plan?");
			System.out.println("1 - Medical Insurance ($35) \n2 - Dental insurance ($20) \n3 - Long-term disability insurance ($10" +
					"\n4 - No insurance plan.");
			userPick2 = input.nextInt();
			
			if(userPick2 == 4)
			{
				if(hoursWorked <= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel3Pay + 
							"\nOvertime hours worked: 0" + "\nTotal income: " + skillLevel2Pay);
				}
				
				else if(hoursWorked <= 40)
				{
					System.out.println("Hours worked: " + hoursWorked + "\nHourly pay rate: " + skillLevel3Pay + 
							"\nOvertime hours worked: " + overtimeHours + "\nTotal income: " + totalIncome3);
				}
			}
		}
	}

}
