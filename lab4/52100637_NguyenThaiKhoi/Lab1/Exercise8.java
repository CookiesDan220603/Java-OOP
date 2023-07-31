import java.lang.Math;
import java.util.Scanner;

public class Exercise8 {

    public static int ex8a(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int ex8b(int n) {
        int ans = 1;
        for (int i = 1; i <= n; i++) {
            ans *= i;
        }
        return ans;
    }

    public static int ex8c(int n) {
        int ans = 0;
        for (int i = 0; i <= n; i++) {
            ans += Math.pow(2, i);
        }
        return ans;
    }

    public static float ex8d(int n) {
        float ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += (1.0 / (2.0 * i));
        }
        return ans;
    }

    public static int ex8e(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Exercise 8a: " + ex8a(n));
        System.out.println("Exercise 8b: " + ex8b(n));
        System.out.println("Exercise 8c: " + ex8c(n));
        System.out.println("Exercise 8d: " + ex8d(n));
        System.out.println("Exercise 8e: " + ex8e(n));
    }
}
