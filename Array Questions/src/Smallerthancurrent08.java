
// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class Smallerthancurrent08 {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(find(nums)));

    }

    static int[] find(int[]arr){
        sort(arr,0,arr.length-1);
        int [] ans = new int[arr.length-1];
        for(int i =0;i<arr.length-1;i++){
            ans[i]=i;
        }
        return ans;
    }

    static void sort(int []arr,int lo, int hi){
        if(lo>=hi){
            return;
        }
        int s = lo;
        int e = hi;
        int mid = s+ (e-s)/2;
        int pivot = arr[mid];
        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            if(s<=e){
            int temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
            }

            sort(arr,lo,e);
            sort(arr,s,hi);
        }
    }

}
