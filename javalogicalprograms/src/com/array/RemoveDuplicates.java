package com.array;

public class RemoveDuplicates {

    // remove duplicates from sorted array
    public static void main(String[] args) {
        int[] nums = {2 , 2 , 6 , 7 , 9 , 9 , 12 , 14 , 14 , 16};

        // in this solution return the length upto which unique element present in array
        int modifiedLength = solution(nums);
        for(int indx=0; indx<modifiedLength; indx++){
            System.out.println(nums[indx]);
        }
    }

    private static int solution(int[] nums){

        int left = 0 , right = 0;
        while(right < nums.length){
            if(nums[left] != nums[right]){
                nums[left+1] = nums[right];
                left++;
            }
            right++;
        }
        return left+1;
    }
}
