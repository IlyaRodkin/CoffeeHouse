package coffee;

import cake.MainCake;
import main.CafeLogic;
import main.Price;
import main.Receipt;

import java.util.Scanner;

public abstract class MainCoffee implements MainCoffeeInterface {

    public static final String GET_MORE_INFO = "\n1. get description\n2. Buy\n3. add syrup\n4. add sugar\n5. choose another one\n\n";

    public static void getSetOfCoffee() {
        System.out.println("Today we have, so what do you want?\n1. " + new Espresso().getName() + "\n2. " + new American().getName()
                + "\n3. " + new Latte().getName() + "\n4. " + new Raff().getName() + "\n5. choose another one");
    }

    public static void chooseCoffee() {
        int num = 0;
        while (num == 0) num = CafeLogic.consoleIn();
        switch (num) {
            case 1:
                System.out.printf(new Espresso().getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceEspresso());
                buyCoffee(new Espresso(Price.getPriceEspresso()));
                break;
            case 2:
                System.out.printf(new American().getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceAmerican());
                buyCoffee(new American(Price.getPriceAmerican()));
                break;
            case 3:
                System.out.printf(new Latte().getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceLatte());
                buyCoffee(new Latte(Price.getPriceEspresso()));
                break;
            case 4:
                System.out.printf(new Raff().getName() + "\ncost is %s$" + GET_MORE_INFO, Price.getPriceRaff());
                buyCoffee(new Raff(Price.getPriceEspresso()));
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
