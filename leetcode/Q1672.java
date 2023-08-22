package com.Mindtree.leetcode;
import java.util.Scanner;
// https://leetcode.com/problems/richest-customer-wealth/description/
public class Q1672 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int n = in.nextInt();
        System.out.println("Enter the number of columns :");
        int m = in.nextInt();
        int[][] accounts  = new int[n][m];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                accounts[i][j]=in.nextInt();
            }
        }
        System.out.println(maximumWealth(accounts));

    }
    public static int maximumWealth(int[][] accounts) {
        int maxwealth = accounts[0][0];
//        int sum = 0;
        for ( int[] row : accounts) {    // using for-each loop where row is an integer array in matrix of accounts
            int sum = 0;                 // sum reset to zero after each iteration of a complete row
            for ( int j : row) {         // element(j) in each row array of matrix accounts
                sum += j;                // sum = sum + element in each column of a single row
            }
            if(sum>maxwealth){
                maxwealth=sum;
            }
        }
        return maxwealth;
    }
}
