import java.util.Scanner;

public class Exercise12 {

    public static int reverseIntNum(int num) {
        int remainder, reversenum = 0;
        while (num != 0) {
            remainder = num % 10;
            reversenum = reversenum * 10 + remainder;
            num /= 10;
        }
        return reversenum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse: ");
        int num = sc.nextInt();
        sc.close();
        System.out.println(num + " after reversed: " + reverseIntNum(num)); 
    }
}
