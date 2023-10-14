// Q3) Write a program in Java to convert temperature from Celsius to Fahrenheit scale.
import java.util.Scanner;
class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperatur(in celcius) : ");
        float cel = sc.nextFloat();

        float far = (cel * 9) / 5;
        far += 32;

        System.out.print("Celcius : " + cel + "\nFahrenheit : " + far);
    }
}