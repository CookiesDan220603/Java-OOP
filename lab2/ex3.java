import java.util.Scanner;
public class ex3 {
    public static int sumarray (int array[], int n)
    {
        int sum =0;
        for (int i =1;i < n;i ++)
        {
            if (array[i]%2 == 0)
                sum += array[i];
        }
        return sum;
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
        System.out.println("Sum all even number " + sumarray(int_array , n));
        sc.close();
    }
}
