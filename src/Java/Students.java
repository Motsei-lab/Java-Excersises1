/*
Create a Student class with student number, name, and an array of three marks.
Add methods to calculate the average, determine whether the student passed (average at least 50), and display a summary.
In a separate main class, create at least three student objects, display their averages and results
,count how many passed, and identify the student with the highest average.
Validation: Marks must be between 0 and 100.
*/
import java.util.Arrays;

public class Students {
    String studNum;
    String studName;
    int[] marks;
    boolean hasPassed = false;
    double average=0.0;


    Students(String studNum, String studName, int[] marks){
        this.marks = marks;
        this.studName = studName;
        this.studNum = studNum;
    }

    public double calAvg(){

        int sum=0;

        for (int index=0; index < this.marks.length; index++){
            sum += marks[index];
        }
        average = (double) sum / marks.length;

        return average;
    }

    public boolean studPassed(){


        if( average >=50){
            hasPassed = true;
        }
        else{
            hasPassed = false;
        }

        return hasPassed;
    }

    public void summary(){
        System.out.println("Student Number:"+this.studNum+" Student:"+this.studName+ " has an average mark of:"+ average);
        System.out.println("Student Number:"+this.studNum+" Student:"+this.studName+ " has passed? "+ studPassed());
        System.out.println("Student: " + this.studName + " got the following marks for their three assessmnets: " +Arrays.toString(marks));
    }
}
