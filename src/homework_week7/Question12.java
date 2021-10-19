package homework_week7;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol
 */
public class Question12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter input character: ");
        String input = in.next();
        if (input.length() > 1)
            throw new Error("Input must be a character"); //error for input
        char ch = input.charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is a Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Number.");
        } else {
            System.out.println(ch + " is a Symbol.");
        }
        in.close();//scanner close
    }
}
