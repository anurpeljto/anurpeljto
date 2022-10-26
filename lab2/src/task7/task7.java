package task7;
import java.util.Scanner;

public class task7 {
	public static void main(String[] args) {
		/** create a method printStars that prints the given amount of stars and
		 * a line break.
		 */
		Scanner reader = new Scanner (System.in);
		
		System.out.println("How many stars do you want to print?");
		int num = Integer.parseInt(reader.nextLine());
		printStars(num);
	}
	
	public static void printStars(int amount) {
		int n;
		for(n=0; n<amount; n++) {
			System.out.print("*");
		}
	}
}
