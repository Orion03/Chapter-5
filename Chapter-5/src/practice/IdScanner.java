package practice;

import java.util.Scanner;

public class IdScanner {

	public static void main(String[] args) {
		
		int idNumber;
		String result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Scan the barcode to find a person >> ");
		idNumber = input.nextInt();
		
		switch(idNumber)
		{
		case 274904:
			result = "John Brosius";
			break;
		}
	}

}
