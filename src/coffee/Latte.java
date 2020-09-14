package coffee;

import main.Price;

public class Latte extends MainCoffee implements MainCoffeeInterface {

    private static String name = "Latte   ";
    private static String description = "Is a coffee drink made with espresso and steamed milk";

    private static Boolean sugar = false;
    private static String syrup = "No syrup";
    private static Double price;

    public void setSugar(Boolean sugar) {
        Latte.sugar = sugar;
    }

    public void setSyrup(String syrup) {
        Latte.syrup = syrup;
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

    public Latte(Double price) {
        this.price = price;
    }
    public Latte() {
    }


}
