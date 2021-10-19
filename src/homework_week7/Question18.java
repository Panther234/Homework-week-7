package homework_week7;

/**
 * Write a Java program to sum values of an array
 */
public class Question18 {
    public static void main(String[] args) {
        int intArray [] = {0, 1, 2, 3, 4, 5, 6};
        int total = 0;
        for (int i : intArray) {
            total += i;
        }
        System.out.println("Sum of items in array is " + total);
    }
}
