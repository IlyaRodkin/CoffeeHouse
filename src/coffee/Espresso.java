package coffee;

import main.Price;

public class Espresso extends MainCoffee implements MainCoffeeInterface {

    private static final String name = "Espresso";
    private static final String description = "Is a coffee-making method of Italian origin, in which a small amount of nearly boiling water\nis forced under pressure (expressed) through finely-ground coffee beans";
    private  Boolean sugar = false;
    private  String syrup = "No syrup";
    private  Double price;

    public void setSugar(Boolean sugar) {
        this.sugar = sugar;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getSugar() {
        if (sugar) return "yes";
        else return "no";
    }

    public String getSyrup() {
        return syrup;
    }

    public Double getPrice() {
        return price;
    }

    public Espresso() {
        this.price = Price.getPriceEspresso();
    }

}
