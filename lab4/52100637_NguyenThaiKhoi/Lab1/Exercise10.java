import java.util.Scanner;

public class Exercise10 {

    public static int lastDigit(int num) {
        int last_digit = num % 10;
        return last_digit;
    }

    public static int firstDigit(int num) {
        int first_digit = 0;
        while (num != 0) {
            first_digit = num % 10;
            num /= 10;
        }
        return first_digit; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number n: ");
        int num = sc.nextInt();
        sc.close();
        int first_digit = firstDigit(num);
        int last_digit = lastDigit(num);
        System.out.println("The sum of the first digit and the last digit of " + num + " is: " + (first_digit + last_digit));
    }
}
