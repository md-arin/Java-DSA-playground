package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = {5,6,7,8,9,1,2,3,4};
        System.out.println(Arrays.toString(bubble(arr, arr.length - 1, 0)));
    }

    static int [] bubble(int [] arr,int iteration, int index){
        if(iteration==0){
            return arr;
        }
        if(index<iteration){
            if(arr[index]>arr[index+1]){
                swap(arr,index,index+1);
            }
            return bubble(arr,iteration,index+1);

        }

            return bubble(arr,iteration-1,0);

    }

    static void swap(int [] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
