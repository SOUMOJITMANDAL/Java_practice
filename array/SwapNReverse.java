package com.array;

import java.util.Arrays;
import java.util.Scanner;
// swap and reverse integrated code
public class SwapNReverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i <n; i++) {
            arr[i]= in.nextInt();
        }
        //swap(arr, 2, 4);
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
    }
}
