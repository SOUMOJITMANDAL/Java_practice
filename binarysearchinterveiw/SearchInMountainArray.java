package com.binarysearchinterveiw;
//https://leetcode.com/problems/find-in-mountain-array/
public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr ={1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int ans = search(arr,target);
        System.out.println("ans="+ans);
    }
    static int search(int[]arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry= oragbinarysearch(arr,target,0,peak);
        if(firstTry!= -1){
            return firstTry;
        }
        return oragbinarysearch(arr,target,peak+1,arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start +(end-start)/2;
            //check 1 - if the middle element in the array is greater than the next element, ie, we are iin the decreasing part of the array,ie, we need to check the left hand side of the array hence end=mid
            if(arr[mid]>arr[mid+1]){
                end=mid;
                // check 2 - if the mid element is less than the next element,ie, we are in the ascending part of the array,ie we need to check the right hand side hence start=mid+1
            }else{
                start= mid+1;
            }
        }
        return start; //we can also return end since the start=end will both point to the peak element in the array
    }
    static int oragbinarysearch(int[] arr, int target, int start, int end) {
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
