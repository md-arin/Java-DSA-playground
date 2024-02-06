package com.cyno;

import java.util.Arrays;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {2,5,35,6,7,4};
        swap(arr, 0, 1);

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int [] arr, int index1, int index2 ){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
