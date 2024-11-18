package com.feature1;

import java.util.Arrays;
import java.util.Scanner;

public class feature1 {
    // Method to sort an array of integers
    public static int[] sortIntegers(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        Arrays.sort(array);
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the array size
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[size];

        // Prompt the user to enter array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array and display the results
        System.out.println("Sorted integers: " + Arrays.toString(sortIntegers(numbers)));

        scanner.close();
    }
}