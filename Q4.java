// Q4) Write a program in Java to find the area and perimeter of a circle where radius is taken from user.
import java.util.Scanner;
class Q4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius(in cm) : ");
        double radius = sc.nextFloat();

        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.print("Radius : " + radius+"\nArea : " + area + "\nPerimeter : " + perimeter);
    }
}