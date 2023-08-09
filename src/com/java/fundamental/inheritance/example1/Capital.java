package com.java.fundamental.inheritance.example1;

public class Capital extends City{
    @Override
    public String toString() {
        return "Capital{" +
                "name='" + getName() + " \'" +
                ", polutaion =" + getPopulation() +
    '}';
    }
}
