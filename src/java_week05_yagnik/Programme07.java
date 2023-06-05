package java_week05_yagnik;

import java.util.ArrayList;

/**
 * 7. Write a Java program to test if an array list is empty or not.
 */
public class Programme07 {
    public static void main(String[] args) {
        // Create an array list
        ArrayList<String> languages = new ArrayList<>();

        // Check if the array list is empty
        if (languages.isEmpty()) {
            System.out.println("The array list is empty.");
        } else {
            System.out.println("The array list is not empty.");
        }

        // Add elements to the array list
        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");

        // Check if the array list is empty again
        if (languages.isEmpty()) {
            System.out.println("The array list is empty.");
        } else {
            System.out.println("The array list is not empty.");
        }
    }
}
