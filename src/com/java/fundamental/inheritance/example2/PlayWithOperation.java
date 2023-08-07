package com.java.fundamental.inheritance.example2;

public class PlayWithOperation {
    public static void main(String[] args) {
        String operation = "1 + 2";
        String[] elements = operation.split(" ");
        int leftOperand = Integer.parseInt(elements[0]);
        int rightOperand = Integer.parseInt(elements[2]);
        String symbol = elements[1];
        Operation op = Operation.of(symbol);
        int result = op.compute(leftOperand, rightOperand);
        System.out.println("result =" + result);
    }
}
