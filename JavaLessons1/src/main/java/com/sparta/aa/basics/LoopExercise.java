package com.sparta.aa.basics;

public class LoopExercise {
    public static void main(String[] args) {
        int[] myArr = {1,2,3};
        int result = sumOfArray(myArr);
        System.out.println(result); // Output should be 6

        int[] intArr = {1, 4, 2, 9, 42, 88, 3};
        System.out.println(findHighest(intArr));
    }

    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int item : arr) {
            sum += item;
        }
        return sum;
    }


    public static int findHighest(int[] intArray) {
        int highestNum = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > highestNum) {
                highestNum = intArray[i];
            }
        }
        return highestNum;
    }
}

