public class Palindrome {
    public static void main(String[] args) {
        System.out.println(palindrome(56));
    }

    static int palindrome(int n){

       return  sum(n);

    }

    static int sum(int n){
        if(n<1){
            return 0;
        }
       int rem = n%10;
       return rem + sum(n/10);
    }

}
