// https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class Permutation01 {
    public static void main(String[] args) {

            int [] nums= {0,2,1,5,3,4};
            System.out.println(Arrays.toString(permutation(nums)));
        }


        static int[] permutation(int[] nums){
            int []arr=new int[nums.length];

            for (int i = 0;i< nums.length;i++){
                arr[i]=nums[nums[i]];
            }
            return arr;
    }
}