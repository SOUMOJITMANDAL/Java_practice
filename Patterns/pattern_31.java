package com.Mindtree.Patterns;
import java.util.Scanner;
public class pattern_31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the max number to be included in the pattern :");
        int n = in.nextInt();
        pattern_31_sol(n);
    }
    private static void pattern_31_sol(int n) {
        int OiginalN = n;
        n = 2*n ;
        for ( int row = 0; row <= n; row++){
            for (int col = 0; col <= n ; col++) {
                int AteveryIndex = OiginalN - Math.min(Math.min(row,col),Math.min(n - row, n - col));
                System.out.print(AteveryIndex + " ");
            }
            System.out.println();
        }
    }
}
