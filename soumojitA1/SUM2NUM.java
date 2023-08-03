package com.soumojitA1;

import java.util.Scanner;

public class SUM2NUM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(" ENTER THE FIRST NUMBER : ");
        float num1 = in.nextFloat();
        System.out.println(" ENTER THE SECOND NUMBER :");
        float num2 = in.nextFloat();
        System.out.println("The result is : " + (num1 + num2));
    }
}
