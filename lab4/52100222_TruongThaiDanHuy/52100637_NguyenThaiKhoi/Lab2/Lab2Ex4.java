import java.util.Scanner;

public class Lab2Ex4 {

    public static int CountSpecificElement(int arr[], int numberElements, int key) {
        int count = 0;
        for (int i = 0; i < numberElements; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
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
        System.out.print("Enter the element your want to count: ");
        int keyWord = sc.nextInt();
        if (CountSpecificElement(arr, numberElements, keyWord) == 0) {
            System.out.println("The elenment '" + keyWord + "' does not exist in the array.");
        }
        else {
            System.out.println("The element '" + keyWord + "' appears " + CountSpecificElement(arr, numberElements, keyWord) + " times in Array.");
        }
        System.out.println("--- *** ---");
        sc.close();
    }
}