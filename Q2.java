// Q2) Write a program in Java to accept two numbers from the user and then add them and print the sum.
import java.util.Scanner;
class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no. : ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no. : ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of " + a + " and " + b + " is " + sum+ ".");
    }
}