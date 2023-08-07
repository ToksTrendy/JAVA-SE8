package com.java.fundamental.array;
/**
 * Declaring and Initializing Arrays
 */
public class Example2 {
    public static void main(String[] args) {
        int[] numbers = new int [3];

        String[] names = new String[4];

        int[] numbers2 = new int[]{1,3,5,7}; // Note: you don't need to put length of array in the square bracket

        int[] numbers3 = {1,3,5,7};

        //Minimum length of array is not 1 but zero
        int[] empty = new int[0];

        int[] empty2 = {}; // array with zero element is similar to empty string

        int[] lotsOfNumbers = new int[Integer.MAX_VALUE];

    }
}
