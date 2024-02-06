public class CeilingOfnumber {
    public static void main(String[] args) {
        int [] arr = {2,5,9,12,18,22,27,30};
        int target = 25;
        System.out.println(celing(arr,target));
    }
    static int celing(int []arr,int target){
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if (target<arr[mid]){
                end=mid-1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
