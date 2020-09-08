package tea;

import coffee.American;
import coffee.Espresso;
import coffee.Latte;
import coffee.Raff;

public abstract class MainTea {

    private Double price;
    private Integer sugar;
    private Integer syrup;
    private Boolean ice;

    public MainTea(Double price, Integer sugar, Integer syrup, Boolean ice) {
        this.price = price;
        this.sugar = sugar;
        this.syrup = syrup;
        this.ice = ice;
    }

    public  Double getPrice() {
        return price;
    }

    public  Integer getSugar() {
        return sugar;
    }

    public  Integer getSyrup() {
        return syrup;
    }

    public  Boolean getIce() {
        return ice;
    }

    public static void getSetOfTea() {
        System.out.println("Today we have\n1. " + BlackTea.getNAME() + "\n2. " + FruitTea.getNAME()
                + "\n3. " + GreenTea.getNAME() + "\n4. " + MintTea.getNAME());
    }
}
