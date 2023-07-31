import java.util.Scanner;
public class ex5 {
    public static void check (int n){
        if(n % 4 == 0 & n%100 == 0)
        {
            System.out.println("Nam nhuan");
        }
        else{
            System.out.println("Nam thuong");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        check(n);
    }
}
