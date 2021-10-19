package homework_week7;

import java.util.ArrayList;
/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Question20 {
    public static void main(String[] args) {
        ArrayList<Object> objectArray = new ArrayList<Object>();
        objectArray.add("Hi");
        objectArray.add(1);
        objectArray.add(true);
        objectArray.add(5.3);
        objectArray.add('@');
        Object testValue = "Hi";
        System.out.println("Array is " + objectArray);
        System.out.println("Test value is " + testValue);
        if (objectArray.contains(testValue))
            System.out.println("Array contains test value");
        else
            System.out.println("Array does not contain test value");
    }
}
