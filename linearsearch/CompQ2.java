package com.linearsearch;
import java.util.Scanner;

public class CompQ2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n = in .nextInt();
        System.out.println("Enter the number of columns");
        int m = in.nextInt();
        int [][] arr = new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                System.out.println("Enter the digits of the 2D array");
                arr[i][j]= in.nextInt();
            }
        }
        MaximumWealth(arr);
        System.out.println(MaximumWealth(arr));
    }
     static int MaximumWealth(int[][] arr) {
        int max = Integer.MIN_VALUE;
         for (int i = 0; i < arr.length; i++) {
             int sum=0;
             for (int j = 0; j <arr[i].length; j++) {
                 sum = sum + arr[i][j];
             }
             if (sum>max){
                 max=sum;
             }
         }
         return  max;
    }
}
