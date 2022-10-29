package task6;

import java.util.ArrayList;
import java.util.Scanner;

public class task6 {
	public static void main(String[] args) {
		/** Create a program that asks the user to input words until the user gives the same word twice.
		 *  Use an ArrayList structure in your program.
		 *   ArrayList is defined like this:**/
		ArrayList<String> words = new ArrayList<String>();
		Scanner reader = new Scanner(System.in);
		String userInput = "";
		while(true) {
			System.out.println("Type a word: ");
			userInput = reader.nextLine();
			if (words.contains(userInput)) {
				System.out.println("You gave the same word twice.");
				break;
			}
			words.add(userInput);
			
		}
		
	}

}
