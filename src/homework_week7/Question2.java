package homework_week7;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class Question2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();
        boolean isLeapYear = year % 400 == 0 || (year % 100 != 0 && (year % 4 == 0)); // Check for leap year
        System.out.println(year + (isLeapYear ? " is" : " is not") + " a leap year"); // Print out with ternary operator

        // With if else statements, check for leap year
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
        in.close(); // close scanner
    }
}
