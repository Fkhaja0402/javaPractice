package com.encapsulation;

import com.oops.java.School;

public class Driver {
    public static void main(String args[]){

        PracticeEncapsulation studentDetails = new PracticeEncapsulation();
        PracticeEncapsulation pm = new School();

        studentDetails.setAge(10);
        studentDetails.setId(10002);
        studentDetails.setFiratName("Dan");
        studentDetails.setLastName("Hansen");
        //studentDetails.setMarks(75f);

        System.out.println("Student First Name = " +studentDetails.getLastName()+ ","+ " "+studentDetails.getFiratName());
        System.out.println("Student ID = " +studentDetails.getId());
        System.out.println("Student age = " +studentDetails.getAge());
        //System.out.println("Student Marks = " +studentDetails.getMarks());
        System.out.println(studentDetails.studentGrading(56.9f));


    }
}
