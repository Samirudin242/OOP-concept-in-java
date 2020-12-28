package com.theyaku;


//Composition

public class House {
    private LivingRoom livingRoom;
    private Kitchen kitchen;
    private Yard yard;

    public House(LivingRoom livingRoom, Kitchen kitchen, Yard yard) {
        this.livingRoom = livingRoom;
        this.kitchen = kitchen;
        this.yard = yard;
    }


    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Yard getYard() {
        return yard;
    }


}
