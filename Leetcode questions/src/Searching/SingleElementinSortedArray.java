package Searching;


// https://leetcode.com/problems/single-element-in-a-sorted-array/

public class SingleElementinSortedArray {
    public static void main(String[] args) {
        int [] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(findElement(nums));
    }

    static int findElement(int[] nums){
        int s = 0;
        int e= nums.length-1;
        int ans = 0;
        while (s<=e){
            int mid = s+ (e-s)/2;
            if(nums[mid]==nums[mid-1]){
                e=mid-1;
            }
            else if (nums[mid]==nums[mid+1]){
                s=mid+1;
            }
            else {
                 ans = mid;
            }
        }
        return ans;
    }

}
