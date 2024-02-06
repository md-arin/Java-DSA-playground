
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int [] arr = {23,54,775,2312,1,4,24233};

        System.out.println(findnumbers(arr));
    }
    static int findnumbers(int [] arr){
        int count=0;
        for (int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
            int digits=numberOfdigits((num));
           return digits%2==0;
    }

    static int numberOfdigits(int n){
        if(n<0){
            n=n*-1;
        }
        if (n==0){
            return 1;
        }
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }
}
