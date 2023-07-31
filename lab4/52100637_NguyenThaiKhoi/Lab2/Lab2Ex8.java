import java.math.BigDecimal;
import java.util.Scanner;

public class Lab2Ex8 {

    public static BigDecimal findMax(BigDecimal[] arr, int numberElements) {
        BigDecimal maxValue = arr[0];
        for (int i = 0; i < numberElements; i++) {
            maxValue = maxValue.max(arr[i]);
        }
        return maxValue;
    }
    public static void main(String[] args) {
        BigDecimal[] arr = new BigDecimal[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in Array: ");
        int numberElements = sc.nextInt();
        for (int i = 0; i < numberElements; i++) {
            System.out.print("Enter the " + (i + 1) + " element: ");
            arr[i] = sc.nextBigDecimal();
        }
        sc.close();
        System.out.print("The maximum value in BigDecimal array: " + findMax(arr, numberElements));
    }
}