package com.binarysearch;

import java.util.Scanner;

public class FloorofaNumber{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n,target;
        System.out.println("Enter the size of the array:");
        n= in.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i <n; i++) {
            arr[i]= in.nextInt();
        }
        System.out.println("Enter the target element:");
        target= in.nextInt();
        int ans= floor(arr,target);
        System.out.println("Floor of the number="+ans);
    }
    static int floor(int[] arr, int target)
    {
        int start,end;
        start=0;
        end=arr.length-1;
        while(start<=end){
           int  mid= start+(end-start)/2;
           if(target<arr[mid]){
               end=mid-1;
           } else if (target>arr[mid]) {
               start= mid+1;
           }else {
               return mid;
           }
        }
        return end;
    }
}
