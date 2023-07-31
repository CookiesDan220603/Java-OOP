import java.util.Scanner;
public class ex10 {
    public static void thirdLargestNumber ( int arr[], int n)
    {
        int first = arr[0];
        for (int i = 1;i < n ; i++)
            if (arr[i] > first)
                first = arr[i];
    
        // Find second
        // largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0; i <n ; i++)
            if (arr[i] > second &&
                arr[i] < first)
                second = arr[i];
    
        // Find third
        // largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n ; i++)
            if (arr[i] > third &&
                arr[i] < second)
                third = arr[i];
    
        System.out.printf("The third Largest " +
                    "element is %d\n", third);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int intArray[] = new int[1000];
        int n = sc.nextInt();
        for (int i =0;i < n;i ++)
        {
            System.out.println("Nhap phan tu thu : " + i);
            intArray[i] = sc.nextInt();
        }
        thirdLargestNumber(intArray, n);
        sc.close();
        
    }
}
