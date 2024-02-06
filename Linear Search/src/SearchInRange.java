public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {23,34,56,232,654,766,4};
        //Range is lets say 2-6
        int range = 6;
        int element = 4;
        System.out.println("The element is in "+search(arr,range,element)+ "th index");
    }

    static int search(int [] arr, int range, int element){
        if(arr.length<6){
            return -1;
        }
        for (int i = 2; i <=range ; i++) {
            if (element==arr[i]){
                return i;
            }
        }
        return -1;
    }

}
