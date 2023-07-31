import java.util.Scanner;
import java.util.Vector;

public class Test {
    public static void input(Vector<Integer> x){
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap so phan tu:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Nhap phan tu thu "+i);
            a=sc.nextInt();
            x.add(a);
        }
        sc.close();
    }
    public static void output(Vector<Integer> x){
        for(int a: x){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        Vector<Integer> x=new Vector<Integer>();
        input(x);
        output(x);
    }
}
