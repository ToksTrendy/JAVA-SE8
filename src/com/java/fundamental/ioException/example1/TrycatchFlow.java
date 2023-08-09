package com.java.fundamental.ioException.example1;

public class TrycatchFlow {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try{
            sb.append("a");
        } catch (Exception e) {
            sb.append("b");
        } finally {
            sb.append("c");
        }
        sb.append("d");

        System.out.println(sb);
    }
}
