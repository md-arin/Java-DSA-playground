// https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 2147483647;
        System.out.println(isPerfectSquare(num));
    }

  static boolean isPerfectSquare(int num) {
            int start = 1;
            int end = num;
//            if (num==1){
//                return true;
//            }
            while(start<=end){
                long mid = start + (end-start)/2;
                if(mid*mid >num){
                    end= (int) mid-1;
                } else if (mid*mid < num) {
                    start= (int) mid+1;
                }
                else{
                    return true;
                }
            }
            return false;
    }
}
