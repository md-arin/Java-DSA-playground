// https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class ConcatenationOfArray02 {
    public static void main(String[] args) {
        int []nums = {1,3,2,1};
        System.out.println(Arrays.toString(concat(nums)));
    }

    static int[] concat(int[] nums){
        int n = nums.length;
        int []ans = new int[n*2];

        for (int i = 0;i<2*n;i++){
            ans[i]=nums[i%n];
        }
        return ans;
    }

}
