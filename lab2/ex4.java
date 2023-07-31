import java.util.Scanner;
public class ex4 {
    public static int maxArray (int array[], int n)
    {
        int max = array[0];
        for (int i =1;i <n;i++)
        {
            if (array[i]> max)
                max = array[i];
        }
        return max;
    }
    public static void count (int array[], int n)
    {
        int k = maxArray(array, n);
        int arrayB[] = new int[1000];
        for (int i =0;i<n;i++)
        {
            arrayB[array[i]] ++;
        }
        for (int i =0;i < k; i++)
        {
            if(arrayB[i] != 0)
                System.out.println( i + " Co " + arrayB[i] + " phan tu");
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
        count(int_array, n);


        sc.close();
    }
}
