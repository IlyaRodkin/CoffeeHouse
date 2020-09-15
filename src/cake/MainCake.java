package cake;

import coffee.American;
import coffee.Espresso;
import coffee.Latte;
import coffee.Raff;
import main.CafeLogic;
import main.Price;
import tea.*;

public abstract class MainCake implements MainCakeInterface {

    public static final String GET_MORE_INFO = "\n1. get description\n2. Buy\n3. choose another one\n\n";

    public static void getSetOfCake() {
        System.out.println("Today we have, so what do you want?\n1. " + new Caramel().getName() + "\n2. " + new CheeseCake().getName()
                + "\n3. " + new Chocolate().getName() + "\n4. choose another one");
    }

    public static void chooseCake() {
        int num = 0;
        while (num == 0) num = CafeLogic.consoleIn();
        switch (num) {
            case 1:
                Chocolate chocolate = new Chocolate();
                System.out.printf(chocolate.getName() + "\ncost is %s$" + "\nWeight is %sgr\n" +
                        chocolate.getCalories() + "kcal" + GET_MORE_INFO, Price.getPriceChocolate(), chocolate.getWeight());
                buyCake(chocolate);
                break;
            case 2:
                CheeseCake cheeseCake = new CheeseCake();
                System.out.printf(cheeseCake.getName() + "\ncost is %s$" + "\nWeight is %sgr\n" +
                        cheeseCake.getCalories() + "kcal" + GET_MORE_INFO, Price.getPriceCheeseCake(), cheeseCake.getWeight());
                buyCake(cheeseCake);
                break;
            case 3:
                Caramel caramel = new Caramel();
                System.out.printf(caramel.getName() + "\ncost is %s$" + "\nWeight is %sgr\n" +
                        caramel.getCalories() + "kcal"+ GET_MORE_INFO, Price.getPriceCaramel(), caramel.getCalories());
                buyCake(caramel);
                break;
            case 4:
                CafeLogic.menuCafe();
                break;
            default:
                System.out.println(CafeLogic.WARNING);
                CafeLogic.menuCafe();
                break;
        }
    }

    public static <T extends MainCake & MainCakeInterface> void buyCake(T cake) {
        int num = 0;
        while (num == 0) num = CafeLogic.consoleIn();
        switch (num) {
            case 1:
                System.out.println(cake.getDescription());
                buyCake(cake);
                break;
            case 2:
                CafeLogic.receipt.buyCakeReceipt(cake);
                System.out.println("Done!");
                CafeLogic.menuCafe();
                break;
            case 3:
                getSetOfCake();
                chooseCake();
                break;
            default:
                System.out.println(CafeLogic.WARNING);
                getSetOfCake();
                chooseCake();
                break;
        }
    }


}
