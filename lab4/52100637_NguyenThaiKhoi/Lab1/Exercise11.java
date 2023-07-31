import java.util.Scanner;

public class Exercise11 {
    public static int countDigits(int num) {
        int count = 0;
        if (num == 0) {
            return 1;
        }
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to count digit: ");
        int num = sc.nextInt();
        sc.close();
        int digits = countDigits(num);
        System.out.println("The number you just entered has " + digits + " digits.");
    }
}
