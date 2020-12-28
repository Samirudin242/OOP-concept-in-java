package com.theyaku;

//Encapsulation

public class Player {
    private String name;
    private double blood = 100;
    private int level;


    public Player(String name, double health, int level) {
        this.name = name;
        if(health > 0.0 && health <= 100.0) {
            this.blood = health;
        }
        this.level = level;
    }


    public String getName() {
        return name;
    }

    public double getHealth() {
        return blood;
    }

    public int getLevel() {
        return level;
    }
}
