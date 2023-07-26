package com.java.fundamental.array;

import java.util.Arrays;

/**
 * Utility methods for working with Arrays
 */
public class Example7 {
    public static void main(String[] args) {
        int[] number1 = {10,20,30};
        int []number2 = Arrays.copyOf(number1, 4);
        System.out.println(Arrays.toString(number2));

        int[] number3 = Arrays.copyOfRange(number2, 1, 4);
        System.out.println(Arrays.toString(number3));

        int[] number4 = new int[8];
        System.arraycopy(number2, 0, number4, 0, 4);
        System.arraycopy(number3, 0, number4, 4, 3);
        System.out.println(Arrays.toString(number4));

        Arrays.sort(number4);
        System.out.println(Arrays.toString(number4));

        int index = Arrays.binarySearch(number4, 10);
        System.out.println("Found 10 at index" + " " + index);
    }
}
