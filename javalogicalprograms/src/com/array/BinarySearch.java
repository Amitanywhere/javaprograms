package com.array;

public class BinarySearch {

    public static void main(String[] args) {

        int[] numsArr = {23 , 27 , 76 , 198 , 453 , 764};
        int target = 198;

        int resultIndex = solution(numsArr , target);
        System.out.println("Result index - " + resultIndex);
    }

    public static int solution(int[] nums , int target){
        int resultIdx = -1;
        int left =0 , right=nums.length-1;
        int mid = (left + right) / 2;
        while(left <= right){
            if(nums[mid] == target){
                resultIdx = mid;
                break;
            }
            else if(nums[mid] > target){
                right = mid-1;
            }
            else{
                left = mid +1;
            }
            mid = (left + right) / 2;
        }
        return resultIdx;
    }
}
