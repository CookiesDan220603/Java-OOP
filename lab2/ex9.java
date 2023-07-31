import java.util.Scanner;
public class ex9 {
    public static void divisibleNumbers(int arr[], int n, int k)
    {
        int arrB[] = new int[1000];
        int j =0;
        for (int i =0;i < n; i++)
        {
            if (arr[i] % k ==0)
            {
                arrB[j] = arr[i];
                j++;
            }
        }
        for (int i =0;i < j;i++)
        {
            System.out.print(arrB[i] + " ");
        }
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
        System.out.println("Nhap phan tu k :");
        int k = sc.nextInt();
        sc.close();
        divisibleNumbers(intArray, n, k);
    }
}
