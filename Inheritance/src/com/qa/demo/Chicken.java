package com.qa.demo;

public class Chicken extends Bird {

    private int eggCount = 0;

    public void doThing(){
        System.out.println("Flight? " + super.getFly());
    }

    public void cluck() {
        System.out.println("bwark");
    }

}