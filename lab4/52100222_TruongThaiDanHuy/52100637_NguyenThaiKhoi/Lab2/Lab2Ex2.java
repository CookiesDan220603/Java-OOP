import java.util.Scanner;

public class Lab2Ex2 {

    public static int FindMinOfArray(int arr[], int numberElements) {
        int Min_value = arr[0];
        for (int i = 0; i < numberElements; i++) {
            if (arr[i] < Min_value) {
                Min_value = arr[i];
            }
        }
        return Min_value;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int numElement = sc.nextInt();
        for (int i = 0; i < numElement; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("The minimum value of Array is: " + FindMinOfArray(arr, numElement));
        System.out.println("--- *** ---");
    }
}
