package com.cyno;

public class CountNums {
    public static void main(String[] args) {
        int n = 16693523;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 2){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
