package java_week05_yagnik;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 4. Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */
public class Programme04_ArrayList {
    public static void main(String[] args) {

        // Create a new ArrayList
        List<String> colors = new ArrayList<>();

        // Add some colors to the ArrayList
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements(Type done to finish) : ");
        String input = sc.nextLine();
        while(!input.equalsIgnoreCase("done")){
            colors.add(input);
            System.out.print("Enter next element : ");
            input = sc.nextLine();
        }

        // Print out the collection using for each loop
        for (String color : colors) {
            System.out.println(color);
        }
        sc.close();
    }
}
