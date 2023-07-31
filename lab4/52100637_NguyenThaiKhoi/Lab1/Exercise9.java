import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        do {
            if (n % 2 == 0) {
                System.out.println(n + " is even, so we take n/2: " + n / 2);
                n /= 2;
            }
            else {
                System.out.println(n + " is odd, so we take 3*n + 1: " +  (3*n + 1));
                n = 3 * n + 1;
            }
        } while (n != 1);
    }
}
