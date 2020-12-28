package com.theyaku;

public class LivingRoom {
    private int sofa;
    private int table;
    private int Lamp;

    public LivingRoom(int sofa, int table, int lamp) {
        this.sofa = sofa;
        this.table = table;
        Lamp = lamp;
    }


    public int getSofa() {
        return sofa;
    }

    public int getTable() {
        return table;
    }

    public int getLamp() {
        return Lamp;
    }
}
