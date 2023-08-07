package com.java.fundamental.inheritance.example1;

public class Main {
    public static void main(String[] args) {
        City newYork = new City();
        newYork.setName("New York");
        newYork.setPopulation(100);

        Capital paris = new Capital();
        paris.setName("Paris");
        paris.setPopulation(50);

        System.out.println("Paris = " + paris.toString() );
        System.out.println("New York = " + newYork.toString());

        //static void process(City city){
          //  System.out.println("City = " + );
       // }
    }
}
