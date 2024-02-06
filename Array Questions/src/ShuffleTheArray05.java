// https://leetcode.com/problems/shuffle-the-array/description/

import java.util.Arrays;

public class ShuffleTheArray05 {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums,4)));
    }
    static int[] shuffle(int[] nums, int n){
        n=4;
        int [] ans =new int[nums.length];
        int count = 0;
        for(int i = 0; i<n; i++){
            ans[count]=nums[i];
            ans[count+1] = nums[i+n];
            count+=2;
        }
        return ans;
    }

}
