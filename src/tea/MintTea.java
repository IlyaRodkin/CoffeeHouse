package tea;

import main.Price;

public class MintTea extends MainTea implements MainTeaInterface {
    private static final String name = "Mint tea";
    private static final String description = "Mint tea is made from peppermint leaves";
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

    public MintTea() {
        this.price = Price.getPriceMintTea();
    }
}
