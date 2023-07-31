import java.util.*;
public class Exercise01{
    public static void main(String[] args) {
        Vector<Integer> x=new Vector<Integer>();
        x.add(123);
        x.add(2);
        x.add(1);
        x.add(5);
        Vector<Integer> y=new Vector<Integer>();
        for(int x0:x){
            y.add(2*x0*x0+1);
        }
        for(int y0:y){
            System.out.println(y0);
        }
    }
}