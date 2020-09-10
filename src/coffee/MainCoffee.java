package coffee;

import com.sun.tools.javac.Main;

public abstract class MainCoffee {

    private  Double price;
    private  Integer sugar;
    private  Integer syrup;
    private  Integer grainType;

    public MainCoffee(Double price, Integer sugar, Integer syrup, Integer grainType) {
        this.price = price;
        this.sugar = sugar;
        this.syrup = syrup;
        this.grainType = grainType;
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

    public  Integer getGrainType() {
        return grainType;
    }

    public static void getSetOfCoffee() {
    System.out.println("Today we have, so what do you want?\n1. " + Espresso.getNAME() + "\n2. " + American.getNAME()
                        + "\n3. " + Latte.getNAME() + "\n4. " + Raff.getNAME());
    }
    
    public static void chooseCoffee(){
        int num = 0;
        num =  main.consoleIn();
        while (num == 0) ;
        switch (num){
            case 1:
            case 2:
            case 3:
            case 4:
        }
    }

}
