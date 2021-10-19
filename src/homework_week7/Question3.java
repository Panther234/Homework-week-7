package homework_week7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________ | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No : 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Roll No: ");
        int rollNo = in.nextInt();
        System.out.print("Maths: ");
        int mathsMark = in.nextInt();
        if (mathsMark < 0 || mathsMark > 100) {
            throw new Error("Invalid input, marks should be between 0 and 100 inclusive"); // Stops program to prevent malfunction further on
        }
        System.out.print("Science: ");
        int scienceMark = in.nextInt();
        if (scienceMark < 0 || scienceMark > 100) {
            throw new Error("Invalid input, marks should be between 0 and 100 inclusive"); // Stops program to prevent malfunction further on
        }
        System.out.print("English: ");
        int englishMark = in.nextInt();
        if (englishMark < 0 || englishMark > 100) {
            throw new Error("Invalid input, marks should be between 0 and 100 inclusive"); // Stops program to prevent malfunction further on
        }
        int total = mathsMark + scienceMark + englishMark;
        //DecimalFormat class used to get result rounded to one decimal place.
        DecimalFormat oneDP = new DecimalFormat("0.0");
        String percentage = oneDP.format(total / 300.0 * 100.0) + "%";
        String result = "";
        String grade = null;
        //nestedIfElse used
        if (mathsMark < 35 || scienceMark < 35 || englishMark < 35) {
            result = "Fail";
        } else {
            result = "Pass";
            double percentAsDouble = total / 300.0 * 100.0;
            if (percentAsDouble >= 80) {
                grade = "A+";
            } else if (percentAsDouble >= 60) {
                grade = "A";
            } else if (percentAsDouble >= 50) {
                grade = "B";
            } else if (percentAsDouble >= 35) {
                grade = "C";
            }
        }

        // Print out report sheet
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|          Mark Sheet         |");
        System.out.println("|_____________________________|");
        System.out.println(String.format("|    Name       :    %s      |", name));
        System.out.println(String.format("|    Roll No    :    %s        |", rollNo));
        System.out.println("|_____________________________|");
        System.out.println("|    Subjects   :    Marks    |");
        System.out.println("|_____________________________|");
        System.out.println(String.format("|    Maths      :    %s       |", mathsMark));
        System.out.println(String.format("|    Science    :    %s       |", scienceMark));
        System.out.println(String.format("|    English    :    %s       |", englishMark));
        System.out.println("|_____________________________|");
        System.out.println(String.format("|    Total      :    %s      |", total));
        System.out.println("|_____________________________|");
        System.out.println(String.format("|    Percentage :    %s    |", percentage));
        System.out.println(String.format("|    Result     :    %s     |", result));
        if (grade != null) System.out.println(String.format("|    Grade      :    %s       |", grade));
        System.out.println("|_____________________________|");
        in.close(); // close scanner
    }
}
