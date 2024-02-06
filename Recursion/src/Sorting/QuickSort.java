package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {3,4,2,5,6,32};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[]arr, int lo, int hi){
        if(lo>=hi){
            return;
        }
        int s = lo;
        int e = hi;
        int mid= s+(e-s)/2;
        int pivot = arr[mid];

        while(s<=e){
            while (arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }

            if(s<=e){
                int temp = arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,lo,e);
        sort(arr,s,hi);
    }
}
