package main;

import cake.MainCake;
import coffee.MainCoffee;
import tea.MainTea;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CafeLogic {
    public static final String YOU_ARE_WELCOME = "\nWelcome to our coffeeHouse, in this place you can taste the best coffee\n";
    public static final String WHAT_DO_YOU_WANT = "What do you want?\n1. Coffee\n2. Tea\n3. Cake\n4. That's all, get receipt";
    public static final String WARNING_INTEGER = "You should write number one, two or three\n";
    public static final String WARNING = "You did something wrong\n";
    public static Receipt receipt = new Receipt();
    public static int consoleIn(){
        String num = null;
        try {
            num = new Scanner(System.in).nextLine();
        } catch (Exception e) {
            System.out.println(WARNING);
        }
        Pattern numPattern = Pattern.compile("[1-5]");
        Matcher numMatcher = numPattern.matcher(num);
        if(numMatcher.find()){
            return Character.getNumericValue(num.charAt(numMatcher.start()));
        } else{
            System.out.println(WARNING_INTEGER + WHAT_DO_YOU_WANT);
            return 0;
        }
    }

    public static void menuCafe(){
        System.out.println(CafeLogic.WHAT_DO_YOU_WANT);
        int num = 0;
        while (num == 0) num = consoleIn();
        switch (num){
            case 1:
                MainCoffee.getSetOfCoffee();
                MainCoffee.chooseCoffee();
                break;
            case 2:
                MainTea.getSetOfTea();
                MainTea.chooseTea();
                break;
            case 3:
                MainCake.getSetOfCake();
                MainCake.chooseCake();
                break;
            case 4:
                receipt.getReceipt();
                break;
            default:
                System.out.println(WARNING_INTEGER + WHAT_DO_YOU_WANT);
                menuCafe();
                break;
        }
    }
}
