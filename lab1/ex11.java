public class ex11 {
    public static int count (int n){
        int count = 0;
        while (n != 0)
        {
            count ++;
            n /=10;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count of n is : "+ count(12345));
    }
    
}
