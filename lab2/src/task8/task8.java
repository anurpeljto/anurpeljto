package task8;

import java.util.Scanner;
import java.lang.Math;

public class task8 {
	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		
		int rightAnswer = drawNumber(0, 100);
		int guess = -1;
		int guessCounter = 1;
		while(guess != rightAnswer) {
			System.out.println("Guess a number: ");
		    guess = Integer.parseInt(reader.nextLine());
			if (guess > rightAnswer) {
				System.out.println("Number is lesser than your guess, guesses made: " + guessCounter + "\n");
			}
			else if (guess < rightAnswer) {
				System.out.println("Number is greater than your guess, guesses made: " + guessCounter + "\n");
			}
			
			else {
				System.out.println("Correct! Guesses made: " + guessCounter + "\n");
				break;
			}
			guessCounter++;
		}
		}
	
	public static int drawNumber(int max, int min) {
		int number;
		number = min + (int)(Math.random() * ((max-min)+1));
		return number;
	}
}
