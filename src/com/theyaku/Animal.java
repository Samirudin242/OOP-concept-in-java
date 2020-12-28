package com.theyaku;

//inheritance

public class Animal {
    private String name;
    private int weight;
    private String habitat;

    public Animal(String name, int weight, String habitat) {
        this.name = name;
        this.weight = weight;
        this.habitat = habitat;
    }


    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getHabitat() {
        return habitat;
    }
}

