package com.array;

import java.util.Scanner;

public class MaxRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i <n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println(Range(arr,2,6));
    }
    static int Range(int[] arr , int start , int end ) {
        //edge cases
        if(end>start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        if(arr.length == 0){
            return -1;
        }
        int maxval = arr[start];
        for (int i = start; i <=end ; i++) {
            if(arr[i]>maxval)
                maxval= arr[i];
        }
        return maxval;
    }
}
