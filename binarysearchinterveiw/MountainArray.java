package com.binarysearchinterveiw;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class MountainArray {
    public static void main(String[] args){

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end= arr.length -1;
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
}
