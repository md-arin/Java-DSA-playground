// https://practice.geeksforgeeks.org/problems/repeated-sum-of-digits3955/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab


public class SumOfDigits {
    public static void main(String[] args) {
        int n = 9767;

        System.out.println(sum(n));

    }


    static int sum(int n){
        if(n%9==0){
            return 9;
        }
        else {
            return n%9;
        }
    }
//    static int sumofDigits(int n){
//        if(n==0){
//            return 0;
//        }
//        return n%10 +sumofDigits(n/10);
//    }
//
//    static int sum(int n){
//        int digisum = sumofDigits(n);
//        if(digisum<10){
//            return digisum;
//        } else {
//            return sumofDigits(digisum);
//        }
//    }
}
