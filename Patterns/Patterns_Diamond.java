package com.Mindtree.Patterns;
import java.util.Scanner;
public class Patterns_Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern_Diamond(n);
        System.out.println();
        System.out.println();
        pattern_Diamond_Or(n);
    }
    static void pattern_Diamond_Or(int n) {
        for (int row = 1; row <= 2*n-1; row++) {
            int t_col = row > n ? 2* n - row : row ;
            int spaces = n - t_col ;
            for (int s = 1; s <= spaces ; s++) {
                System.out.print(" ") ;
            }
            for (int col = 1; col <= t_col ; col++) {
                System.out.print("* ") ;
            }
            System.out.println() ;
        }
    }


    static  void  pattern_Diamond(int n){                                /*       *
                                                                                 * *
                                                                                * * *
                                                                               * * * *
                                                                              * * * * *
                                                                               * * * *
                                                                                * * *
                                                                                 * *
                                                                                  *       */
        for (int row = 1; row <= 2*n-1; row++) {
            int spaces = row < n ? n - row : row- n;
            for (int s = 1; s <= spaces ; s++) {
                System.out.print(" ");
            }
            int t_col = row > n ? 2* n -row : row ;
            for (int col = 1; col <= t_col ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
