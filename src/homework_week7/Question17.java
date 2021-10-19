package homework_week7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Write a Java program to sort a numeric array and a string array
 */
public class Question17 {

    public static void main(String[] args) {
        // Making integer array randomly sorted from beginning
        Integer[] intArray = {0, 1, 2, 3, 4, 5};
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList); // Randomly re-order array, so we can't plan in advance for the array order
        System.out.println("Shuffled int array is: " + Arrays.toString(intArray));
        intList.toArray(intArray);
        Arrays.sort(intArray);
        System.out.println("int array in Ascending order: " + Arrays.toString(intArray));
        Arrays.sort(intArray, Collections.reverseOrder());
        System.out.println("int array in Descending order: " + Arrays.toString(intArray));

        // Making string array randomly sorted from beginning
        String[] stringArray = {"Bob", "Joe", "Anne", "David", "Shlok"};
        List<String> stringList = Arrays.asList(stringArray);
        Collections.shuffle(stringList); // Randomly re-order array, so we can't plan in advance for the array order
        System.out.println("Shuffled string array is: " + Arrays.toString(stringArray));
        stringList.toArray(stringArray);
        Arrays.sort(stringArray);
        System.out.println("String array in ascending order: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray, Collections.reverseOrder());
        System.out.println("String array in descending order: " + Arrays.toString(stringArray));
    }
}
