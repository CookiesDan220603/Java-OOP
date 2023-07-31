import java.math.BigDecimal;
import java.util.Scanner;
public class ex8 {
    public static BigDecimal findMax (BigDecimal array[] , int n)
    {
        int max =  array[0].intValue();
        for (int i =1;i < n; i++)
        {
            if (array[i].intValue() > max)
                max = array[i].intValue();
        }
        return BigDecimal.valueOf(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu :");
        int n = sc.nextInt();
        BigDecimal intArray[] = new BigDecimal[1000];
        for (int i =0;i < n;i++)
        {
            System.out.println("Nhap phan tu thu : " + i);
            intArray[i] = sc.nextBigDecimal();
        }
        System.out.println("Max in array is : " + findMax(intArray, n));
        sc.close();

    }
}
