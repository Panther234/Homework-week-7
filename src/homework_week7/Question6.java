package homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Question6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        System.out.println(a + " is " + (a % 2 == 0 ? "even" : "odd")); // ternary operator used
        in.close();//scanner closed
    }
}
