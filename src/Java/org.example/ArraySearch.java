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

