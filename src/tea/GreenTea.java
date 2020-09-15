package tea;

import main.Price;

public class GreenTea extends MainTea {

    private static final String name = "Green tea";
    private static final String description = "Green tea is a type of tea that is made from Camellia sinensis leaves and buds\n" +
            " that have not undergone the same withering and oxidation process used to make oolong teas and black teas";
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

    public GreenTea() {
        this.price = Price.getPriceGreenTea();
    }
}
