package com.java.fundamental.packageAndAccessmodifier.engine;

public class RandomNumberGenerator {
    public int getNumberToGuess(){
        // Generate a number between 1 and 10
        return (int) ((Math.random()*10)+1);
    }
}
