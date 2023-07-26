package com.java.fundamental.loop.nestedLoop;

public class NestedLoop {
    public static void main(String[] args) {
        int [] [] n = {
                {1, 2},
                {3, 4},
                {5, 6},
        };
        for (int i = 0; i < n.length; i++){
            for (int j = 0; j < n[i].length; j++){
                System.out.println(n[i][j] + " ");
            }
            System.out.println();
        }
    }
}
