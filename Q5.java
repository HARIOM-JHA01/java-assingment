// Q5) Write a program in Java to check whether a number is prime or not.
import java.util.Scanner;
class Q5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. : ");
        int n = sc.nextInt();

        for(int i = 2; i < n-1; i++) {
            if(n % i == 0) {
                System.out.println(n + " is not a prime number.");
                return;
            }
        }
        System.out.println(n + " is a prime number.");
    }
}