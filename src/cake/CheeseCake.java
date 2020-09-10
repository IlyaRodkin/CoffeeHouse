package cake;

public class CheeseCake extends MainCake{

    private static String NAME = "Cheesecake";
    private static String DESCRIPTION = "Sweet dessert consisting of one or more layers";

    public CheeseCake(Double price, Integer calories, Integer weight) {
        super(price, calories, weight);
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
