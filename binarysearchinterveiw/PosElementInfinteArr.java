package com.binarysearchinterveiw;
//
public class PosElementInfinteArr {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target = 100;
        System.out.println(searchRange(arr, target));
    }
    static int searchRange(int[] arr, int target) {
        //first find the range
        //start with box size of value 2
        int start = 0;
        int end = 1;
        // condition for target to lie in the range
        while (target > arr[end]) {
            int newS = end + 1;
            // double the box value
            // end= previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start=newS;
        }
        return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr, int target,int start,int end) {
        while(start <= end) {
            // int mid = (start+end)/2; this can result in out of range in case on int in java
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