package coffee;

import main.CafeLogic;
import main.Price;

import java.util.Scanner;

public abstract class MainCoffee implements MainCoffeeInterface {

    public static final String GET_MORE_INFO = "\n1. get description\n2. Buy\n3. add sugar\n4. add syrup\n5. choose another one\n\n";

    public static void getSetOfCoffee() {
        System.out.println("Today we have, so what do you want?\n1. " + new Espresso().getName() + "\n2. " + new American().getName()
                + "\n3. " + new Latte().getName() + "\n4. " + new Raff().getName() + "\n5. choose another one");
    }

    public static void chooseCoffee() {
        int num = 0;
        while (num == 0) num = CafeLogic.consoleIn();
        switch (num) {
            case 1:
                Espresso espresso = new Espresso();
                System.out.printf(espresso.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceEspresso());
                buyCoffee(espresso);
                break;
            case 2:
                American american = new American();
                System.out.printf(american.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceAmerican());
                buyCoffee(american);
                break;
            case 3:
                Latte latte = new Latte();
                System.out.printf(latte.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceLatte());
                buyCoffee(latte);
                break;
            case 4:
                Raff raff = new Raff();
                System.out.printf(raff.getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceRaff());
                buyCoffee(raff);
                break;
            case 5:
                CafeLogic.menuCafe();
                break;
        }
    }

    public static <T extends MainCoffee & MainCoffeeInterface> void buyCoffee(T cof) {
        int num = 0;
        while (num == 0) num = CafeLogic.consoleIn();
        switch (num) {
            case 1:
                System.out.println(cof.getDescription());
                buyCoffee(cof);
                break;
            case 2:
                CafeLogic.receipt.buyCoffeeReceipt(cof);
                System.out.println("Done!");
                CafeLogic.menuCafe();
                break;
            case 3:
                cof.setSugar(true);
                System.out.println("You added sugar!");
                buyCoffee(cof);
                break;
            case 4:
                System.out.println("\nWhat syrup do you want?\n");
                cof.setSyrup(new Scanner(System.in).nextLine());
                System.out.println("You added Syrup!");
                buyCoffee(cof);
                break;
            case 5:
                getSetOfCoffee();
                chooseCoffee();
                break;
        }
    }
}
