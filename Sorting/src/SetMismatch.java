//https://leetcode.com/problems/set-mismatch/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMismatch {
    public static void main(String[] args) {
        int [] arr = {3,4,-1,1};
        System.out.println(missingNum(arr));
    }

    static int[] missingNum(int [] nums){
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i , correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }
    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]= temp;
    }
}
