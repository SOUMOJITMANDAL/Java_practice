package com.Mindtree.Patterns;
import java.util.Scanner;
public class LeftAlignedPatterns {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the number of rows :");
        int n = in.nextInt();
        System.out.println();
        System.out.println("Pattern 1");
          pattern_1(n);
        System.out.println();
        System.out.println("Pattern 2");
          pattern_2(n);
        System.out.println();
        System.out.println("Pattern 2_or");
          pattern_2_Or(n);
        System.out.println();
        System.out.println("Pattern 3");
          pattern_3(n);
        System.out.println();
        System.out.println("Pattern 4");
          pattern_4(n);
        System.out.println();
        System.out.println("Pattern 5");
          pattern_5(n);
    }
    private static void pattern_5(int n) {
 /*  *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *                   */
        for (int row = 1; row <= 2*n - 1; row++) {
            int total_col = row>n ? 2*n-row: row;
            for (int col = 1; col <=total_col; col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private static void pattern_4(int n) {               /*  1
                                                             1 2
                                                             1 2 3
                                                             1 2 3 4 */
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col +" ");
            }
            System.out.println();
        }
    }


    private static void pattern_2_Or(int n) {                /*  * * * *
                                                                 * * *
                                                                 * *
                                                                 *        */
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= n+1-row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern_3(int n) {          /*  * * * *
                                                        * * * *
                                                        * * * *
                                                        * * * *  */
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern_2(int n) {                              /*  * * * *
                                                                    * * *
                                                                    * *
                                                                    *        */
        for (int row = 1; row <=n ; row++) {
            for (int col = n; col >= row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     static void pattern_1(int n){                           /*  *
                                                                 * *
                                                                 * * *
                                                                 * * * *   */
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
