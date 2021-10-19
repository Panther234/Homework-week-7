package homework_week7;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0|
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee ID: ");// employee ID
        int employeeId = in.nextInt();
        System.out.print("Enter employee name: ");//employee Name
        String employeeName = in.next();
        System.out.print("Enter employee basic salary: ");//employee basic salary
        double basicSalary = in.nextDouble();
        double hra = basicSalary * 0.1;
        double ta = basicSalary * 0.08;
        double da = basicSalary * 0.09;
        double pf = basicSalary * 0.2;
        double grossSalary = basicSalary + hra + ta + da - pf; //gross salary
        System.out.println("_______________________________");
        System.out.println("|         Salary Slip         |");
        System.out.println("|_____________________________|");
        System.out.println(String.format("| Employee ID   :   %s      |", employeeId));
        System.out.println(String.format("| Employee Name :   %s       |", employeeName));
        System.out.println("|_____________________________|");
        System.out.println(String.format("| Basic Salary :   %s    |", basicSalary));
        System.out.println(String.format("| HRA 10%s      :   %s     |", "%", hra));
        System.out.println(String.format("| TA 8%s        :   %s     |", "%", ta));
        System.out.println(String.format("| DA 9%s        :   %s     |", "%", da));
        System.out.println(String.format("| PF -20%s      :   %s     |", "%", pf));
        System.out.println("|_____________________________|");
        System.out.println(String.format("| Gross Salary :  %s     |", grossSalary));
        System.out.println("|=============================|");
        in.close(); // close scanner
    }
}
