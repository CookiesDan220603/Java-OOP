import java.util.Scanner;

public class Exercise7 {

    public static boolean checkAlphanumeric(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <='Z') || (c >= '0' && c <= '9'));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character you want to check: ");
        char c = sc.next().charAt(0);
        if (checkAlphanumeric(c)) {
            System.out.println(c + " is an anphanumeric.");
        }
        else {
            System.out.println(c + " is not an anphanumeric.");
        }
        sc.close();
    }
}
