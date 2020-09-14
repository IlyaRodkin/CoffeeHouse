package tea;

public class BlackTea extends MainTea implements MainTeaInterface {
    private static String name = "Black tea";
    private static String description = "Black tea is a true tea that comes from the Camellia sinensis plant";

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
        BlackTea.sugar = sugar;
    }

    public void setIce(Boolean ice) {
        BlackTea.ice = ice;
    }

    public BlackTea(Double price) {
        BlackTea.price = price;
    }

    public BlackTea() {
    }
}
