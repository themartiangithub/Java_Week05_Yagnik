package java_week05_yagnik;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * 5. Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */

public class Programme05_ArrayListIterator {
    public static void main(String[] args) {
        // Create an array list
        ArrayList<String> languages = new ArrayList<>();

        // Add elements to the array list
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements(Type done to finish) : ");
        String input = sc.nextLine();
        while(!input.equalsIgnoreCase("done")){
            languages.add(input);
            System.out.print("Enter next element : ");
            input = sc.nextLine();
        }

        // Get an iterator for the array list
        Iterator<String> iterator = languages.iterator();

        // Iterate through the array list and print the elements
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
