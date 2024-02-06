
// https://leetcode.com/problems/add-digits/?envType=daily-question&envId=2023-09-01

public class AddDigits {
    public static void main(String[] args) {
        int digit=38;
        int calculatesum = calculatesum(digit);


//        int count=numOfdigits(digit);
//        if (count>1){
//            while(digit>0){
//                int rem = digit%10;
//                sum+=rem;
//                digit=digit/10;
//            }
//        }


    }

    static int calculatesum(int digit){
        int sum = 0;
        int count=numOfdigits(digit);
        if (count>1){
            while(digit>0){
                int rem = digit%10;
                sum+=rem;
                digit=digit/10;
            }
        }
        return sum;
    }

    static int numOfdigits(int n){
        int count=0;
        while(n>0){
            count++;
            n=n/10;
        }
        return count;
    }

}
