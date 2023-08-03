package com.Mindtree;
import java.util.Scanner;
public class Ass2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();

        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = s.nextInt();
            }

        }
        int sumRow, sumCol;
        for(int i = 0; i < row; i++){
            sumRow = 0;
            for(int j = 0; j < col; j++){
                sumRow = sumRow + arr[i][j];
            }
            System.out.println("Sum of the row " + i + " = " + sumRow);
        }
        for(int k = 0; k < col; k++){
            sumCol = 0;
            for(int l = 0; l < row; l++){
                sumCol = sumCol + arr[l][k];
            }
            System.out.println("Sum of the column " + k + " = " + sumCol);
        }
    }
}
