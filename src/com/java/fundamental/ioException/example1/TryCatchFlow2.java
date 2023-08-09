package com.java.fundamental.ioException.example1;

public class TryCatchFlow2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = null;

        try{
            sb.append("a");
            str.toUpperCase();
            sb.append("b");
        } catch (IllegalArgumentException e){
            sb.append("c");
        } catch (Exception e){
            sb.append("d");
        } finally{
            sb.append("e");
        }
        System.out.println(sb);
    }
}
