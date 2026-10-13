package org.example;

public class StudentMarks {
    int[] fiveMarks = {70,50,75,80,70};
    double avg;

    public void calculateArrays(){
        int sum=0;
        for(int i = 0; i < fiveMarks.length; i++){
            System.out.println(fiveMarks[i]);
            sum+= fiveMarks[i];

        }
        avg = (double) sum / fiveMarks.length;

        System.out.println("The sum of all these marks is: " + sum );
        System.out.println("The average of all these marks is " + avg);
    }


    }


