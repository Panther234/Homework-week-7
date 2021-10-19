package homework_week7;

import java.util.Scanner;

/**
 * Same as above program-8 using switch statement
 */
public class Question9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter city name: ");
        String cityName = in.next();
        char start = cityName.charAt(0);
        //switch statement used
        switch (start) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
                System.out.println(start);
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }
        in.close();// scanner close
    }
}
