import java.util.Scanner;

public class Exercise14 {

    public static boolean checkCount(int count) {
        return count > 0 ? true : false;
    }

    public static int calMoney(int user_money, int num, int count_item) {
        int coca_price = 2;
        int pepsi_price = 3;
        int sprite_price = 2;
        int snack_price = 1;
        int remainder = 0;
        switch (num) {
            case 1: 
                remainder = user_money - (coca_price * count_item);
                break;
            case 2:
                remainder = user_money - (pepsi_price * count_item);
                break;
            case 3: 
                remainder = user_money - (sprite_price * count_item);
                break;
            case 4:
                remainder = user_money - (snack_price * count_item);
                break;
        }
        if (remainder < 0) {
            return -1;
        }
        else {
            return remainder;
        }
    }

    public static void vendingMachine() {
        Scanner sc = new Scanner(System.in);
        int user_money = 0;
        int count_item = 0;
        int num;
        do {
            System.out.println("1. Coca" + '\n' + "2. Pepsi" + '\n' + "3. Sprite" + '\n' + "4. Snack" + '\n' + "5. Shutdown Machine");
            System.out.println("--- *** ---");
            System.out.print("Enter the number you want: ");
            num = sc.nextInt();
            System.out.println("--- *** ---");
            
            while (num < 1 || num > 5) {
                System.out.print("The number you enter is invalid, please enter again: ");
                num = sc.nextInt();
                System.out.println("--- *** ---");
            }
    
            if (num == 5) {
                System.out.println("Machine is shutting down @@.");
                System.out.println("--- *** ---");
                break;
            }
            else {
                switch (num) {
                    case 1: 
                        System.out.println("The price of Coca is 2$.");
                        break;
                    case 2: 
                        System.out.println("The price of Pepsi is 3$.");
                        break;
                    case 3:
                        System.out.println("The price of Sprite is 2$.");
                        break;
                    case 4:
                        System.out.println("The price of Snack is 1$.");
                        break;
                }
                System.out.println("--- *** ---");
                System.out.print("Enter the number of products you want: ");
                count_item = sc.nextInt();
                System.out.println("--- *** ---");
                while (checkCount(count_item) == false) {
                    System.out.print("The number of products you enter is invalid, please enter again: ");
                    count_item = sc.nextInt();
                }
                System.out.print("Enter the amount you put into the machine: ");
                user_money = sc.nextInt();
                System.out.println("--- *** ---");
                if (calMoney(user_money, num, count_item) == -1) {
                    System.out.println("You don't have enough money, please choose another products.");
                    System.out.println("--- *** ---");
                }
                else {
                    System.out.printf("Purchase successful, your remainding amount is: %d$\n", calMoney(user_money, num, count_item));
                    System.out.println("--- *** ---");
                }
            }
        } while (num != 5);
        sc.close();
    }
    public static void main(String[] args) {
        //System.out.println("1. Coca" + '\n' + "2. Pepsi" + '\n' + "3. Sprite" + '\n' + "4. Snack" + '\n' + "5. Shutdown Machine");
        vendingMachine();
    }
}
