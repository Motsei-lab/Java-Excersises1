/*
Exercise 2.2: Grade calculator
Create GradeCalculator and classify marks:

Mark Grade

80--100 Distinction 70--79 Merit 50--69 Pass 0--49 Fail Outside 0--100 Invalid mark

Order conditions correctly so each mark receives one result.
 */
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
