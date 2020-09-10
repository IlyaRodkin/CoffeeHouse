package cake;

public class Chocolate extends MainCake{

    private static String NAME = "Chocolate cake";
    private static String DESCRIPTION = "Cake with chocolate";

    public Chocolate(Double price, Integer calories, Integer weight) {
        super(price, calories, weight);
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
