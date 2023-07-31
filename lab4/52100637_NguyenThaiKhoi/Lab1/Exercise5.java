import java.util.Scanner;

public class Exercise5 {

    public static boolean checkYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.print("Enter the year you want to check: ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (checkYear(year) == true) {
            System.out.println(year + " is a Leap Year.");
        }
        else {
            System.out.println(year + " is not a Leap Year.");
        }
        sc.close();
    }
}
