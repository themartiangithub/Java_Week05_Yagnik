package java_week05_yagnik;

import java.util.ArrayList;

/**
 * 11. Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink")
 */
public class Program11 {
    public static void main(String[] args) {
        // Declare first ArrayList
        ArrayList<String> c1 = new ArrayList<String>();

        // Add elements to the ArrayList
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        // Declare second ArrayList
        ArrayList<String> c2 = new ArrayList<String>();

        // Add elements to the ArrayList
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // Compare the ArrayLists
        if (c1.equals(c2)) {
            System.out.println("The two ArrayLists are equal.");
        } else {
            System.out.println("The two ArrayLists are not equal.");
        }
    }
}
