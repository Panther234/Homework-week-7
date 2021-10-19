package homework_week7;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */

public class Question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // new Scanner(System.in) created
        System.out.print("Enter number: "); // Prompt entering of number
        int a = in.nextInt(); // Get input number
        System.out.println(a % 2 == 0 ? "Even" : "Odd"); // Use ternary operator to decide output
        in.close();//scanner closed
    }
}
