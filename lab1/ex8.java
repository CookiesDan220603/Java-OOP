

public class ex8 {
    public static int bai8a (int n){
        if (n == 1)
            return 1;
        return n + bai8a(n-1);
    } 
    public static int bai8b (int n){
        if (n == 1)
            return 1;
        return n*bai8b(n-1);
    } 
    public static int bai8c (int n){
        if (n == 0 )
            return 1;
        if (n == 1 )
            return 2;
        return (int)Math.pow(2,n) + bai8c(n -1);
    } 
    public static int bai8d (int n){
        if (n ==1)
            return 1;
        return (int)Math.pow(n,2) + bai8d(n - 1);
    } 
   public static void main(String[] args) {
       System.out.println("Bai 8a : "+ bai8a(8));
       System.out.println("Bai 8b : "+ bai8b(8));
       System.out.println("Bai 8c : "+ bai8c(8));
       System.out.println("Bai 8d : "+ bai8d(8));
   }
}