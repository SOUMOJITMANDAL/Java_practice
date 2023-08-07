package com.Mindtree.selectionsort;

import java.util.Arrays;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length -i -1;
            int maxIndex = getMaxIndex(arr,0,end);
            swap(arr,maxIndex,end);
        }
    }
    static int getMaxIndex(int[] arr, int start, int end) {
        int max= start;
        for (int i = start; i <=end; i++) {
            if(arr[max]<arr[i]){
                max= i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr [second]=temp;
    }
}
