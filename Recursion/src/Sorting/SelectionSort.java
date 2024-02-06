package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {4,3,2,8,1};
        System.out.println(Arrays.toString(selection(arr, arr.length,0,0)));
    }
    static int [] selection(int []arr, int length, int index,int max){
        if(length==0){
            return arr;
        }

        if(index<length){
            if(arr[index]>arr[max]){
                return selection(arr,length,index+1,index);
            } else{
                return selection(arr,length,index+1,max);
            }
        }

        int temp = arr[max];
        arr[max]=arr[length-1];
        arr[length-1]= temp;
        return selection(arr,length-1,0,0);


    }


}
