package com.soumojitA1;

import java.util.Scanner;

public class Gcd2number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, i, hcf = 0;
        System.out.println("Enter the first number:");
        a = in.nextInt();
        System.out.println("Enter the second number:");
        b = in.nextInt();
        for (i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf=i;
            }

        }
        System.out.println(hcf+" is the HCF/GCD of the numbers.");
    }
}
