package coffee;

public class American extends MainCoffee{

    private static String NAME = "American";

    private static String DESCRIPTION = "Is a type of coffee drink prepared by diluting an espresso with hot water";

    public American(Double price, Integer sugar, Integer syrup, Integer grainType) {
        super(price, sugar, syrup, grainType);
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
