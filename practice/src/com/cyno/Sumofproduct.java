package com.cyno;

import java.util.Scanner;

public class Sumofproduct {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pod = 1;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            pod = rem*pod;
            sum = rem+sum;
            n = n/10;
        }

    int diff = pod-sum;
        System.out.println("answer is: " + diff);

    }
}
