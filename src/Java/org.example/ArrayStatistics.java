/*
Exercise 3.2: Highest and lowest values
Create ArrayStatistics. Use an array of at least six integers to find the largest value, smallest value, and number of elements.
Challenge: Count how many values are greater than or equal to 50.
 */
package org.example;

public class ArrayStatistics {


    int[] justNums = {1,2,3,4,5,6};

    public void largeSmallValue(){
        int largeNum = justNums[0];
        int smallNum =justNums[0];
        int counteven=0;
        int countodd=0;
        for(int i=0; i< justNums.length; i++){
          if (justNums[i] <= smallNum){
              smallNum = justNums[i];
          }
          if(justNums[i] >= largeNum)
          {
              largeNum = justNums[i];
          }
          if(justNums[i] % 2 == 0){
              counteven ++;
          }
          else{
              countodd++;
          }

        }
        System.out.println("Smallest Number is " + smallNum);
        System.out.println("Largest Number is " + largeNum);
        System.out.println("Number of even numbers is " + counteven);
        System.out.println("Number of odd numbers is " + countodd);
    }
}
