package com.array;

import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array");
        int arrSize = input.nextInt();
        int[] numsArr = new int[arrSize];

        for(int idx=0; idx<arrSize; idx++){
            System.out.println("Enter element of index - " + idx);
            numsArr[idx] = input.nextInt();
        }
        System.out.println("Enter target value");
        int target = input.nextInt();
        int[] resArr = solution(numsArr , target);
        System.out.println("Result Array");
        for(int element : resArr){
            System.out.println(element);
        }
    }

    public static int[] solution(int[] nums , int target){
        int[] resArr = new int[2];

        for(int index=0; index<nums.length-1; index++){
            for(int idx=index+1; idx < nums.length; idx++){
                if(nums[index] + nums[idx] == target){
                    resArr[0] = index;
                    resArr[1] = idx;
                    break;
                }
            }
        }
        return resArr;
    }
}
