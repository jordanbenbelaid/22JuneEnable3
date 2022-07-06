package com.qa.demo;

public class Bird {

    private boolean fly = true;

    public void noise(){
        System.out.println("tweet");
    }

    // getters and setters
    public boolean getFly(){
        return fly;
    }

    public void setFly(boolean newValueOfFly){
        this.fly = newValueOfFly;
    }

}
