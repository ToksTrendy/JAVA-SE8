package com.java.fundamental.array;

import java.util.Scanner;

import static java.util.Scanner.*;

/**
 * Entering multiple numbers and computing the sum using array
 */
public class Example5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many number do you want to enter ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Please enter a number:");
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int element : numbers){
            sum += element;
        }
        System.out.println("The sum is:" + sum);
    }
}
