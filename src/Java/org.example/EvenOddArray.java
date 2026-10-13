package org.example;

public class EvenOddArray {
    int[] numbers = {1,2,3,4,5,6,7,8,9,10};
    int[] countEvenA;
    int countEven;
    int[] countOdd;

    public void arrays(){
        for (int i=0; i< numbers.length;i++){
            if(numbers[i] %2 ==0){
                countEven ++;
                numbers[i] = countEvenA;
            }
        }
    }
}
