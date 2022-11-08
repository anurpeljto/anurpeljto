public class Main {
    public static void main(String[] args) {
        LyyraCard card = new LyyraCard(1.50);
        System.out.println(card);

        card.payEconomical();
        System.out.println(card.toString());
        card.payGourmet();
        System.out.println(card.toString());

        card.loadMoney(20.00);
        System.out.println(card.toString());
        System.out.println("--------------------------Brian and Pekka--------------------------");
        // Pekka and Brian part of the task:

        LyyraCard Pekka = new LyyraCard(20.00);
        LyyraCard Brian = new LyyraCard(30.00);
        Pekka.addName();
        Brian.addName();
        Pekka.payGourmet(); // Pekka pays for gourmet lunch
        Brian.payEconomical(); // Brian pays for economical lunch
        System.out.println("Pekka: " + Pekka.toString());
        System.out.println("Brian: " + Brian.toString());
        Pekka.loadMoney(20.00); // Pekka loads money
        Brian.payGourmet(); // Brian pays for Gourmet lunch
        System.out.println("Pekka: " + Pekka.toString());
        System.out.println("Brian: " + Brian.toString());
        Pekka.payEconomical(); // Pekka buys economical lunch
        Pekka.payEconomical(); // Pekka buys economical lunch
        Brian.loadMoney(50.00); // Brian loads 50 euros
        System.out.println("Pekka: " + Pekka.toString());
        System.out.println("Brian: " + Brian.toString());
    }
}
