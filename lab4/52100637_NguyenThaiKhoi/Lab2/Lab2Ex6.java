import java.util.Scanner;

public class Lab2Ex6 {

    public static int find(int arr[], int k, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int numberElements = sc.nextInt();
        int[] arr = new int[100];
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to find index: ");
        int k = sc.nextInt();
        sc.close();
        if (find(arr, k, numberElements) != -1) {
            System.out.printf("The index of element '%d' is %d. \n", k, find(arr, k, numberElements));
        }
        else {
            System.out.println("Element '" + k + "' does not exist in array.");
        }
        System.out.println("--- *** ---");
    }
}
