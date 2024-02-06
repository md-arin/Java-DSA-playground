// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSumSorted {
    public static void main(String[] args) {
        int [] nums = {2,3,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

   static int[] twoSum(int[] nums, int target) {
       int start = 0;
       int end = nums.length-1;
       while(start<end){
           if( (nums[start]+nums[end]) > target){
               end--;
           } else if (nums[start]+nums[end] < target) {
               start++;

           } else{
               return new int [] {start+1,end+1};
           }
       }
       return new int[]{};
    }
}
