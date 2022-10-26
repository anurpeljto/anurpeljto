package task2;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		//Create a program that asks the user for three numbers then prints their sum.
		Scanner reader = new Scanner(System.in);
		int sum = 0;
		int n;
		int read;
		for (n=0; n<3; n++) {
			if(n==0) {
				System.out.print("Enter first number: ");
				read = Integer.parseInt(reader.nextLine());
			}
			
			else if(n == 1) {
				System.out.print("Enter second number: ");
				read = Integer.parseInt(reader.nextLine());
			}
			
			else {
				System.out.print("Enter third number: ");
				read = Integer.parseInt(reader.nextLine());
			}
			
			sum+=read;
		}
		
		System.out.println("Sum: " + sum);
	
	}
	
}
