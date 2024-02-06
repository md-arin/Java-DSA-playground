public class LSrecursion {
    public static void main(String[] args) {
        int []arr = {4,56,2,53};
        System.out.println(Ls(arr,0,2));
    }

    static int Ls(int[]arr, int index, int target){
        if(index>arr.length-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else {
            return Ls(arr,index+1,target);
        }
    }
}
