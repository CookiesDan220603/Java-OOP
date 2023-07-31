import java.util.Scanner;

public class Lab2Ex10 {
    public static void sortArray(int arr[], int numberElements) {
        for (int i = 0; i < numberElements; i++) {
            for (int j = i + 1; j < numberElements; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.print("Enter the number of elements in Array: ");
        int numberElements = sc.nextInt();
        for(int i = 0; i < numberElements; i++) {
            System.out.print("Enter the " + (i + 1) +" elements: ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        sortArray(arr, numberElements);
        System.out.println("The third largest element in Array is: " + arr[numberElements - 3]);
    }
}
