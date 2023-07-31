import java.util.Scanner;
public class ex5 {
    public static boolean primeNumber (int k)
    {
        int count = 0;
        for (int i =2;i <= (k/2); i++)
        {
            if (k % i == 0)
                count ++;
        }
        if (count == 0)
            return true;
        else
            return false;

    }
    public static void checkPrime (int array[], int n)
    {
        for (int i =0;i< n ;i++)
        {
            if (primeNumber(array[i]))
                System.out.println(array[i] + " is prime number");
        }
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
        checkPrime(int_array, n);


        sc.close();
    }
}
