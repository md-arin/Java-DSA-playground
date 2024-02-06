package Searching;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int [] arr = {5, 6, 8, 1,2,3};
        System.out.println(search(arr,0,arr.length-1,3));
    }

    static int search (int []arr, int s,int e,int target){
      if(s>e){
          return -1;
      }
      int m = s+ (e-s)/2;
      if (target==arr[m]){
          return m;
      }

      if(arr[s]<arr[m]){
          if(target<=arr[m] && target>=arr[s]){
              return search(arr,0,m-1,target);
          }
          return search(arr,m+1,e,target);
      }
      if(target>=arr[m] && target<=arr[e]){
          return search(arr,m+1,e,target);
      }
      return search(arr,s,m-1,target);
    }
}
