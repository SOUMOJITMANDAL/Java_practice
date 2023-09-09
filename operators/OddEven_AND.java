package com.Mindtree.operators;

import java.util.Scanner;

public class OddEven_AND {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number to be determined even or odd :");
        int n = in.nextInt();
        System.out.println("True means the number is odd else even. The answer is "+isOdd(n));
    }
    public  static boolean isOdd(int n){
        return ((n&1) == 1);
    }

}
