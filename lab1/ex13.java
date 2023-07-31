public class ex13 {
    public static void reverse (int n){
        int sum =0;
        int k = n;
        while(n !=0){
            sum = sum*10 + n%10;
            n/=10;
        }
        if (k == sum)
            System.out.println("n is palindrome");
        else
            System.out.println("n is not palindrome");
    }
    public static void main(String[] args) {
        reverse(123454321);
    }
}
