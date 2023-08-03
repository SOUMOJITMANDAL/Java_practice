package com.linearsearch;

import java.util.Scanner;

public class LinearSearch {
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
        search1(arr,target);
        System.out.println(search1(arr,target));
    }

    static int search1(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;
    }
}
