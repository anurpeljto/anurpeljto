public class Main {
    public static void main(String[] args) {
        Team MyTeam = new Team("FC Inter");
        System.out.println("Team: " + MyTeam.getName());

        // adding players

        Player anur = new Player("Anur", 39);
        Player pekka = new Player("Pekka", 0);
        System.out.println(anur);
        System.out.println(pekka);

        // adding players to teams

        MyTeam.addPlayer(anur);
        MyTeam.addPlayer(pekka);
        MyTeam.printPlayers();

        //size function

        System.out.println("Team size: " + MyTeam.size());
        System.out.println("Goals: " + MyTeam.goals());
    }
}