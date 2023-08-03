package com.binarysearch;

import java.util.Scanner;

public class practiceagBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,target;
        n= in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = in.nextInt();
        }
        target = in.nextInt();

        System.out.println(oragbs(arr,target));

    }

     static int oragbs(int[] arr, int target) {
        int s= 0;
        int e = arr.length - 1;
        boolean isAsc = arr[s] < arr[e];
        while ( s <= e) {
            int mid = s + (e-s)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    e = mid-1;
                }
                else{
                    s = mid+1;
                }
            }
            else{
                if(target < arr[mid]){
                    s = mid+1;
                }
                else{
                    e= mid -1;
                }
            }
        }
         return -1;
     }
}
