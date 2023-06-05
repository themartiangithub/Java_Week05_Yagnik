package java_week05_yagnik;

import java.util.Scanner;

/**
 * 3. Write a Java program to reverse an array of integer values.
 */

public class Program03_ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int l = sc.nextInt();
        int[] originalArray = new int[l];
        for(int i=0; i<originalArray.length; i++){
            System.out.print("Enter array element "+(i+1)+" : ");
            originalArray[i] = sc.nextInt();
        }
        int[] reversedArray = reverseArray(originalArray);

        System.out.println("Original Array:");
        printArray(originalArray);

        System.out.println("\nReversed Array:");
        printArray(reversedArray);
    }

    public static int[] reverseArray(int[] array) {
        int length = array.length;
        int[] reversedArray = new int[length];

        for (int i = 0; i < length; i++) {
            reversedArray[i] = array[length - 1 - i];
        }

        return reversedArray;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
