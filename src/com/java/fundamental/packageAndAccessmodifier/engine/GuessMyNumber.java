package com.java.fundamental.packageAndAccessmodifier.engine;

import java.util.Scanner;

import static java.lang.System.exit;

public class GuessMyNumber {

    private int numberOfTries;
    private int numberofTriesPlayed = 0;
    private int numberToGuess = 0;

    public GuessMyNumber(int numberOfTries){
        if(numberOfTries < 1 || numberOfTries > 10){
            throw new IllegalArgumentException("Wrong number of tries selected!\n" +
                    "choose number from 1 to 10");
        }
        this.numberOfTries = numberOfTries;

        RandomNumberGenerator randomNumber = new RandomNumberGenerator();
        setNumberToGuess(randomNumber.getNumberToGuess());
    }

    public void play() {
        int guess;
        int numberOfTries = 3;
        do {
            if(numberOfTries == 0){
                exit(0);
            }
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number from 1 to 10");
            guess = input.nextInt();
            if (guess == numberToGuess) {
                System.out.println("Correct! You guess right");
                System.exit(0);
            } else {
                System.out.println("You enter a wrong number" + " " + --numberOfTries + "more trial");
                numberOfTries++;
            }
        } while (numberOfTries == 3);
        exit(0);
    }

    public int getNumberToGuess() {
        return numberToGuess;
    }

    public void setNumberToGuess(int numberToGuess) {
        this.numberToGuess = numberToGuess;
    }

    public int getNumberOfTries() {
        return numberOfTries;
    }

    public void setNumberOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    public int getNumberofTriesPlayed() {
        return numberofTriesPlayed;
    }

    public void setNumberofTriesPlayed(int numberofTriesPlayed) {
        this.numberofTriesPlayed = numberofTriesPlayed;
    }
}
