import java.util.Scanner;
public class ex1 {
    public static int maxarray (int array[], int n)
    {
        int k = array[0];
        for (int i =1;i < n;i ++)
        {
            if (array[i] > k)
                k = array[i];
        }
        return k;
    }
    public static void main(String[] args) {
        int int_array[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu");
        int n = sc.nextInt();
        for (int i = 0; i< n;i++)
        {
            System.out.println("Nhap phan tu thu : " + i);
            int_array[i] = sc.nextInt();
        }
        System.out.println("Max is " + maxarray(int_array , n));
        sc.close();
    }
}
