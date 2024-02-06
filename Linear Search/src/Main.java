// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {12,23,43,53,50,64,24,27};
        int target = 1;
        System.out.println(linearSearch(arr,target));
        }
        static int linearSearch(int [] arr, int target){
        for(int index = 0; index<arr.length; index++){
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
        return -1;
        }

    }
