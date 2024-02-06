// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1

public class onetoN {
    public static void main(String[] args) {
        print(10);
    }

    static void  print(int n){
        if(n==0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
}
