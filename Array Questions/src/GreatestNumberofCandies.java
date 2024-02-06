// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberofCandies {
    public static void main(String[] args) {
        int [] candies = {2,3,5,1,3};
        int extraCandies = 3;
        // Find greates number in the array add extra candies and return
        // if the sum is greater than the greaatest of the given array
        System.out.println(kidsWithCandies(candies,extraCandies));
   }
    static List<Boolean> kidsWithCandies(int[] candies, int extra){
        int greatestNum=0;
        List<Boolean> res = new ArrayList<>();
        for(int i = 0; i< candies.length;i++){
            if(candies[i]>greatestNum){
                greatestNum = candies[i];
            }
            int extraCandies=candies[i]+extra;
            if (extraCandies>greatestNum){
                res.add(true);
            } else {
                res.add(false);
            }
        }
       return res;
   }
}

