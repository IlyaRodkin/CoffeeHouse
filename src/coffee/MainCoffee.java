package coffee;

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
    System.out.println("Today we have\n1. " + Espresso.getNAME() + "\n2. " + American.getNAME()
                        + "\n3. " + Latte.getNAME() + "\n4. " + Raff.getNAME());
    }

}
