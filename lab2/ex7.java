import java.util.Scanner;
public class ex7 {
    public static void square(int array[], int n)
    {
        for (int i =0;i<n;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for (int i =0;i<n;i++)
        {
            array[i] *= array[i];
        }
        for (int i =0;i<n;i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int intArray[] = new int[1000];
        int n = sc.nextInt();
        for (int i =0;i<n;i++)
        {   
            System.out.println("Nhap phan tu thu " + i);
            intArray[i] = sc.nextInt();
        }
        square(intArray, n);
        sc.close();
    }
}
