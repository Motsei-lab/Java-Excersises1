package org.example;

public class StudentsDetails {

    public String name;
    public int age;
    public double avgMark ;
    public boolean registrationStatus;

     public void displayDetails(){
         System.out.println("Student Name: " + name);
         System.out.println("Age : " + age);
         System.out.println("Average Mark :" + avgMark);
         System.out.println("Registered: " + registrationStatus);


     }
}
