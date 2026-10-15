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
