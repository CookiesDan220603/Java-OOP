import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int height = sc.nextInt();
        int area = base*height/2;
        sc.close();
        System.out.println("Area = "+ (area));
    }
}
