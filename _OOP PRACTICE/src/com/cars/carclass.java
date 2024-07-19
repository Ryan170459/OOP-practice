package com.cars;

public class carclass {
    private String make;
    private int doors;

    public carclass(String make ,int doors){
        this.make = make;
        this.doors = doors;
    }

    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return make;
    }

    public void showDetails(){
        System.out.println("The car make is:"+make);
        System.out.println("The car door is:"+doors);
    }
}
