package com.tasanah.designpatterncreational.singleton;

public class Singleton {

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void increment() {
        counter++;
    }


    private static Singleton instance = null;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
