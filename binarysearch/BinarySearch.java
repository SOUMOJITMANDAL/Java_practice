package com.binarysearch;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,target;
        System.out.println("Enter the size of the array:");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array :");
        for (int i = 0; i <n ; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        target = in.nextInt();
        int ans = binarysearch(arr,target);
        System.out.println("The target element is located at index: "+ans);
    }
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        // int mid = (start+end)/2; this can result in out of range in case on int in java
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;//ans found
            }
        }
        return -1;
    }
}
