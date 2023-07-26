package com.java.fundamental.loop;

public class WhileLoop {
    public static void main(String[] args) {

        int energyPointLeft = 3;
        int hoursLeft = 3;
        int hourWorked = 0;
        while (energyPointLeft > 0 || hoursLeft >= 0) {
            energyPointLeft--;
            hoursLeft--;
            hourWorked++;
        }
        System.out.println(hourWorked);
    }
}
