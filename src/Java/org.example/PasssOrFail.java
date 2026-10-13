package org.example;

public class PasssOrFail {
    public int mark;

    public void determinePassorFail(){

        if (mark <0 || mark > 100){
            System.out.println("Invalid mark Entered, Re-enter the correct mark");
        }
        else if (mark >=50){
            System.out.println("Pass");
        }
        else{
            System.out.println( "Fail");
        }
    }
}
