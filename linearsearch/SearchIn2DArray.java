package com.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of row:");
        int n = in.nextInt();
        System.out.println("Enter the size of column:");
        int m = in.nextInt();
        int[][] arr = new int[n][m];
        System.out.println("Enter the element to be searched for:");
        int target = in.nextInt();
        System.out.println("Enter the elements of the 2D array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        search1(arr, target);
        max2D(arr);
        min2D(arr);
        System.out.println(Arrays.toString(search1(arr,target)));
        System.out.println(max2D(arr));
        System.out.println(min2D(arr));
    }

     static int min2D(int[][] arr) {
        int min = arr[0][0];
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 if (arr[i][j] < min) {
                     min = arr[i][j];
                 }
                 return min;
             }
         }
         return Integer.MAX_VALUE;
    }

    static int max2D(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>max) {
                    max= arr[i][j];
                }
                    return max;
                }
            }
        return -1;
    }


    static int[] search1(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int element = arr[i][j];
                if (element == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}