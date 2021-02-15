package com.encapsulation;

import java.sql.SQLOutput;

public class PracticeEncapsulation {

    private String firstName;
    private String lastName;
    private int age;
    private int id;
    //private int marks;
    // String grade = studentGrading();

    public static String studentGrading(float marks) {
        //this.marks = marks;


        if (marks >= 90f && marks<=100f)
            System.out.println("You have passed with 1st Class Distiction");


         else if (marks > 100f || marks<0f)
             throw new IllegalArgumentException(marks + " is invalid. Please Enter the valid value");

            else if (marks <= 89f && marks >= 75f)
                System.out.println("You have passed with 1st Class");

            else if (marks <= 74f && marks >= 60f)
             System.out.println("You have passed with 2nd Class");


            else if (marks <= 59f && marks >= 45f)
             System.out.println("You have passed with 3rd Class");

            else if (marks <= 44f)
             System.out.println("You have failed, Good luck next time!");


            return String.valueOf(marks);


    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFiratName() {
        return firstName;
    }

    public void setFiratName(String firatName) {
        this.firstName = firatName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int  getMarks() {
//        return marks;
//    }
//
//    public void setMarks(int marks) {
//        this.marks = marks;
//    }
}

