import java.util.*;

public class Lab3Ex4 {

    public static int countWordsInString(String str) {
        int count = 0;
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.split(" ");
        count = words.length;
        return count;
    }

    public static void concatenateString(String firstString, String secondString) {
        String ansString = firstString.concat(" " + secondString);
        System.out.println(ansString);
    }

    public static boolean checkPalindromeString(String str) {
        String reverseString = new StringBuffer(str).reverse().toString();
        if (reverseString.compareTo(str) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Length of the string: " + str.length());
        System.out.println("The number of words in string: " + countWordsInString(str));
        System.out.print("Enter the first string: ");
        String firstString = sc.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = sc.nextLine();
        System.out.println("After concatenate first string with second string: ");
        concatenateString(firstString, secondString);
        System.out.print("Enter the string you want to check palindrome: ");
        String thirdString = sc.nextLine();
        if (checkPalindromeString(thirdString) == true) {
            System.out.println("The string you just entered is a Palimdrome String");
        }
        else {
            System.out.println("The string you just entered is not a Palimdrome String");
        }
        sc.close();
    }
}
