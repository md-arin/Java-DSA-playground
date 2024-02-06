// https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexMountain {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,6,4,3,2};
        int index = PeakIndex(arr);
        System.out.println("Maximum number is "+arr[index]+ " and it is at "+index+" index");
    }
    static int PeakIndex(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //we are at the descending part of the array
                //this might be the answer but look at left
                //this is why end != mid-1
                end=mid;
            } else {
                //we are at the ascending part of the array
                start=mid+1; // because mid+1>mid element;
            }
        }
        //in the end start and end both the pointers will be pointing to the largest numbers because ofg 2 checks above
        return start;
    }
}
