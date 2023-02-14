package com.array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public static void main(String[] args) {
        int[] numberArray = {3 , 4 , 2 , 6 , 7};
        int target = 12;

        List<List<Integer>> result = combinationSum(numberArray , target);
        System.out.println(result);
    }

    private static List<List<Integer>> combinationSum(int[] numArr , int target){
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combList = new ArrayList<>();
        int index = 0;
        backTrack(numArr , target , index , result , combList);
        return result;
    }

    private static void backTrack(int[] numArr , int target , int index , List<List<Integer>> resultList , List<Integer> tempList){
        if(target == 0){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        if(target < 0){
            return;
        }

        for(int idx = index; idx < numArr.length; idx++){
            tempList.add(numArr[idx]);
            backTrack(numArr , target - numArr[idx] , idx , resultList , tempList);
            tempList.remove(tempList.size()-1);
        }
    }

}
