/*
Exercise 2.3: Number analysis
Create NumberAnalysis. Determine whether an integer is positive, negative, or zero, and whether it is even or odd.
Remember that zero is even.
 */
package org.example;

public class NumberAnalysis {
    public int number;

    public void determineInt(){
        if(number > 0){
            System.out.println(number + " is a positive integer");
        }
        else if (number < 0){
            System.out.println(number + " is a negative integer");
        }
        else {
            System.out.println(number + " is a zero");

        }
        if(number % 2 ==0){
            System.out.println( number+ " The integer number is even");
        }
        else{
            System.out.println(number + " The integer number is odd");

        }    }
}
