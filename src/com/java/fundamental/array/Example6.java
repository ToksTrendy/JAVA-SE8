package com.java.fundamental.array;

import java.sql.SQLOutput;

/**
 * Arrays are objects
 */
public class Example6 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        String[] names = {"Bola", "Fola", "Lola", "Tola"};

        String cls1 = numbers.getClass().getName();
        String cls2 = names.getClass().getName();

        System.out.println(cls1);
        System.out.println(cls2);
    }

}
