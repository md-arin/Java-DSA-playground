// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class Sumof1dArray03 {
    public static void main(String[] args) {
        int []nums = {1,2,3,4};
        System.out.println(Arrays.toString(sumofArray(nums)));
    }
    static int[] sumofArray(int []nums){
        int []ans = new int[nums.length];
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            ans[i]=sum;
        }
        return ans;
    }
}
