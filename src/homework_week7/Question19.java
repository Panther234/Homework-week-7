package homework_week7;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Question19 {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6};//calculate sum of all array elements
        double total = 0.0;
        double count = intArray.length;
        for (int i : intArray) {
            total += i;
        }
        System.out.println("Average of values of array is " + total/count);
    }
}
