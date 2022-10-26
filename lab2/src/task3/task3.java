package task3;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		/** Create a program that reads numbers from the user and prints their sum.
		 * The program should stop asking for numbers when the user enters the number 0.
		 */
		Scanner reader = new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.print("Enter number: ");
			int num = Integer.parseInt(reader.nextLine());
			if (num == 0) {
				break;
			}
			
			sum+= num;
			System.out.println("Sum now: " + sum);
		}
		
		System.out.println("Sum in the end: " + sum);
	}
}
