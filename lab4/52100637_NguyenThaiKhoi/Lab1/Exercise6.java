import java.util.Scanner;

public class Exercise6 {
    public static float findMinimum(float a, float b, float c) {
        if (a <= b && a <= c) {
            return a;
        }
        else if (b <= c) {
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a: ");
        float a = sc.nextFloat();
        System.out.print("Enter number b: ");
        float b = sc.nextFloat();
        System.out.print("Enter number c: ");
        float c = sc.nextFloat();
        System.out.println("Minimum of three numbers is: " + findMinimum(a, b, c));
        sc.close();
    }
}
