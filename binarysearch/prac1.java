package com.binarysearch;

import java.util.Scanner;
//user input ceiling of the number
public class prac1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int target,i,n;
        System.out.println("Enter the size of the array:");
        n= in.nextInt();
        System.out.println("input the elements:");
        int []arr= new int[n];
        for (i = 0; i <n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target element to be searched for ");
        target = in.nextInt();
        int ans =Ceiling1(arr,target);
        System.out.println("Ceiling of the target number is located at index:"+ans);
    }
     static int Ceiling1(int[] arr, int target) {
        int start= arr[0];
        int end= arr.length;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end= mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return start;
    }
}
