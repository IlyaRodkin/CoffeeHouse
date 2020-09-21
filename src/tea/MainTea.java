package tea;

import cake.MainCake;
import coffee.*;
import main.CafeLogic;
import main.Price;

import java.util.Scanner;

public abstract class MainTea implements MainTeaInterface {

    public static final String GET_MORE_INFO = "\n1. get description\n2. Buy\n3. add sugar\n4. add ice\n5. choose another one\n\n";

    public static void getSetOfTea() {
        System.out.println("Today we have, so what do you want?\n1. " + new BlackTea().getName() + "\n2. " + new FruitTea().getName()
                + "\n3. " + new GreenTea().getName() + "\n4. " + new MintTea().getName()+ "\n5. choose another one");
    }

    public static void chooseTea() {
        int num = 0;
        while (num == 0) num = CafeLogic.consoleIn();
        switch (num) {
            case 1:
                BlackTea blackTea = new BlackTea();
                System.out.printf(blackTea.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceBlackTea());
                buyTea(blackTea);
                break;
            case 2:
                FruitTea fruitTea = new FruitTea();
                System.out.printf(fruitTea.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceFruitTea());
                buyTea(fruitTea);
                break;
            case 3:
                GreenTea greenTea = new GreenTea();
                System.out.printf(greenTea.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceGreenTea());
                buyTea(greenTea);
                break;
            case 4:
                MintTea mintTea = new MintTea();
                System.out.printf(mintTea.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceMintTea());
                buyTea(mintTea);
                break;
            case 5:
                CafeLogic.menuCafe();
                break;
        }
    }

    public static <T extends MainTea & MainTeaInterface> void buyTea(T tea) {
        int num = 0;
        while (num == 0) num = CafeLogic.consoleIn();
        switch (num) {
            case 1:
                System.out.println(tea.getDescription());
                buyTea(tea);
                break;
            case 2:
                CafeLogic.receipt.buyTeaReceipt(tea);
                System.out.println("Done!");
                CafeLogic.menuCafe();
                break;
            case 3:
                tea.setSugar(true);
                System.out.println("You added sugar!");
                buyTea(tea);
                break;
            case 4:
                tea.setIce(true);
                System.out.println("You added ice!");
                buyTea(tea);
                break;
            case 5:
                getSetOfTea();
                chooseTea();
                break;
        }
    }
}
