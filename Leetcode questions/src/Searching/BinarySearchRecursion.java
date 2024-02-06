package Searching;

//https://leetcode.com/problems/binary-search/description/

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int []arr = {3,5,67,45,76,98,599};
        System.out.println(bs(arr,45));
    }

    static int bs(int[] nums, int target){
        if(nums.length==0){
            return -1;
        }
        return search(nums,0,nums.length-1,target);
    }
    static int search(int[]arr, int s, int e,int target){
        if(s>e){
            return -1;
        }
        int mid = s+(e-s)/2;
        if(target==arr[mid]){
            return mid;
        }
        if(target>arr[mid]){
            return search(arr,mid+1,e,target);
        }
        return search(arr,s,mid-1,target);
    }
}
