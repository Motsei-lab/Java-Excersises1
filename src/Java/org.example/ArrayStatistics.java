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
