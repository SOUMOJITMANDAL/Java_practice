package com.binarysearch;

import java.util.Scanner;

public class OrderagnosticBS {
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
        int ans = oragbinarysearch(arr,target);
        System.out.println("The target element is located at index: "+ans);
    }
    static int oragbinarysearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        // int mid = (start+end)/2; this can result in out of range in case on int in java
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
                else {
                    if(target>arr[mid]){
                        end=mid-1;
                    }else {
                        start=mid+1;
                    }
                }
            }
        return -1;
    }
}
