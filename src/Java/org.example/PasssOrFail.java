/*
Exercise 2.1: Pass or fail
Create PassOrFail.
If a mark is 50 or higher, display Pass; otherwise, display Fail.
Challenge: Reject marks below 0 or above 100.
 */
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
