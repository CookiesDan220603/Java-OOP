import java.util.*;

public class Lab3Ex3 {

    public static void returnFirstAndLastName(String fullName) {
        String splitFullName[] = fullName.split(" ");
        System.out.println(splitFullName[0] + " " + splitFullName[splitFullName.length - 1]);
    }

    public static void returnMiddleName(String fullName) {
        String splitFullName[] = fullName.split(" ");
        for (int i = 1; i < splitFullName.length - 1; i++) {
            System.out.print(splitFullName[i] + " ");
        }
    }

    public static String CapitalizeFullName(String fullName) {
        String words[] = fullName.split(" ");
        String capitalizeString = "";
        for (String w:words) {
            String first = w.substring(0, 1);
            String afterFirst = w.substring(1);
            capitalizeString += first.toUpperCase() + afterFirst + " ";
        }
        return capitalizeString.trim();
    }

    public static void uppercaseVowelsAndLowercaseAllConsonants(char[] fullName) {
        for (int i = 0; i < fullName.length; i++) {
            if (fullName[i] == 'a' || fullName[i] == 'o' || fullName[i] == 'e' || fullName[i] == 'u' || fullName[i] == 'i') {
                char c = Character.toUpperCase(fullName[i]);
                fullName[i] = c;
            }
        }
        for (char i: fullName)
            System.out.print(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        System.out.print("Your first name and last name is: ");
        returnFirstAndLastName(fullName);
        System.out.print("Your middle name is: ");
        returnMiddleName(fullName);
        System.out.println();
        System.out.print("Enter the name you want to capitalize: ");
        String name = sc.nextLine();
        System.out.println("The name you entered after capitalize: ");
        System.out.println(CapitalizeFullName(name));
        String tempName = fullName.toLowerCase();
        System.out.println("Your name after uppercase all vowels and lowercase all consonants: ");
        uppercaseVowelsAndLowercaseAllConsonants(tempName.toCharArray());
        sc.close();
    }
}
