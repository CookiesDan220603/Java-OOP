import java.util.Scanner;

public class Lab2Ex7 {

    public static void printArray(int arr[], int numberElements) {
        for (int i = 0; i < numberElements; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void square(int arr[], int numberElements) {
        for (int i = 0; i < numberElements; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int numberElements = sc.nextInt();
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Array before square all elements:");
        printArray(arr, numberElements);
        System.out.println("\n Array after square all elements:");
        square(arr, numberElements);
        printArray(arr, numberElements);
        System.out.println("\n --- *** ---");
    }
}
