package task2;

/* Class Dice that has the following functionality: (HW)
The constructor Dice(int numberOfSides) creates a new dice object that has the amount of sides defined by the argument.
The method roll tells the result of a roll (which depends on the number of its sides)
*/
import java.util.Random;

public class task2 {
        public static void main(String[] args){
            Dice myDice = new Dice(6);

            int i = 0;
            while (i<10){
                System.out.println("Roll: " + myDice.roll());
                i++;
            }
        }
}
