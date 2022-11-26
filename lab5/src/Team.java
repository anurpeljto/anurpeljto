import java.sql.Array;
import java.util.ArrayList;
public class Team {
    private String Name;
    private ArrayList<Player> players = new ArrayList<Player>();
    private int maxSize = 16;

    public Team(String name){
        this.Name = name;
    }

    public String getName(){
        return this.Name;
    }

    public void setName(String newName){
        this.Name = newName;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void printPlayers(){
        int i;
        System.out.print("Players: ");
        for(i=0; i<players.size(); i++){
            System.out.print(players.get(i) + "; ");
        }
    }

    public void setMaxSize(int i){
        this.maxSize = i;
    }

    public int size(){
        return this.players.size();
    }

    public int goals(){
        int i;
        int sum=0;
        for (i=0; i<players.size(); i++){
            sum += players.get(i).getGoals();
        }
        return sum;
    }
}
