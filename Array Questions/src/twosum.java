public class twosum {
    public static void main(String[] args) {
        int [] arr = {2,7,10,12};
        System.out.println(twoSum(arr,9));


    }

        static int[] twoSum(int[] nums, int target) {
            int start = 0;
            int end = nums.length-1;
            while(start<end){
                int mid = start + (end-start)/2;
                if( (nums[mid]+nums[mid-1]) > target){
                    end = mid;
                } else if (nums[mid]+nums[mid-1] == target) {
                    return new int[]{mid,mid-1} ;
                } else{
                    start = mid;
                }
            }
            return new int[]{-1,-1} ;

    }
}
