package com.linearsearch;

import java.util.Scanner;

public class MinMaxValInRange {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i <n; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the starting index to be searched for :");
        int start = in.nextInt();
        System.out.println("Enter the ending index:");
        int end = in.nextInt();
        MinValInRange(arr,start,end);
        MaxValInRange(arr,start,end);
        System.out.println("The min value in range given:"+MinValInRange(arr,start,end));
        System.out.println("The max value in range given:"+MaxValInRange(arr,start,end));

    }

    static int MaxValInRange(int[] arr, int start, int end) {
        if(arr.length==0){
            return -1;
        }
        int element = arr[0];
        for (int i = start; i <end ; i++) {
            if(element<arr[i]){
                element=arr[i];
            }

        }
        return element;
    }

    static int MinValInRange(int[] arr, int start, int end) {
        if(arr.length==0){
            return -1;
        }
        int element = arr[0];
         for (int i = start; i <end ; i++) {
             if(element>arr[i]){
                 element=arr[i];
             }

         }
         return element;
     }
}
