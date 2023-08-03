package com.soumojitA1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float res = 0.0F;
        System.out.println("enter the number :");
        float n = in.nextFloat();
        System.out.println("enter the range :");
        int range = in.nextInt();
        for (int i = 0; i <= range; i++) {
            res = n * i;
            System.out.println( n + " * " + i + " = " +res );
        }
    }
}
