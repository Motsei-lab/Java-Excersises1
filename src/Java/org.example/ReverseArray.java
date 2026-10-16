/*
Create ReverseArray. Display the array in reverse order without changing the original array.
Challenge: Reverse the array in place by swapping elements.
 */
package org.example;

import java.util.ArrayList;

public class ReverseArray {
    String[] foods= {"Burger","Fries","Pizza","Ice-Cream","Dagwood"};
    ArrayList<String> revFood = new ArrayList<>();
    public void reverse(){
        for(int index= foods.length -1; index >=0; index--){
            revFood.add(foods[index]);
        }

        System.out.println("reversedList: " +revFood);
    }

}
