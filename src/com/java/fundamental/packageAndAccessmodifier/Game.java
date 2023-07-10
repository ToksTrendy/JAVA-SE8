package com.java.fundamental.packageAndAccessmodifier;

import com.java.fundamental.packageAndAccessmodifier.engine.GuessMyNumber;

public class Game {
    public static void main(String[] args) {
        GuessMyNumber game = new GuessMyNumber(3);
        game.play();
    }
}
