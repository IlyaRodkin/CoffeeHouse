package cake;

import main.Price;

public class Chocolate extends MainCake {

    private String name = "Chocolate cake";
    private String description = "Cake with chocolate";
    private Integer calories = 482;
    private Integer weight = 130;
    private Double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Integer getCalories() {
        return calories;
    }

    public Integer getWeight() {
        return weight;
    }

    public Double getPrice() {
        return price;
    }

    public Chocolate() {
        this.price = Price.getPriceChocolate();
    }
}
