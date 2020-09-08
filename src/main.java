import coffee.MainCoffee;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
    private static String YOU_ARE_WELCOME = "Welcome to our coffeeHouse, in this place you can taste the best coffee\n";
    private static String WHAT_DO_YOU_WANT = "What do you want?\n1. Coffee\n2. Tea\n3. Cake\n4. That's all, get receipt";
    private static String WARNING_INTEGER = "You should write number one, two or three\n";
    private static String WARNING = "You did something wrong\n";

    public static void main(String[] args) {

        System.out.println(YOU_ARE_WELCOME + WHAT_DO_YOU_WANT);
        int num = 0;
        Receipt receipt = new Receipt();
        menuCafe(num);
    }
    public static int consoleIn(){
        String num = null;
        try {
            num = new Scanner(System.in).nextLine();
        } catch (Exception e) {
            System.out.println(WARNING);
        }
        Pattern numPattern = Pattern.compile("[1-4]");
        Matcher numMatcher = numPattern.matcher(num);
        if(numMatcher.find()){
            return Character.getNumericValue(num.charAt(numMatcher.start()));
        } else{
            System.out.println(WARNING_INTEGER + WHAT_DO_YOU_WANT);
            return 0;
        }
    }

    public static void menuCafe(int num){
        while (num == 0) num = consoleIn();
        switch (num){
            case 1:
                MainCoffee.getSetOfCoffee();
                consoleIn();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
    }
}
