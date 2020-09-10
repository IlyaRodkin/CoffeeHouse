package cake;

import coffee.American;
import coffee.Espresso;
import coffee.Latte;
import coffee.Raff;

public abstract class MainCake {

    private  Double price;
    private  Integer calories;
    private  Integer weight;

    public MainCake(Double price, Integer calories, Integer weight) {
        this.price = price;
        this.calories = calories;
        this.weight = weight;
    }

    public  Double getPrice() {
        return price;
    }

    public  Integer getCalories() {
        return calories;
    }

    public  Integer getWeight() {
        return weight;
    }

    public static void getSetOfCake() {
        System.out.println("Today we have, so what do you want?\n1. " + Caramel.getNAME() + "\n2. " + CheeseCake.getNAME()
                + "\n3. " + Chocolate.getNAME());
    }

}
