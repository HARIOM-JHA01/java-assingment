// Q7) Write a program in Java to generate the prime numbers between a range (user input).
import java.util.Scanner;
class Q7 {
    public static boolean isPrime(int n) {
        if(n<3) {
            return true;
        }
        for(int i = 2; i < n-1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range(low) : ");
        int l = sc.nextInt();
        System.out.print("Enter range(high) : ");
        int r = sc.nextInt();

        for(int i = l; i < r+1; i++ ) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number.");
            }
            else {
                continue;
            }
        }
    }
}