package org.example;

import java.util.ArrayList;

public class EvenOddArray {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    int countOdd;
    int countEven;
    ArrayList<Object> oddNums = new ArrayList<>();
    ArrayList<Object> evenNums = new ArrayList<>();

    public void arrays(){
        for (int i=0; i< numbers.length;i++){

            if(numbers[i] % 2 ==0){
               evenNums.add(numbers[i]);
                countEven ++;
            }
            else{
                oddNums.add(numbers[i]);
                countOdd++;
            }

        }


        System.out.println("numbers that are even are: " + countEven);
        System.out.println(evenNums);
        System.out.println("numbers that are odd are: " + countOdd);
        System.out.println(oddNums);

    }
}
