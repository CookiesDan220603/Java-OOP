import java.util.Scanner;

public class Lab2Ex5 {

    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int numberElements = sc.nextInt();
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < numberElements; i++) {
            if (checkPrime(arr[i]) == true) {
                count++;
            }
        }
        System.out.println("The number of primes in the array is: " + count);
        System.out.println("--- *** ---");
        sc.close();
    }
}
