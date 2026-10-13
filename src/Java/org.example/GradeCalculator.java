package org.example;

public class GradeCalculator {
    public int mark;

    public void classifyMarks(){
        if (mark < 0 || mark >100){
            System.out.println("Invalid Mark Entered, re-enter the valid marks");
        }
        else if(mark <=49){
            System.out.println("You have Failed, Mark: " + mark);
        }
        else if (mark <=69){
            System.out.println("You have Passed, Mark: " + mark);
        } else if (mark <=79) {
            System.out.println("You have earned a merit with your mark of " + mark);
        }
        else{
            System.out.println("You have earned a distinction with your mark of + " + mark);
        }
    }
}
