package task4;

import java.util.Scanner;

public class task4 {
	public static void main (String[] args) {
		/** Create a program that asks for the user's name and prints it in reverse order. 
		 * You do not need to create a separate method for this.**/
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = reader.nextLine();
		int n=0;
		for (n=name.length(); n>0; n--) {
			System.out.print(name.substring(n-1, n));
		}
	}

}
