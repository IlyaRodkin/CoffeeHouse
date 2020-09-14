package main;

import cake.MainCake;
import coffee.MainCoffee;
import tea.MainTea;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<MainCoffee> receiptOfCoffee = new ArrayList();
    private List<MainTea> receiptOfTea = new ArrayList();
    private List<MainCake> receiptOfCake = new ArrayList();
    private Double sumPrice = 0.;


    public void buyCoffeeReceipt(MainCoffee coffee) {
        receiptOfCoffee.add(coffee);
    }

    public void buyTeaReceipt(MainTea tea) {
        receiptOfTea.add(tea);
    }

    public void buyCakeReceipt(MainCake cake) {
        receiptOfCake.add(cake);
    }

    public void getReceipt() {
        System.out.println("\t\t\t\tRECEIPT");

        if (!receiptOfCoffee.isEmpty()) System.out.println("------------------------------------------\nCoffee\t\tSugar\tSyrup\t\tPrice");

        for (int i = 0; i < receiptOfCoffee.size(); i++) {

            System.out.println(receiptOfCoffee.get(i).getName() + "\t" + receiptOfCoffee.get(i).getSugar()
                    + "\t\t" + receiptOfCoffee.get(i).getSyrup() + "\t" + receiptOfCoffee.get(i).getPrice() + "$");

            sumPrice += receiptOfCoffee.get(i).getPrice();
        }
        if (!receiptOfTea.isEmpty()) System.out.println("\n------------------------------------------\nTea\t\t\tSugar\tIce\t\tPrice\n");

        for (int i = 0; i < receiptOfTea.size(); i++) {

            System.out.println(receiptOfTea.get(i).getName() + "\t" + receiptOfTea.get(i).getSugar()
                    + "\t\t2" + receiptOfTea.get(i).getIce() + "\t\t" + receiptOfTea.get(i).getPrice() + "$");

            sumPrice += receiptOfTea.get(i).getPrice();
        }
        if (!receiptOfCake.isEmpty()) System.out.println("\n------------------------------------------\nCake\t\t\tCalories\tWight\tPrice\n");

        for (int i = 0; i < receiptOfCake.size(); i++) {
            System.out.println(receiptOfCake.get(i).getName() + "\t" + receiptOfCake.get(i).getCalories()
                    + "kcal\t\t" + receiptOfCake.get(i).getWeight() + "gr\t" + receiptOfCake.get(i).getPrice() + "$");

            sumPrice += receiptOfCake.get(i).getPrice();
        }
        System.out.println("\n------------------------------------------\n\t\t\t\t\t\tTotal:  " + new DecimalFormat("#0.0").format(sumPrice) + "$");

    }
}
