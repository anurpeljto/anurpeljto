public class Player {
    private String Name;
    private int numberOfGoals;

    public Player(String name, int numGoals){
        this.Name = name;
        this.numberOfGoals=numGoals;
    }

    public String toString(){
        return "Player: " +  this.Name + " goals: " + this.numberOfGoals;
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String newName){
        this.Name = newName;
    }

    public void setGoals(int goals){
        this.numberOfGoals=goals;
    }

    public int getGoals(){
        return this.numberOfGoals;
    }
}
