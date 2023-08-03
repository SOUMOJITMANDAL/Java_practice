package com.soumojitA1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input a Year : ");
        long year = in.nextLong();
        int a;
        // USING TERNARY OPERATOR
        if (year != 0) {
            a = year % 400 == 0 ? 1 : year % 100 == 0 ? 0 : year % 4 == 0 ? 1 : 0;
            if (a == 1)
                System.out.println(year + "  is a Leap year :");
            else
                System.out.println(year + " is not a Leap year");

        } else {
            System.out.println(" Year ZERO doesn't exist : ");
        }
    }
}