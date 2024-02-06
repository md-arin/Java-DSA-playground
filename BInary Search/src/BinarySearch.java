// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BinarySearch {
    public static void main(String[] args) {
      int [] arr = {-23,-18,-4,0,6,15,24,46,52,78,95,123,256,789};
      int target= 95;
        System.out.println(binarySearch(arr,target));
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }

}