package cake;

public class Caramel extends MainCake {

    private static String NAME = "Caramel cake";
    private static String DESCRIPTION = "Just a cake with caramel";

    public Caramel(Double price, Integer calories, Integer weight) {
        super(price, calories, weight);
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
