public class ex12 {
    public static int reverse (int n){
        int sum =0;
        while(n !=0){
            sum = sum*10 + n%10;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Reverse n is : "+ reverse(12345));
    }
}
