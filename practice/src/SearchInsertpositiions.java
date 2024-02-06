//https://leetcode.com/problems/search-insert-position/

public class SearchInsertpositiions {
    public static void main(String[] args) {
        int []nums = {1,3,5,6};
        System.out.println(search(nums,7));
    }

    static int search(int[] nums, int target){
        int s = 0;
        int e = nums.length-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if (target<nums[mid]) {
                e=mid-1;
            }
            else {
                s=mid+1;
            }
        }
        return s;
    }
}
