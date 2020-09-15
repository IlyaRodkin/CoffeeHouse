package tea;

import main.Price;

public class BlackTea extends MainTea implements MainTeaInterface {

    private static final String name = "Black tea";
    private static final String description = "Black tea is a true tea that comes from the Camellia sinensis plant";
    private Boolean sugar = false;
    private Boolean ice = false;
    private Double price;


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
        this.sugar = sugar;
    }

    public void setIce(Boolean ice) {
        this.ice = ice;
    }

    public BlackTea() {
        this.price = Price.getPriceBlackTea();
    }
}
