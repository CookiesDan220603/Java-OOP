import java.util.*;

public class Lab3Ex1 {
    public static boolean removeFirstSpecificElement(int arr[], int numberElements, int key) {
        int[] checkRemove = new int[numberElements + 1];
        for (int i = 0; i < numberElements; i++) {
            if (key == arr[i]) {
                checkRemove[i] = -1;
                break;
            }
        }
        for (int i = 0; i < numberElements; i++) {
            if (checkRemove[i] == -1) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < numberElements; i++) {
            if (key == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void insertElement(int arr[], int numberElements, int elementInserted, int index) {
        int[] tempArray = new int[numberElements];
        for (int i = 0; i < numberElements; i++) {
            tempArray[i] = arr[i];
        }
        for (int i = 0; i < numberElements; i++) {
            if (i == index) {
                for (int j = i + 1; j < numberElements; j++) {
                    arr[j] = tempArray[j - 1];
                }
                arr[i] = elementInserted;
            }
        }
    }

    public static void findDuplicateValue(int arr[], int numberElements) {
        int[] checkVisited = new int[numberElements];
        for (int i = 0; i < numberElements; i++) {
            for (int j = i + 1; j < numberElements; j++) {
                if (arr[i] == arr[j]) {
                    if (checkVisited[i] == -1) {
                        continue;
                    }
                    System.out.print(arr[i] + " ");
                    checkVisited[j] = -1;
                }
            }
        }
    }

    public static void removeDuplicateValue(int arr[], int numberElements) {
        int[] checkDuplicate = new int[numberElements];
        for (int i = 0; i < numberElements; i++) {
            for (int j = i + 1; j < numberElements; j++) {
                if (arr[i] == arr[j]) {
                    checkDuplicate[j] = -1;
                }
            }
        }
        for (int i = 0; i < numberElements; i++) {
            if (checkDuplicate[i] != -1) {
                System.out.print(arr[i] + " ");
            }
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
        System.out.print("Enter the element you want to delete: ");
        int key = sc.nextInt();
        System.out.println("Array before delete specific element: ");
        for (int i = 0; i < numberElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array after delete element " + key + " :");
        boolean ans = removeFirstSpecificElement(arr, numberElements, key);
        System.out.println(ans);
        System.out.print("Enter the value you want to insert: ");
        int elementInserted = sc.nextInt();
        System.out.print("Enter position you want to insert: ");
        int index = sc.nextInt();
        System.out.println("Array after insert:");
        insertElement(arr, numberElements, elementInserted, index);
        for (int i = 0; i < numberElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Duplicate value in Array is: ");
        findDuplicateValue(arr, numberElements);
        System.out.println();
        System.out.print("Array after delete duplicate value: ");
        removeDuplicateValue(arr, numberElements);
        System.out.println();
        System.out.println("--- *** ---");
        sc.close();
    }
}
