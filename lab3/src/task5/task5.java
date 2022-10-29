package task5;

import java.util.Scanner;

public class task5 {
	public static void main (String[] args) {
		/**Create a program that asks the user for two words. 
		 * Then the program tells if the second word is included in the first word. 
		 * Use the String method indexOf in your program.
		 * **/
		String glitter = "glitter";
		String litter = "clean";
		isIncluded(glitter, litter);
	
	}
	
	public static void isIncluded(String word1, String word2) {
		if (word1.indexOf(word2) >= 0) {
			System.out.println("The word " + word2 + " is included in " + word1);
		}
		else {
			System.out.println("The word " + word2 + " is not included in " + word1);
		}
	}

}
