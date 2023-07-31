import java.util.Scanner;

public class Exercise3 {

    public static int returnRemainder(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = sc.nextInt();
        System.out.print("Enter number b: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("The remainder of a divided by b is: " + returnRemainder(a, b));
    }
}
