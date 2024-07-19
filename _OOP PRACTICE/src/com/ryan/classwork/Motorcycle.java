package com.ryan.classwork;

public class Motorcycle {
    //Declare the attributes that define the class; name and price
    private String name;
    private float price;

    //Define constructors so that we can specify how to initialize
    //
    //the instances of the class motorcycle
    //Create an empty constructor

    public Motorcycle(){

    }

    //Define the second constructor to initialize an instance with the attribute
    //name only

    public Motorcycle(String name){
        this.name = name;

    }
    //Define 3rd constructor to initialize an instance of the class which includes both
    //name and class

    public Motorcycle(String name, float price){
        this.name = name;
        this.price = price;
    }

    //SETTERS
    //Creating a setter for setting the name.
    //All setters are public and void by default.


    public void setName(String name) {
        this.name = name;
    }
    //Creating a setter for setting the price
    public void setPrice(float price) {
        this.price = price;
    }

    //GETTERS
    //Getters are public and have a return type by default
    //Creating a getter for getting the name
    public String getName(){
        return name;
    }

    public float getPrice() {
        return price;
    }
    //Calling the method to show details of the object
    public void showDetails(){
        System.out.println("Object name is:"+name);
        System.out.println(name +"price is:"+price);
    }
    //Creating main method

    public static void main(String[]args){
        //Initializing an object of motorcycle using an empty constructor

        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.setName("Electric bike");
        motorcycle1.setPrice(50000f);
        motorcycle1.showDetails();


    //Create a motorcycle object using the second constructor
    Motorcycle motorcycle2 = new Motorcycle("scooter");
    motorcycle2.setPrice(80000f);
    motorcycle2.showDetails();

    Motorcycle motorcycle3 = new Motorcycle("Bajaj",  150000f);
    motorcycle3.showDetails();
}
}

