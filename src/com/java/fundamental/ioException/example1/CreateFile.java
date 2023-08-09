package com.java.fundamental.ioException.example1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        int ops = collectIntegerInput("Enter operation. \n1. Enter 5 letter word \n2. exit");
        while (ops != 2) {
            if (ops == 1) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter 5 letter word ");
                String word = scanner.nextLine();
                try {
                    FileOutputStream out = new FileOutputStream("word.txt");
                    out.write(word.getBytes());
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            ops = collectIntegerInput("Enter operation. \n1. Enter 5 letter word \n2. exit");
        }
    }
    static int collectIntegerInput(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
