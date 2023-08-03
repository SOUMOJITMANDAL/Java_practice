package com.competitive;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int fact = 1;
            for (int j=n; j <0 ; j--) {
                fact=fact*j;
            }
            System.out.println(fact);
        }
    }
}
