import java.util.Arrays;
import java.util.Scanner;

public class Searchin2dArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = {
                {2,4,78,},
                {23,654,26,76},
                {564,25,463,326,56},
                {34,365,764,25,36,3,677,43,5},
                {3,456,732,76,47}
        };
        System.out.println("Search for: ");
        int target = in.nextInt(); //Search using user input
        int [] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr,int target){
        for (int row=0; row< arr.length;row++){
            for (int col = 0;col<arr[row].length; col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

}
