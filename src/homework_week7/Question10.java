package homework_week7;

import java.util.Objects;
import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
 * find addition, Subtraction, multiplication and division according to their symbol (using if else)
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter operation: ");
        String operation = in.next();
        //ifElse statement used
        if (Objects.equals(operation, "*")) {
            System.out.println("First number * Second number = " + (a*b));
        } else if (Objects.equals(operation, "+")) {
            System.out.println("First number + Second number = " + (a+b));
        } else if (Objects.equals(operation, "/")) {
            System.out.println("First number / Second number = " + (a/b));
        } else if (Objects.equals(operation, "-")) {
            System.out.println("First number - Second number = " + (a-b));
        } else {
            System.out.println("Invalid operation");
        }
        in.close();//scanner.close
    }
}
