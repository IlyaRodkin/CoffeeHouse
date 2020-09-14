package tea;

public class FruitTea extends MainTea implements MainTeaInterface {

    private static String name = "Fruit tea";
    private static String description = "Fruit teas are black teas flavoured with a natural essence of fruit";

    private static Boolean sugar = false;
    private static Boolean ice = false;
    private static Double price;


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

    public String getIce() {
        if (ice) return "yes";
        else return "no";
    }

    public Double getPrice() {
        return price;
    }

    public void setSugar(Boolean sugar) {
        FruitTea.sugar = sugar;
    }

    public void setIce(Boolean ice) {
        FruitTea.ice = ice;
    }

    public FruitTea(Double price) {
        FruitTea.price = price;
    }

    public FruitTea() {
    }
}
