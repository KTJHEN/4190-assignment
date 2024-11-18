package com.feature1;
import java.util.Arrays;
import java.util.Scanner;

public class feature1 {
    public static int[] sortIntegers(int[] array) {
        if (array == null) { //https://www.geeksforgeeks.org/try-catch-throw-and-throws-in-java/
            throw new IllegalArgumentException("Input array cannot be null");
        }
        Arrays.sort(array); 
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number of integers:");
            int size = scanner.nextInt();

            if (size <= 0) {
                System.out.println("The array size must be greater than 0.");
                return; 
            }
            int[] numbers = new int[size];
            System.out.println("Enter the integers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = scanner.nextInt();
            }
            System.out.println("Sorted integers: " + Arrays.toString(sortIntegers(numbers)));
        } catch (Exception e) {
            System.out.println("Error, The Input Should Be Int");
        } finally {
            scanner.close();
        }
    }
}