package com.java.fundamental.array;

/**
 * Accessing Array Elements
 */
public class Example3 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "shola";
        names[1] = "Tola";
        names[2] = "Lola";

        System.out.println("The first name is" + names[0]);
        System.out.println("The second name is" + names[1]);
        System.out.println("The third name is" + names[2]);

        System.out.println();
        int index = 2;
        String name = names[index];
        System.out.println("The name at index" + " " + index  +" " + "is"+" " + name);

    }
}
