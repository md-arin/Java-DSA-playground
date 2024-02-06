package Searching;

public class BinarySerach {
    public static void main(String[] args) {
        int [] arr = {1,5,12,34,45,54,56,63,76,86};
        int ans = BS(arr,0,54, arr.length-1);
        System.out.println(ans);

    }

    static int BS(int [] arr, int start, int target, int end){
        if (start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if (target>arr[mid]){
            return BS(arr, mid+1, target,end);
        }
        return BS(arr, start, target, mid-1);
    }
}
