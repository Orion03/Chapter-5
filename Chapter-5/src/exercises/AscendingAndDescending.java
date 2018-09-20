package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number >> ");
		num1 = input.nextInt();
		
		System.out.println("Enter another number >> ");
		num2 = input.nextInt();
		
		System.out.println("Enter another number >> ");
		num3 = input.nextInt();
		
		if(num1 <= num2 && num1 <= num3)
		{
			//low number has to be greater
			if(num2 <= num3)
			{
				//num2 as the second number
				//num3 as the third
				result = num1 + " " + num2 + " " + num3;
			}
			
			else if (num2 >= num3)
			{
				//num3 as the second number
				//num2 as the third number
				medium = num3;
				high = num2;
			}
		}
		
		else if (num1 >= num2 && num1 >= num3)
		{
			if(num2 <= num3)
			{
				
			}
			
			if (num2 >= num3)
			{
				
			}
			
		}
		
		System.out.println(result);

	}

}
