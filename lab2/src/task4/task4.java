package task4;

import java.util.Scanner;
public class task4 {
	public static void main(String[] args) {
	/**Create a program that asks the user for the first number and 
	 * the last number and then prints all numbers between those two. 
	 * Use a while loop. */
		Scanner reader = new Scanner(System.in);
		int num1;
		int num2;
	
		System.out.println("Enter first number: ");
		num1 = Integer.parseInt(reader.nextLine());
		System.out.println("Enter second number: ");
		num2 = Integer.parseInt(reader.nextLine());
		
		int i = num1+1;
		while(i > num1 && i <num2) {
			System.out.println(i);
			i++;
		}
	
}
}
