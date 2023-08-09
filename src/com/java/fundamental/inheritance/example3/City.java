package com.java.fundamental.inheritance.example3;

public class City {
    private final String name;
    private int population;

    public City(String name) {
        this.name = name;
    }

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getName() {
        return name;
    }

}
