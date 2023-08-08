package com.Mindtree.leetcode;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a palindrome number: ");
        int x = in.nextInt();
        boolean res = pal(x);
        System.out.println(res);


    }
     static boolean pal(int x) {
        int rev =0;
        int check = x;
        while(x>0) {
            rev = (rev * 10) + (x%10);
            x /= 10;
        }
      return rev==check;
    }
}
