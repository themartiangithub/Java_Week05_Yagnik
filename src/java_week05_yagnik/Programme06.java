package java_week05_yagnik;

import java.util.ArrayList;

/**
 *6. Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class Programme06 {
    public static void main(String[] args) {
        // Create an array list
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to the array list
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");

        // Get the element at index 1
        String element = languages.get(1);

        // Print the element
        System.out.println(element);
    }
}
