package com.java.fundamental.array;

/**
 * Iterating Over Arrays
 */
public class Example4 {
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8};
         for (int i = 0; i < numbers.length; i++){
             int element = numbers[i];
             System.out.println("The element at index" +" " + i + "is"+ " " + element);
         }
        System.out.println();

        int sum = 0;
         for (int element : numbers){
             sum += element;
         }
        System.out.println("The sum is:" + sum);
    }
}
