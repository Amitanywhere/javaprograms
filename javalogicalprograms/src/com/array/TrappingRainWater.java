package com.array;

public class TrappingRainWater {

    public static void main(String[] args) {
        int[] lengthArr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int trapedWater = solution(lengthArr);
        System.out.println("Trapped water = " + trapedWater);
    }

    private static int solution(int[] arr){
        int result = 0;
        int leftIdx = 0 , rightIdx = arr.length - 1 , leftMax = 0 , rightMax = 0;

        while(leftIdx <= rightIdx){
            if(arr[leftIdx] <= arr[rightIdx]){
                if(arr[leftIdx] > leftMax){
                    leftMax = arr[leftIdx];
                }
                else{
                    result += leftMax - arr[leftIdx];
                }
                leftIdx++;
            }
            else{
                if(arr[rightIdx] > rightMax){
                    rightMax = arr[rightIdx];
                }
                else{
                    result += rightMax - arr[rightIdx];
                }
                rightIdx--;
            }
        }
        return result;
    }
}
