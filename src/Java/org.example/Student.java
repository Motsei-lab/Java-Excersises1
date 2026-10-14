package org.example;

public class Student {
    String name;
    String studentNumber;
    double mark;

    public Student(String name, String studentNumber, double mark){
        this.name = name;
        this.studentNumber = studentNumber;
        this.mark = mark;
    }

    public void displayDetails(){
        System.out.println("Name:" + this.name + "\n Student Number: " + this.studentNumber + "\n Mark: " + this.mark);
    }

    public void hasPassed(){
        if(this.mark >= 50){
            System.out.println(this.name+ " you have passed with a mark of " + this.mark);
        }
        else {
            System.out.println(this.name+" You have failed, try again");
        }
    }
}
