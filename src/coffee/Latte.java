package coffee;

public class Latte extends MainCoffee{

    private static String NAME = "Latte";

    private static String DESCRIPTION = "Is a coffee drink made with espresso and steamed milk";

    public Latte(Double price, Integer sugar, Integer syrup, Integer grainType) {
        super(price, sugar, syrup, grainType);
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }

}
