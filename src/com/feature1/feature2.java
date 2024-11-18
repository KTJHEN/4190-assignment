package com.feature1;
import java.util.Arrays;
import java.util.Scanner;

public class feature2 {
    public static String[] sortStrings(String[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int size = scanner.nextInt();
        scanner.nextLine(); 
        String[] strings = new String[size];
        System.out.println("Enter the strings:");
        for (int i = 0; i < size; i++) {
            strings[i] = scanner.nextLine();
        }
        System.out.println("Sorted strings: " + Arrays.toString(sortStrings(strings)));
        scanner.close();
    }
}