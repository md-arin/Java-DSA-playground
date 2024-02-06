public class OrderAgnosticBS {
    public static void main(String[] args) {
        int [] arr = {99,85,57,47,43,34,32,23,21,14,10,8,1,-3,-12};
        int target= 23;
        System.out.println(OrderAgnostic(arr,target));
    }
    static int OrderAgnostic(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        //Checking whether the array is ascending or descending
        boolean isAsc = arr[start]<arr[end];

        while (start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                //Runs when array is Ascending
                if (target<arr[mid]){
                    end=mid-1;
                } else if (target>arr[mid]) {
                    start=mid+1;
                }
            }
            else {
                //Runs when Array is descending
                if (target>arr[mid]){
                    end=mid-1;
                } else if (target<arr[mid]) {
                    start=mid+1;
                }
            }

        }
        return -1;
    }

}
