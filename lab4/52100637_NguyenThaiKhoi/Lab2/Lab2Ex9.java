import java.util.Scanner;

public class Lab2Ex9 {
    public static void divisibleNumbers(int arr[], int k, int numberElements) {
        int count = 0;
        for (int i = 0; i < numberElements; i++) {
            if (arr[i] % k == 0) {
                count++;
                
            }
        }
        int[] ansArray = new int[count + 1];
        int j = 0;
        for (int i = 0; i < count; i++) {
            while (j <= numberElements) {
                if (arr[j] % k == 0) {
                    ansArray[i] = arr[j];
                    j++;
                    break;
                }
                else {
                    j++;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.print(ansArray[i] + " ");
        }
    }

    public static void main(String[] agrs) {
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int numberElements = sc.nextInt();
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        sc.close();
        System.out.println("The elements which divisible by " + k + " in Array:");
        divisibleNumbers(arr, k, numberElements);
    }

}
 