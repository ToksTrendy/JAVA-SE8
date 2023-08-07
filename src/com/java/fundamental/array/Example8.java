package com.java.fundamental.array;

/**
 * Covariance of Arrays
 */
public class Example8 {
    public static void main(String[] args) {
        Dog [] dogs = {new Dog(), new Dog()};
        //Cat [] cats = {new Cat(), new Cat()};

        Animal[] animals = dogs;
       // Animal[] animals1 = cats;

        makeSounds(dogs);
       // makeSounds(cats);
    }

    private static void makeSounds(Animal[] animals) {
        for(Animal animal : animals){
            animal.makeSound();
        }
    }

    interface Animal {
        void makeSound();

    }
    static class Dog implements Animal{
        @Override
        public void makeSound() {
            System.out.println("woof!");
        }
    }
    static class Cat implements Animal{
        @Override
        public void makeSound() {
            System.out.println("meow!");
        }
    }
}
