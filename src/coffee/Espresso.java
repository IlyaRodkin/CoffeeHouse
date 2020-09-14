package coffee;

public class Espresso extends MainCoffee implements MainCoffeeInterface {

    public static String name = "Espresso";
    private static String description = "Is a coffee-making method of Italian origin, in which a small amount of nearly boiling water\nis forced under pressure (expressed) through finely-ground coffee beans";

    private static Boolean sugar = false;
    private static String syrup = "No syrup";
    private static Double price;

    public void setSugar(Boolean sugar) {
        Espresso.sugar = sugar;
    }

    public void setSyrup(String syrup) {
        Espresso.syrup = syrup;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSugar() {
        if(sugar) return "yes";
        else return "no";
    }

    public String getSyrup() {
        return syrup;
    }

    public Double getPrice() {
        return price;
    }

    public Espresso(Double price) {
        this.price = price;
    }
    public Espresso() {
    }

}
