import java.util.Scanner;

public class Exercise13 {

    public static boolean checkPalindromeNum(int num) {
        int temp = num;
        int reverseNum = 0, remainder;
        while (temp != 0) {
            remainder = temp % 10;
            reverseNum = reverseNum * 10 + remainder;
            temp /= 10;
        }
        return (num == reverseNum) ? true : false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to check: ");
        int num = sc.nextInt();
        sc.close();
        if (checkPalindromeNum(num) == true) {
            System.out.println(num + " is a Palindrome number");
        }
        else {
            System.out.println(num + " is not a Palindrome number");
        }
    }
}
