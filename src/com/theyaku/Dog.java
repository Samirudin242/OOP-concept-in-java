package com.theyaku;

public class Dog extends Animal {
    private int legs;
    private int eyes;
    private int tail;


    public Dog(String name, int weight, String habitat, int legs, int eyes, int tail) {
        super(name, weight, habitat);
        this.legs = legs;
        this.eyes = eyes;
        this.tail = tail;
    }


    public void getDogDescription() {
        System.out.println("the dog name is " + super.getName() + " and has " + this.legs + " legs");
        System.out.println("the dog habitat is in the " + super.getHabitat());
    }
}
