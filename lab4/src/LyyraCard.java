import java.util.Scanner;

public class LyyraCard {
    Scanner reader = new Scanner(System.in);
    private double balance;
    private String firstName;
    private String lastName;
    public LyyraCard(double balanceAtStart){
        balance = balanceAtStart;
    }

    public void addName(){
        System.out.println("What is the cardholder's name?");
        String name = reader.nextLine();
        this.firstName = (name);
    }

    public void addLastName(){
        String lName = reader.nextLine();
        this.lastName = (lName);
    }

    public String toString(){
        return ("The card has " + balance + " euros");
    }

    public void payEconomical(){
        if(this.balance < 2.50){
            System.out.println("You do not have enough funds.");
        }
        else{
            this.balance = balance - 2.50;
        }
    }

    public void payGourmet(){
        if (this.balance < 4.00){
            System.out.println("You do not have enough funds.");
        }
        else {
            this.balance = balance - 4.00;
        }
    }

    public void loadMoney(double amount){
        if (this.balance + amount > 150){
            this.balance = 150;
        }

        else if(amount <= 0){
            System.out.println("Error");
        }

        else {
            this.balance += amount;
            System.out.println("Successfully added " + amount + " euros to " + this.firstName + "'s card.");
        }
    }
}
