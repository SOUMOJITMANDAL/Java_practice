package com.Mindtree.binarysearch2Darray;

import java.util.Arrays;
import java.util.Scanner;

public class Prac2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r, c;
        System.out.println("Enter the number of rows:");
        r = in.nextInt();
        System.out.println("Enter the number of columns:");
        c = in.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the elements of the 2D array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the element to be searched");
        int target = in.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println("The element is located at "+Arrays.toString(search2D(arr,target)));
    }

    static int[] search2D(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length-1 && c >=0) {
            if (arr[r][c]== target){
                return new int[]{r,c};
            }
            else if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1};
    }
}
