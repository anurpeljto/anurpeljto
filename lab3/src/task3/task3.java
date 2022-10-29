package task3;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		/** Create a program that asks for the user's name and gives its characters separately.
		 *  You do not need to create methods in this exercise.*/
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter your name: ");
		String name = reader.nextLine();
		int n=0;
		for (n=0; n<name.length(); n++) {
			System.out.println(name.substring(n,n+1));
		}
		
	}
}
