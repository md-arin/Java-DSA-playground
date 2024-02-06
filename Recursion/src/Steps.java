
//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class Steps {
    public static void main(String[] args) {
        System.out.println(numOfStep(14));
    }

    static int numOfStep(int n){
        return helper(n,0);
    }

    private static int helper(int n, int c) {
        if(n==0){
            return c;
        }
        if(n%2!=0){
            return helper(n-1,c+1);
        } else {
            return helper(n/2,c+1);
        }
    }
}
