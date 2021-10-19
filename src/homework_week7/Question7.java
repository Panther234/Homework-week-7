package homework_week7;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000 5% < 10,000 2%
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter sales id: ");
        int salesID = in.nextInt();
        System.out.print("Enter seller name: ");
        String sellerName = in.next();
        System.out.print("Enter Sales amount: ");
        int salesAmount = in.nextInt();
        System.out.print("Enter Basic salary: ");
        int basicSalary = in.nextInt();
        int commissionPercent = 0;
        //ifElse statement used
        if (salesAmount >= 50000) {
            commissionPercent = 35;
        } else if (salesAmount >= 30000) {
            commissionPercent = 20;
        } else if (salesAmount >= 20000) {
            commissionPercent = 10;
        } else if (salesAmount >= 10000) {
            commissionPercent = 5;
        } else commissionPercent = 2;

        int commission = salesAmount * commissionPercent / 100;
        System.out.println("Sales Commission: " + commission);
        in.close();//Scanner closed
    }
}
