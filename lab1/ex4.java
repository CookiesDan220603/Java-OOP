import java.util.Scanner;
public class ex4 {
    public static int ftoc (int n){
        n = (n - 32)*9/5;
        return n;
    }
    public static int ctof (int n){
        n = (n*9/5) + 32;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println("f - c = " + ftoc(n));
        System.out.println("c - f = " + ctof(n));
    }
}
