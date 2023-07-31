import java.util.Scanner;

public class Lab2Ex3 {

    public static int SumOfEvenNumbers(int arr[], int numberElements) {
        int Sum = 0;
        for (int i = 0; i < numberElements; i++) {
            if (arr[i] % 2 == 0) {
                Sum += arr[i];
            }
        }
        return Sum;
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the number of elements in Array: ");
        int numberElements = sc.nextInt();
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Sum of all even elements of Array is: " + SumOfEvenNumbers(arr, numberElements));
        System.out.println("--- *** ---");
        sc.close();
    }
}
