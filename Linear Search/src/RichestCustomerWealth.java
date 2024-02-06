// https://leetcode.com/problems/richest-customer-wealth/?envType=daily-question&envId=2023-09-01

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {2,4},
                {3,9},
                {4,7}
        };
        System.out.println(wealth(arr));
    }
    static int wealth(int [][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            int rowsum = 0;
            for (int anInt : ints) {
                rowsum += anInt;
                if (rowsum > max) {
                    max = rowsum;
                }
            }
        }
        return max;
    }
//    static int calculateWealth(int [] arr){
//        int sum =0;
//    for (int i=0;i<arr.length;i++){
//        sum+=arr[i];
//    }
//    return sum;
//    }
//

}



