import java.util.Scanner;

public class main {
    private static String YOU_ARE_WELCOME = "Welcome to our coffeeHouse, in this place you can taste the best coffee\n";
    private static String WHAT_DO_YOU_WANT = "What do you want?\n1. Coffee\n2. Tea\n3. Cake\n";
    private static String WARNING_INTEGER = "You should write number one, two or three\n";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(YOU_ARE_WELCOME + WHAT_DO_YOU_WANT);

// &&
        while (true){
            if(!sc.hasNextInt()){
                System.out.println(WARNING_INTEGER + WHAT_DO_YOU_WANT);
                sc.next();
            }
            else if(sc.nextInt() < 4 || sc.nextInt() > 0 ){
                System.out.println(WARNING_INTEGER + WHAT_DO_YOU_WANT);
                sc.next();
            }
            else break;
        }

        int num = sc.nextInt();
        System.out.println("\n"+num);

        switch (num){
            case 1:
            case 2:
            case 3:
        }


    }
}
