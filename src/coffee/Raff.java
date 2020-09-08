package coffee;

public class Raff extends MainCoffee{

    private static String NAME = "Raff";
    private static String DESCRIPTION = "is a coffee with cream and a little foam";

    public Raff(Double price, Integer sugar, Integer syrup, Integer grainType) {
        super(price, sugar, syrup, grainType);
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getDESCRIPTION() {
        return DESCRIPTION;
    }
}
