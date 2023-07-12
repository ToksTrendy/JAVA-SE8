package com.java.fundamental.loop.nestedLoop;

public class NestedLoopWithBreak {
    public static void main(String[] args) {
        int [][] number = {
                {5, 6},
                {7, 8},
                {9, 10},
        };
        for (int i = 0; i < number.length; i++){
            for (int j = 0; j < number[i].length; j++){
                if(number[i][j] == 7){
                    break ;
                }
                System.out.println(number[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("End of loop");
    }
}
