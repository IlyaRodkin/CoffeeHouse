package cake;

import main.Price;

public class Caramel extends MainCake {

    private static String name = "Caramel cake";
    private static String description = "Just a cake with caramel";
    private static Integer calories = 401;
    private static Integer weight = 120;
    private static Double price;

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

    public Caramel(Double price) {

    }

    public Caramel() {
        this.price = Price.getPriceCaramel();
    }
}
