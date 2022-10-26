package task6;


import java.util.Scanner;

public class task6 {
	public static void main (String[] args) {
		Scanner read = new Scanner (System.in);
		/** Create a method printText that prints the following string of 
		 * characters: "In the beginning there were the swamp, the hoe and Java."
		 * and a line break.
		 */
		System.out.println("How many times do you want to print the text?");
		int amount = Integer.parseInt(read.nextLine());
		printText(amount);
	}
	
	public static void printText(int x) {
		int n = 0;
		for (n=0; n<x; n++) {
			System.out.println("In the beginning there were the swamp, the hoe and Java.\n");

		}
		
	}
}
