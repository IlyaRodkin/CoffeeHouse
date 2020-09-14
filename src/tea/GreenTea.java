package tea;

public class GreenTea extends MainTea {

    private static String name = "Green tea";
    private static String description ="Green tea is a type of tea that is made from Camellia sinensis leaves and buds\n" +
            " that have not undergone the same withering and oxidation process used to make oolong teas and black teas";

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
        GreenTea.sugar = sugar;
    }

    public void setIce(Boolean ice) {
        GreenTea.ice = ice;
    }

    public GreenTea(Double price) {
        GreenTea.price = price;
    }

    public GreenTea() {
    }
}
