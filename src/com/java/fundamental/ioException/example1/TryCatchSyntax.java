package com.java.fundamental.ioException.example1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchSyntax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("word.txt"));
            String line;
            while((line = br.readLine())!= null);{
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.err.format("FileNotFoundException: %s%n", e);
        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
