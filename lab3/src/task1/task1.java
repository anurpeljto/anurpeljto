package task1;

import java.util.Scanner;

public class task1 {
	public static void main (String[] args) {
		/**Create the method average, which calculates the average of the numbers it gets as parameters.
		 * Inside the method you should use the method sum as a helper!  
		 * Place the method in the following program body**/
		double answer = average(4, 3, 6, 1);
		int sum = sum(4, 3, 6, 1);
		System.out.println("sum: " + sum);
		System.out.println("average: " + answer);
		
	}
	
	public static int sum (int num1, int num2, int num3, int num4) {
		int result =0;
		result = num1 + num2 + num3 + num4;
		return result;
	}
	
	public static double average(int number1, int number2, int number3, int number4) {
		double average = 0.0;
		average = sum(number1, number2, number3, number4) / 4.0;
		return average;
	}
}
