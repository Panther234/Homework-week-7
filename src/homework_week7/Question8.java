package homework_week7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */
public class Question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String cityName = in.next();
        char start = cityName.charAt(0);
        //ifElse statement used
        if (start == 'A') {
            System.out.println(start);
        } else if (start == 'B') {
            System.out.println(start);
        } else if (start == 'C') {
            System.out.println(start);
        } else if (start == 'D') {
            System.out.println(start);
        } else if (start == 'E') {
            System.out.println(start);
        } else if (start == 'F') {
            System.out.println(start);
        } else if (start == 'a') {
            System.out.println(start);
        } else if (start == 'b') {
            System.out.println(start);
        } else if (start == 'c') {
            System.out.println(start);
        } else if (start == 'd') {
            System.out.println(start);
        } else if (start == 'e') {
            System.out.println(start);
        } else if (start == 'f') {
            System.out.println(start);
        } else {
            System.out.println("Invalid entry");
        }
        in.close();//scanner closed
    }
}
