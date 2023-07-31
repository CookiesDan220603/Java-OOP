import java.util.Scanner;
public class ex6 {
    public static int find(int array[], int k)
    {
        int index = 0;
        int n = array.length;
        for (int i =0;i<n;i++ )
        {
            if (array[i] == k)
            {
                index = i;
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int intArray[] = new int[1000];
        System.out.println("Nhap so luong phan tu :");
        int n = sc.nextInt();
        for (int i =0;i<n;i++)
        {
            System.out.println("Nhap phan tu thu " + i);
            intArray[i] = sc.nextInt();
        }
        System.out.println("Nhap phan tu k de tim:");
        int k = sc.nextInt();
        System.out.println("Phan tu k nam o vi tri " + find(intArray, k));
        sc.close();
    }
}
