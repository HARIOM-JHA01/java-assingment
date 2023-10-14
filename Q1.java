// Q1) Write a program in Java to accept the name of the user and then print welcome message.
import java.util.Scanner;
class Q1 {
    public static void main(String args[]) {
        System.out.print("Enter your Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Welcome " + name + ", I am a java program!");
    }
}