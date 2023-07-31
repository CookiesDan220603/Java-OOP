import java.util.Scanner;

public class Lab2Ex1 {

    public static int FindMaxOfArray(int arr[], int numberElements) {
        int Max_value = arr[0];
        for (int i = 0; i < numberElements; i++) {
            if (arr[i] > Max_value) {
                Max_value = arr[i];
            }
        }
        return Max_value;
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in array: ");
        int numElement = sc.nextInt();
        for (int i = 0; i < numElement; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum value of array is: " + FindMaxOfArray(arr, numElement));
        sc.close();
        System.out.println("--- *** ---");
    }
}
