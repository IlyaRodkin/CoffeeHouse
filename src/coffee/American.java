package coffee;

public class American extends MainCoffee implements MainCoffeeInterface {

    private static String name = "American";
    private static String description = "Is a type of coffee drink prepared by diluting an espresso with hot water";
    private static Boolean sugar = false;
    private static String syrup = "No syrup";
    private static Double price;

    public void setSugar(Boolean sugar) {
        American.sugar = sugar;
    }

    public void setSyrup(String syrup) {
        American.syrup = syrup;
    }

    public  String getName() {
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

    public American(Double price) {
        this.price = price;
    }
    public American() {
    }

}
