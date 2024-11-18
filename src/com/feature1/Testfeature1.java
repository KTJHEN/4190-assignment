package com.feature1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class Testfeature1 {
    @Test
    void testMultiInputs() {
        int[] input = {3, 1, 2, 4, 6, 5, 8, 9, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, feature1.sortIntegers(input));
    }

    @Test
    void testNoInput() {
        int[] input = {};
        int[] expected = {};
        assertArrayEquals(expected, feature1.sortIntegers(input));
    }

    @Test
    void testSingleInput() {
        int[] input = {1};
        int[] expected = {1};
        assertArrayEquals(expected, feature1.sortIntegers(input));
    }
    
    @Test
    void testInputsLessThan0() {
        int[] input = {0,-1,-2,-3};
        int[] expected = {-3, -2, -1, 0};
        assertArrayEquals(expected, feature1.sortIntegers(input));
    }


}

