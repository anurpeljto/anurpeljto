package task5;

import java.util.Scanner;
import java.lang.Math;
public class task5 {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		int power;
		
		System.out.println("Enter the power of 2 which you wish to calculate: ");
		power = Integer.parseInt(reader.nextLine());
		System.out.println(Math.pow(2, power));
		
		System.out.println("This time using a method: ");
		System.out.println(powerOfTwo(power));
	}
	
	public static int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public static double powerOfTwo(int pow1) {
		return Math.pow(2, pow1);
	}
}
