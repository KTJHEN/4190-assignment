package com.feature1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Testfeature2 {
    @Test
    void testMultiInputs() {
        String[] input = {"a", "c", "b", "g", "z"};
        String[] expected = {"a", "b", "c", "g", "z"};
        assertArrayEquals(expected, feature2.sortStrings(input));
    }

    @Test
    void testNoInput() {
        String[] input = {};
        String[] expected = {};
        assertArrayEquals(expected, feature2.sortStrings(input));
    }

    @Test
    void testSingleInput() {
        String[] input = {"a"};
        String[] expected = {"a"};
        assertArrayEquals(expected, feature2.sortStrings(input));
    }


}

