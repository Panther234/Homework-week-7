package homework_week7;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class Question16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int a = in.nextInt();
        if (a < 0) {
            System.out.println("NEGATIVE");//for Negative number
        } else if (a == 0) {
            System.out.println("ZERO");//for Zero number
        } else {
            System.out.println("POSITIVE");// for Positive number
        }
        in.close();//scanner closed
    }
}
