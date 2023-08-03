package com.linearsearch;

import java.util.Scanner;

public class SearchInRange {
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
        System.out.println("Enter the starting index to search for");
        int start = in.nextInt();
        System.out.println("Enter the ending index to search for");
        int end = in.nextInt();
        search1(arr,target,start,end);
        System.out.println("The element is located at the index:"+search1(arr,target,start,end));
    }

    static int search1(int[] arr, int target, int start , int end) {
        if(arr.length==0){
            return -1;
        }
        for (int index =start; index < end; index++) {
            int element = arr[index];
            if (element==target){
                return index;
            }
        }
    return -1;
    }
}

