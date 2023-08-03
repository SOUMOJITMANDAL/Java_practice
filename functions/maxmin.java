package com.functions;
import java.util.Scanner;
public class maxmin {
    public static void main(String[] args) {
        int first, second, third;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number :");
        first = in.nextInt();
        System.out.println("Enter second number :");
        second = in.nextInt();
        System.out.println("Enter the third number :");
        third = in.nextInt();
        smallest(first, second, third);
        largest(first, second, third);
        System.out.println("The largest of the three numbers are :" + largest(first, second, third));
        System.out.println("The smallest of the three numbers are :" + smallest(first, second, third));
    }
    static int largest(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;
    }
    static int smallest(int num1, int num2, int num3) {
        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }
        return min;
    }
}



