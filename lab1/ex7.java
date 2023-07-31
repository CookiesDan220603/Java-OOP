import java.util.Scanner;
public class ex7 {
    public static boolean Alphanumeric ( char a){
        boolean k = Character.isLetterOrDigit(a);
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        sc.close();
        if (Alphanumeric(a)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    
}
