package coffee;

public class Raff extends MainCoffee implements MainCoffeeInterface {

    private static String name = "Raff    ";
    private static String description = "is a coffee with cream and a little foam";

    private static Boolean sugar = false;
    private static String syrup = "No syrup";
    private static Double price;

    public void setSugar(Boolean sugar) {
        Raff.sugar = sugar;
    }

    public void setSyrup(String syrup) {
        Raff.syrup = syrup;
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

    public Raff(Double price) {
        this.price = price;
    }
    public Raff() {
    }
}
