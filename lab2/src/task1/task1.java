package task1;

import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		//Create a program that asks the user for a password. If the password is right,
		// a secret message is shown to the user.
		
		Scanner reader = new Scanner(System.in);
		String password = "password";
		String userGuess = "";
		
		while(!userGuess.equals(password)) {
			System.out.println("Enter password: ");
			userGuess = reader.nextLine();
			if (userGuess.equals(password)) {
				System.out.println("Correct!");
				break;
			}
			
			else {
				System.out.println("Wrong, try again. \n");
				continue;
			}
		}
	}
}
