import java.util.Scanner;

public class Exercise4 {

    public static float convertCelciusToFahrenheit(float temper) {
        return (9 * temper) / 5 + 32;
    }

    public static float convertFahrenheitToCelcius(float temper) {
        return (5 * (temper - 32)) / 9;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 to convert Celcius to Fahrenheit.");
        System.out.println("Press 2 to convert Fahrenheit to Celcius.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        if (choice != 1 && choice != 2) {
            System.out.println("Your choice is invalid.");
        }
        else {
            System.out.print("Enter the temperature you want to convert: ");
            float temper = sc.nextFloat();
            if (choice == 1) {
                System.out.println(temper + " degrees Celcius after convert to Fahrenheit = " + convertCelciusToFahrenheit(temper) + " degrees Fahrenheit.");
            }
            else if (choice == 2) {
                System.out.println(temper + " degrees Fahrenheit after convert to Celcius = " + convertFahrenheitToCelcius(temper) + " degress Celcius.");
            }
        }
        sc.close();
    }
}