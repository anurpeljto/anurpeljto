package task1;

/* Create the method public static void combine(ArrayList<Integer> first, ArrayList<Integer> second)
 that inserts the items in a list called second to a list called first.
  The order of the items can be anything and the same item can appear in the list more than once.
   An example on using the method:*/
import java.util.Scanner;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int n=0;
        ArrayList<Integer> userArray = new ArrayList<Integer>();
        ArrayList<Integer> userArray2 = new ArrayList<Integer>();
        System.out.print("How many elements do you want in your ArrayList? ");
        n = Integer.parseInt(reader.nextLine());
        for (int i=0; i<n; i++){
            System.out.print("Enter element: ");
            userArray.add(Integer.parseInt(reader.nextLine()));
        }
        System.out.println("How many elements do you want in the second arraylist?");
        int n2 = Integer.parseInt(reader.nextLine());
        for (int i=0; i <n2; i ++){
            System.out.print("Enter element: ");
            userArray2.add(Integer.parseInt(reader.nextLine()));
        }
        printArrayList(userArray);
        printArrayList(userArray2);
        System.out.println("Now combining two arrays:");
        combine(userArray, userArray2);
        printArrayList(userArray);
    }

    public static void combine(ArrayList<Integer> first, ArrayList<Integer> second){
        int n;
        for (n=0; n<second.size(); n++){
            first.add(second.get(n));
        }
    }

    public static void printArrayList(ArrayList<Integer> arraylist){
        int n;
        for (n=0; n<arraylist.size(); n++){
            if (n == arraylist.size() - 1){
                System.out.print(arraylist.get(n) + ")");
            }
            else if (n == 0){
                System.out.print("(" + arraylist.get(n) + ",");
            }
            else{
                System.out.print(arraylist.get(n) + ",");
            }
        }
        System.out.println();
    }
}
