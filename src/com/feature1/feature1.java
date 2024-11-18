package com.feature1;
import java.util.Arrays;
import java.util.Scanner;

public class feature1 {
    public static int[] sortIntegers(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Sorted integers: " + Arrays.toString(sortIntegers(numbers)));
        scanner.close();
    }
}