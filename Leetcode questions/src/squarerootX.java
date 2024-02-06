// https://leetcode.com/problems/sqrtx/

public class squarerootX {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(sqrt(x));
    }

    static int sqrt(int x){
        long start = 1;
        long end = x;
        long ans =0;
        while(start<=end){
            long mid = start + (end-start)/2;
            if(mid*mid ==x){
                ans=(int)mid;
                // ans is found now we have to break the loop
                break;
            } else if (mid*mid < x) {
                start = mid+1;
                ans=mid;
            }else{
                end=mid-1;
            }
        }
        return (int) ans;
    }
}
