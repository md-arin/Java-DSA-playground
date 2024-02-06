package com.cyno;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 1;
        int n = in.nextInt();

        for (int count = 2; count<=n; count++){
             int temp = b;
             b= b+a;
             a= temp;
        }
        System.out.println(b);
    }
}
