package com.theyaku;

public class Yard {

    private boolean grass;
    private boolean sand;
    private int plants;

    public Yard(boolean grass, boolean sand, int plants) {
        this.grass = grass;
        this.sand = sand;
        this.plants = plants;
    }


    public void stuffOnYard() {
        if(this.sand) {
            System.out.println("There are many sand in my backyard");
        }

        if(this.grass) {
            System.out.println("There are many green grass in my backyard");
        }

        if(this.plants > 0) {
            System.out.println("there are " + this.plants + " plants grow in my backyard");
        }
    }
    public boolean isGrass() {
        return grass;
    }

    public boolean isSand() {
        return sand;
    }

    public int getPlants() {
        return plants;
    }
}
