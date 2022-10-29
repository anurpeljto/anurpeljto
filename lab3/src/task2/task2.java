package task2;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		/**Create a program that asks for the user's name and says how many characters the name contains.**/
		Scanner read = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = read.nextLine();
		System.out.println("The amount of letters in your name: " + letterCount(name));
	}
	
	public static int letterCount(String name) {
		return name.length();
	}
}
