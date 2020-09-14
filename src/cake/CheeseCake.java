package cake;

import main.Price;

public class CheeseCake extends MainCake {

    private String name = "Cheesecake\t";
    private String description = "Sweet dessert consisting of one or more layers";
    private Integer calories = 321;
    private Integer weight = 100;
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

    public CheeseCake() {
        this.price = Price.getPriceCheeseCake();
    }

}
