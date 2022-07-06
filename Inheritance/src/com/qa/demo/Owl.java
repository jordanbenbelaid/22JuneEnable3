package com.qa.demo;

public class Owl extends Bird {

    private int wingspan = 30;

    public void doThing(){
        System.out.println("Wingspan: " + this.wingspan + ", Flight?: " + super.getFly());
    }
    
    //overriding the original noise method in the parent class bird
    @Override
    public void noise() {
    	System.out.println("hooooo");
    }

}
