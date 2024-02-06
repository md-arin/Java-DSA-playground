package com.cyno;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter a 3 digit number: ");
//        int a = in.nextInt();
        System.out.println("All 3 digit armstrong numbers are: ");
        for (int i= 100; i<1000; i++){
           if (isArmstrong(i)){
               System.out.print(i+ ",");
           }
        }

    }

    static boolean isArmstrong(int a){
        int original = a;
        int sum=0;
        while (a>0){
            int rem = a%10;
            a= a/10;
            sum = sum + rem*rem*rem;

        }
        return sum == original;
//        if (a==sum){
//            return true;
//        } else {
//            return false;
//        }

    }
}
