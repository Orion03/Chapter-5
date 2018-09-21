package gameZone;

import java.util.Scanner;

public class randomGuess2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userGuess;
		int computerSecret;
		
		String result;
		
		Scanner input = new Scanner(System.in);
		computerSecret = (int )(Math.random() * 10 + 1);
		
		System.out.println("Pick a number, any number as long it's no higher than 10! >> ");
		userGuess = input.nextInt();
		
		
		
	}

}
