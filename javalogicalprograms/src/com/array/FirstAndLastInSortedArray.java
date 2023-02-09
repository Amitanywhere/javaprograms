package com.array;

public class FirstAndLastInSortedArray {

    public static void main(String[] args) {
        int[] numsArr = {23 , 34 , 37 , 65 , 65 , 65 , 89};

        int target = 65;
        int[] resArr = solution(numsArr , target);
        System.out.println("Result index - ");
        for(int element : resArr){
            System.out.println(element);
        }
    }

    private static int[] solution(int[] nums , int target){
        int[] resIndex =  {-1 , -1};

        int left = 0 , right = nums.length-1;

        int mid = (left + right)/2;

        while(left <= right){
            if((mid == left || nums[mid] > nums[mid - 1]) && nums[mid] == target){
                resIndex[0] =mid;
                break;
            }
            else if(nums[mid] >= target){
                right--;
            }
            else{
                left++;
            }
            mid = (left + right) / 2;
        }

        left = 0;
        right = nums.length-1;
        mid = (left + right) / 2;
        while(left <= right){
            if((mid == right || nums[mid] < nums[mid+1]) && nums[mid] == target){
                resIndex[1] = mid;
                break;
            }
            else if(nums[mid] <= target){
                left++;
            }
            else{
                right--;
            }
            mid = (left + right) / 2;
        }
        return resIndex;
    }
}
