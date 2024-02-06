public class sumofdigits {
    public static void main(String[] args) {
        int ans = sum(1723);
        System.out.println(ans);
    }

    static int sum(int n){
        if(n<1){
            return 0;
        }
        int rem = n%10;
        return rem + sum(n/10);
    }
}
