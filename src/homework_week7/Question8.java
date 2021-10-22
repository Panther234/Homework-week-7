package homework_week7;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */
public class Question8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter character from A to F: ");
        String cityName = in.next();
        char start = cityName.charAt(0);
        //ifElse statement used
        if (start == 'A' || start == 'a') {
            System.out.println("Ahmedabad");
        } else if (start == 'B' || start == 'b') {
            System.out.println("Bangalore");
        } else if (start == 'C' || start == 'c') {
            System.out.println("Cambridge");
        } else if (start == 'D' || start == 'd') {
            System.out.println("Devon");
        } else if (start == 'E' || start == 'e') {
            System.out.println("Edinburgh");
        } else if (start == 'F' || start == 'f') {
            System.out.println("Frankfurt");
        } else {
            System.out.println("Invalid entry");
        }
        in.close();//scanner closed
    }
}
