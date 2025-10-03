// Question
//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

package twosum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test 1
        int[] input1 = {2, 7, 11, 15};
        int expOutput1 = 9;
        //
        int[] resultArr = sol.twoSum(input1, expOutput1);
        if(resultArr == null)
            System.out.println("Not found");
        else
            System.out.println("Result:"+ Arrays.toString(resultArr));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}


