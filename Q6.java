// Q6) Write a program in Java to check whether a year is leap year or not.
import java.util.*;
class Q6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year : ");
        int year = sc.nextInt();

        if(year % 400 == 0) {
            // leap year
            System.out.println(year + " is a leap year.");
        } else if(year % 100 == 0) {
            // not leap year
            System.out.println(year + " is not a leap year.");
        } else if(year % 4 == 0) {
            // leap year
            System.out.println(year + " is a leap year.");
        } else {
            // not leap year
            System.out.println(year + " is not a leap year.");
        }
    }
}