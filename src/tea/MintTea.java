package tea;

public class MintTea extends MainTea implements MainTeaInterface {
    private static String name = "Mint tea";
    private static String description = "Mint tea is made from peppermint leaves";

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
        MintTea.sugar = sugar;
    }

    public void setIce(Boolean ice) {
        MintTea.ice = ice;
    }

    public MintTea(Double price) {
        MintTea.price = price;
    }

    public MintTea() {
    }
}
