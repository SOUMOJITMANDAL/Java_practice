package com.Mindtree.bubblesort;

import java.util.Arrays;
import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i]= in.nextInt();
        }
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        int temp=0;
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length -i ; j++) {
                if (arr[j]<arr[j-1]) {
                    temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
         if(!swapped){
            break;
         }
        }
    }
}
