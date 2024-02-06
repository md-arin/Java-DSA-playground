package Searching;

public class FIndArraysorted {
    public static void main(String[] args) {
        int n = 0;
        int [] arr = {1,3,10,6,8,9};
        System.out.println(isSorted(n,arr));
    }



    static boolean isSorted(int n, int[] arr){
        if(n==arr.length-1){
            return true;
        }

        return arr[n]<arr[n+1] && isSorted(n+1,arr);
    }
}
