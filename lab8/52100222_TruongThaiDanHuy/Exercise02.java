import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
public class Exercise02 {
    public static boolean checkWord(String word1,HashMap<String,String> hashMap){
        Set<String> keySet =hashMap.keySet();
        for(String key:keySet){
            if(word1.equals(key)){
                return true;
            }
        }
        return false;
    }
    public static String findMean(String word1,HashMap<String,String> hashMap){
        Set<String> keySet =hashMap.keySet();
        for(String key:keySet){
            if(word1.equals(key)){
                return hashMap.get(key);
            }
        }
        return "";
    }
    public static void main(String[] args) {
         HashMap<String,String> w=new HashMap<String,String>();
         w.put("Hi","Chào");
         w.put("dog","Chó");
         w.put("cat","mèo");
         w.put("bitch","con chó cái");
         w.put("go","đi");
         w.put("wish","ước");
         w.put("hand","đôi bàn tay");
         w.put("leg","chân");

         Scanner sc= new Scanner(System.in);
         System.out.println("Nhap tu can tim:");
         String word=sc.nextLine();
         if(checkWord(word,w)){
             System.out.println("Từ nằm trong từ điển");
         }
         else{
             System.out.println("Từ không nằm trong từ điểm");
         }
         System.out.println("Nghĩa tiếng việt của từ là:"+ findMean(word,w));

    }
}
