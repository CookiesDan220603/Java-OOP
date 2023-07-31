import java.util.Scanner;

public class Exercise2 {
    public static float findArea(float base, float hight) {
        return  (base * hight) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float base = sc.nextFloat();
        System.out.print("Enter the hight: ");
        float hight = sc.nextFloat();
        sc.close();
        System.out.println("The area of triangle: " + findArea(base, hight));
    }
}
