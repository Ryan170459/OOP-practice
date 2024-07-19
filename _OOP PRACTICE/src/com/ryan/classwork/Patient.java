package com.ryan.classwork;

import java.util.Scanner;
public class Patient {
    //Declaring the attributes that define the class; name,age and gender
    public String name;
    private int age, patientID;

    private char gender;

    public Patient(){
    }

    public Patient(String name){
        this.name = name;
    }

    public Patient(String name, int patientID,int age, char gender){
        this.name = name;
        this.patientID = patientID;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public void setAge(int age) {
        this.age = age;
    }

        public void setGender(char gender) {
            this.gender = gender;
        }

    public String getName(){
            return name;
        }

    public int getPatientID(){
            return patientID;
        }

    public int getAge(){
            return age;
        }

    public char getGender(){
            return gender;
        }

        public void checkDetails(){
        System.out.println("Patient's name is:" +getName());
            System.out.println("Patient's ID is:" +getPatientID());
            System.out.println("Patient's age is:" +getAge());
            System.out.println("Patient's gender is:" +getGender());
        }

        public static void main(String[]args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Input patient name:");
        String patientName= scanner.next();

        System.out.println("Input patient ID:");
        int patientID= scanner.nextInt();

        System.out.println("Input patient age:");
        int age= scanner.nextInt();

        System.out.println("Input gender:");
        char gender= scanner.next().charAt(0);


        Patient myPatient = new Patient(patientName, patientID, age, gender);
        System.out.println("Patient info:");
        myPatient.checkDetails();

        }


    }


