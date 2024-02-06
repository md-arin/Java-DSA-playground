public class maximuminArray {
    public static void main(String[] args) {

    }

    static int maximum(int []arr,int i,int max){

        if(i>arr.length-1){
            return max;
        }
        if(arr[i]>arr[i+1]){
            return max=arr[i];
        }
        return maximum(arr,i+1,max);
    }

}
