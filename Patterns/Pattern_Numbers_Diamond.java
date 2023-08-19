package com.Mindtree.Patterns;
import java.util.Scanner;
public class Pattern_Numbers_Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        pattern_num_1(n);
    }
    static  void pattern_num_1(int n){
        for (int row = 1; row <= 2*n-1 ; row++) {
     /*         1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
            3 2 1 2 3
              2 1 2
                1       */
            int t_col = row > n ? 2 * n - row : row;
            int t_spaces = n - t_col;
            for (int s = 0; s < t_spaces; s++) {
                System.out.print("  ");
            }
            for (int col = t_col; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= t_col ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
