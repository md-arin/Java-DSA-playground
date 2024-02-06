package Searching;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,5,3,2,56};
        System.out.println(LS(0,arr,56));
        System.out.println(findIndex(0,arr,56));
//        findAllindex(0,arr,3);
//        System.out.println(list);
        System.out.println(findAllindeex(0,arr,3,new ArrayList<>()));

    }

    static boolean LS(int i, int [] arr,int target){
        if(i>arr.length-1){
            return false;
        }

        return arr[i]==target || LS(i+1,arr,target);
    }

    static int findIndex(int i, int [] arr, int target){
        if(i==arr.length){
            return -1;
        }

        if(arr[i]==target){
            return i;
        }
        return findIndex(i+1,arr,target);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void findAllindex(int i, int [] arr, int target){
        if(i==arr.length){
            return ;
        }

        if(arr[i]==target){
            list.add(i);
        }
        findAllindex(i+1,arr,target);
    }

    static ArrayList<Integer> findAllindeex(int i, int []arr, int target, ArrayList<Integer> list){
        if(i==arr.length){
            return list;
        }

        if(arr[i] == target){
            list.add(i);

        }
        return findAllindeex(i+1,arr,target,list);
    }
}
