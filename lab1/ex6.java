import java.util.Scanner;
public class ex6 {
    public static int max (int a, int b, int c){
        if (a > b & a > c){
            return a;
        }
        else if ( b > a & b > c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println("So lon nhat la " + max(a,b,c));
    }
}
