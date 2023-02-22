package elleHacks;

public class Main {
    public static void main(String[] args) {

        Methods p = new Methods("Vivian", "Zhao");
        //Display d = new Display(p);
        Projections.setTotalConsumed(0.0);

        GUI d = new GUI(p);

        d.home();
    }
}
