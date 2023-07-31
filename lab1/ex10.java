public class ex10 {
    public static int sum(int n){
        int sum = 0;
        sum += n%10;
        while(n > 10)
        {
            n = n/10;
        }
        return sum += n;

    }
    public static void main(String[] args) {
        System.out.println("Sum first and last degit is : "+ sum(12345));
    }
}
