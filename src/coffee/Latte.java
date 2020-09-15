package coffee;

import main.Price;

public class Latte extends MainCoffee implements MainCoffeeInterface {

    private static final String name = "Latte   ";
    private static final String description = "Is a coffee drink made with espresso and steamed milk";
    private Boolean sugar = false;
    private String syrup = "No syrup";
    private Double price;

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


    public Latte() {
        this.price = Price.getPriceLatte();
    }


}
