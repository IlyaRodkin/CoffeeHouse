package coffee;

import coffee.MainCoffee;

public class Espresso extends MainCoffee {

    private static String NAME = "Espresso";
    private static String DESCRIPTION = "Is a coffee-making method of Italian origin, in which a small amount of nearly boiling water\nis forced under pressure (expressed) through finely-ground coffee beans";

    public Espresso(Double price, Integer sugar,
                    Integer syrup, Integer grainType) {
    super(price, sugar, syrup, grainType);
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }

}
