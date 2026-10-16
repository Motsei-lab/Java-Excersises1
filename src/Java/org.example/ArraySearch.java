/*
Exercise 3.3: Search an array
Create ArraySearch. Search an integer array for a target value. Display its index if found, or Value not found otherwise.
Challenge: Report every matching index if the target appears more than once.
 */

package org.example;

public class ArraySearch {
    int[] numbs = {2,4,10,6,8,10,100};
    int target = 10;
    boolean found = false;
    public void search(){
        for(int i=0; i< numbs.length; i++){
            if(numbs[i] == target){
                System.out.println("The value is at index: "+ i);
                found = true;
            }


        }
            if(!found) {
                System.out.println("The value cant be found");
            }
        }
    }

